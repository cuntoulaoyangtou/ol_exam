<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加角色</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="role" ref="role">
              <el-form-item label="角色名称">
                <el-input v-model="role.r_name"></el-input>
              </el-form-item>
              <el-form-item label="角色描述">
                <el-input v-model="role.r_comment"></el-input>
              </el-form-item>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">{{add?"添加":"更新"}}</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="14">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>所有角色</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="mGetRoles">刷新</el-button>
          </div>
          <div class="text item">
            <el-table
              :data="roles.filter(data => !search || data.r_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="r_id" width="60"></el-table-column>
              <el-table-column label="角色名称" prop="r_name"></el-table-column>
              <el-table-column label="角色描述" prop="r_comment"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除'+scope.row.r_name+'吗？'"
                      @onConfirm="handleDelete(scope.$index, scope.row)"
                    >
                      <el-button size="mini" type="danger" slot="reference">删除</el-button>
                    </el-popconfirm>
                  </template>
                </template>
              </el-table-column>
            </el-table>
            <el-pagination
              background
              layout="prev, pager, next"
              :total="page.total"
              :current-page="page.pageNo"
              :page-size="page.pageSize"
              @prev-click="prevClick"
              @next-click="nextClick"
              @current-change="currentChange"
            ></el-pagination>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import { addRole, updateRole, delRole, getRoles } from "@/api/role";
export default {
  name: "GetRole",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        r_name: null,
        total: 0
      },
      role: {
        r_id: null,
        r_name: "",
        r_comment: "",
      },
      roles: [],
      add: true,
      loading: false,
      search: ""
    };
  },
  created() {
    this.mGetRoles();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.role = row;
      this.add = false;
    },
    handleDelete(index, row) {
      this.mDelRole(row.r_id);
    },
    mGetRoles() {
      this.resetForm();
      getRoles(this.page)
        .then(res => {
          if (this.roles.length > 0) {
            this.roles.splice(0, this.roles.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            this.roles.push(item);
          });
        })
        .catch(() => {});
    },
    mAddRole() {
      addRole(this.role)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetRoles();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateRole() {
      delete this.role.grades;
      updateRole(this.role)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetRoles();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelRole(r_id) {
      delRole({ r_id: r_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetRoles();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddRole();
      } else {
        this.mUpdateRole();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.role = {
        r_id: null,
        r_name: "",
        r_comment: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetRoles();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetRoles();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetRoles();
    }
  }
};
</script>
