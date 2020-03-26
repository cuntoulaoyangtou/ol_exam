<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加学校</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="shool" ref="shool">
              <el-form-item label="学校名称">
                <el-input v-model="shool.s_name"></el-input>
              </el-form-item>
              <el-form-item label="经度">
                <el-input v-model="shool.s_longitude"></el-input>
              </el-form-item>
              <el-form-item label="纬度">
                <el-input v-model="shool.s_latitude"></el-input>
              </el-form-item>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">{{add?"添加":"更新"}}</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="14">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>所有学校</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="mGetShools">刷新</el-button>
          </div>
          <div class="text item">
            <el-table
              :data="shools.filter(data => !search || data.s_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="s_id" width="60"></el-table-column>
              <el-table-column label="学校名称" prop="s_name"></el-table-column>
              <el-table-column label="经度" prop="s_longitude"></el-table-column>
              <el-table-column label="纬度" prop="s_latitude"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除'+scope.row.s_name+'吗？'"
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
import { addShool, updateShool, delShool, getShools } from "@/api/shool";
export default {
  name: "GetShool",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        s_name: null,
        total: 0
      },
      shool: {
        s_id: null,
        s_name: "",
        s_longitude: "",
        s_latitude: ""
      },
      shools: [],
      add: true,
      loading: false,
      search: ""
    };
  },
  created() {
    this.mGetShools();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.shool = row;
      this.add = false;
    },
    handleDelete(index, row) {
      this.mDelShool(row.s_id);
    },
    mGetShools() {
      this.resetForm();
      getShools(this.page)
        .then(res => {
          if (this.shools.length > 0) {
            this.shools.splice(0, this.shools.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            this.shools.push(item);
          });
        })
        .catch(() => {});
    },
    mAddShool() {
      addShool(this.shool)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetShools();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateShool() {
      delete this.shool.grades;
      updateShool(this.shool)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetShools();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelShool(s_id) {
      delShool({ s_id: s_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetShools();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddShool();
      } else {
        this.mUpdateShool();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.shool = {
        s_id: null,
        s_name: "",
        s_longitude: "",
        s_latitude: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetShools();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetShools();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetShools();
    }
  }
};
</script>
