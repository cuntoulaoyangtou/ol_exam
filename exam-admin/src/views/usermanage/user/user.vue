<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加用户</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="user" ref="clazz">
              <el-form-item label="用户名称">
                <el-input v-model="user.username"></el-input>
              </el-form-item>
              <el-form-item label="电话号">
                <el-input v-model="user.phone"></el-input>
              </el-form-item>
              <el-form-item label="密码">
                <el-input v-model="user.password" show-password></el-input>
              </el-form-item>
              <el-form-item label="真实姓名">
                <el-input v-model="user.real_name"></el-input>
              </el-form-item>
              <el-form-item label="用户头像">
                <el-input v-model="user.avatar"></el-input>
              </el-form-item>
              <el-form-item label="角色">
                <el-select v-model="user.r_id" placeholder="角色">
                  <el-option
                    :label="item.r_name"
                    :value="item.r_id"
                    v-for="(item,index) in roles"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-form-item>
              <el-form-item label="所属班级">
                <el-cascader
                  :options="options"
                  :show-all-levels="false"
                  @visible-change="visibleChange"
                  placeholder="选择班级"
                  :getCheckedNodes="true"
                  :props="pprops"
                  @change="gradeChange"
                ></el-cascader>
              </el-form-item>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">{{add?"添加":"更新"}}</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="16">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <el-row :gutter="10" class="ctlyt-line-h">
              <el-col :span="6">
                <span>所有用户</span>
              </el-col>
              <el-col :span="6">
                <el-select v-model="page.m_id" filterable placeholder="请选择专业" @change="curChange">
                  <el-option label="所有专业" :value="0" key="major"></el-option>
                  <el-option
                    :label="item.m_name"
                    :value="item.m_id"
                    v-for="(item,index) in majors"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-col>
              <el-col :span="6">
                <el-cascader
                  :options="options"
                  :show-all-levels="false"
                  @visible-change="visibleChange"
                  placeholder="选择学校年级或班级"
                  :props="{ checkStrictly: true }"
                  @change="gradesChange"
                ></el-cascader>
              </el-col>
              <el-col :span="6">
                <el-button
                  style="float: right; padding: 3px 0; line-height:36px"
                  type="text"
                  @click="mGetUsers"
                >刷新</el-button>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="users.filter(data => !search || data.real_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="u_id" width="60"></el-table-column>
              <el-table-column label="用户名" prop="username"></el-table-column>
              <el-table-column label="手机号" prop="phone"></el-table-column>
              <el-table-column label="真实姓名" prop="real_name"></el-table-column>
              <el-table-column label="角色" prop="r_name"></el-table-column>
              <el-table-column label="所属班级" prop="c_name"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除'+scope.row.c_name+'吗？'"
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
              layout="total, prev, pager, next"
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
import { getClazzs } from "@/api/clazz";
import { getMajors } from "@/api/major";
import { getGrades } from "@/api/grade";
import { getShools } from "@/api/shool";
import { getRoles } from "@/api/role";
import { addUser, updateUser, delUser, getUesrs, getUsers } from "@/api/user";
import { Col } from "element-ui";
export default {
  name: "userCom",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        c_name: null,
        g_id: "",
        m_id: "",
        total: 0
      },
      user: {
        username: "",
        phone: "",
        password: "",
        real_name: "",
        c_id: "",
        r_id: "",
        avatar: ""
      },
      users: [],
      roles: [],
      clazzs: [],
      grades: [],
      majors: [],
      shools: [],
      add: true,
      loading: false,
      search: "",
      visible: false,
      options: [],
      pprops: {
        emitPath: false
      }
    };
  },
  created() {
    getShools({
      pageNo: 1,
      pageSize: 100,
      s_name: null
    })
      .then(res => {
        if (this.shools.length > 0) {
          this.shools.splice(0, this.shools.length);
        }
        res.data.list.forEach(item => {
          this.shools.push(item);
        });
      })
      .catch(() => {});
    getGrades({
      pageNo: 1,
      pageSize: 100,
      g_name: null
    })
      .then(res => {
        if (this.grades.length > 0) {
          this.grades.splice(0, this.grades.length);
        }
        res.data.list.forEach(item => {
          this.grades.push(item);
        });
      })
      .catch(() => {});
    getMajors({
      pageNo: 1,
      pageSize: 100,
      m_name: null
    })
      .then(res => {
        if (this.majors.length > 0) {
          this.majors.splice(0, this.majors.length);
        }
        res.data.list.forEach(item => {
          this.majors.push(item);
        });
      })
      .catch(() => {});
    getClazzs({
      pageNo: 1,
      pageSize: 500,
      c_name: null
    })
      .then(res => {
        if (this.clazzs.length > 0) {
          this.clazzs.splice(0, this.clazzs.length);
        }
        res.data.list.forEach(item => {
          this.clazzs.push(item);
        });
      })
      .catch(() => {});
    getRoles({
      pageNo: 1,
      pageSize: 50,
      r_name: null
    })
      .then(res => {
        if (this.roles.length > 0) {
          this.roles.splice(0, this.roles.length);
        }

        res.data.list.forEach(item => {
          this.roles.push(item);
        });
      })
      .catch(() => {});
    this.mGetUsers();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.user = row;
      this.user.password = "";
      this.add = false;
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelUser(row.u_id);
    },
    mGetUsers() {
      this.resetForm();
      getUsers(this.page)
        .then(res => {
          if (this.users.length > 0) {
            this.users.splice(0, this.users.length);
          }
          this.page.total = res.data.total;

          res.data.list.forEach(item => {
            item.r_name = this.roles.find(function(obj) {
              return obj.r_id === item.r_id;
            }).r_name;
            item.c_name = this.clazzs.find(function(obj) {
              return obj.c_id === item.c_id;
            }).c_name;
            this.users.push(item);
          });
        })
        .catch(() => {});
    },
    mAddUser() {
      addUser(this.user)
        .then(res => {
          if (res.data && res.code === "SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetUsers();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateUser() {
      delete this.user.clazzManages;
      delete this.user.role;
      updateUser(this.user)
        .then(res => {
          if (res.data && res.code === "SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetUsers();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelUser(u_id) {
      delUser({ u_id: u_id }).then(res => {
        if (res.data && res.code === "SUCCESS") {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetUsers();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddUser();
      } else {
        this.mUpdateUser();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.user = {
        username: "",
        phone: "",
        password: "",
        real_name: "",
        c_id: "",
        r_id: "",
        avatar: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetUsers();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetUsers();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetUsers();
    },
    curChange() {
      this.mGetUsers();
    },
    visibleChange() {
      if (this.options.length <= 0) {
        this.options.push({ value: 0, label: "所有学校" });
        this.shools.forEach(item => {
          let ch = { value: item.s_id, label: item.s_name, children: [] };
          this.options.push(ch);
          this.grades.forEach(it => {
            if (item.s_id == it.s_id) {
              let c = [];
              ch.children.push({
                value: it.g_id,
                label: it.g_name,
                children: c
              });
              this.clazzs.forEach(i => {
                if (it.g_id == i.g_id) {
                  c.push({ value: i.c_id, label: i.c_name });
                }
              });
            }
          });
        });
      }
    },
    gradeChange(e) {
      this.user.c_id = e;
    },
    gradesChange(e) {
      this.page.g_id = e[e.length - 1];
      switch (e.length) {
        case 1:
          this.page.g_id = null;
          this.page.c_id = null;
          this.page.s_id = e[0];
          break;
        case 2:
          this.page.s_id = null;
          this.page.c_id = null;
          this.page.g_id = e[1];
          break;
        case 3:
          this.page.s_id = null;
          this.page.g_id = null;
          this.page.c_id = e[2];
          break;
        default:
          return;
      }
      this.mGetUsers();
    }
  }
};
</script>

<style>
.ctlyt-line-h {
  line-height: 36px;
}
</style>