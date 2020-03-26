<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加班级管理员</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="select" ref="clazzmanage">
              <el-row :gutter="10">
                <el-col :span="12">
                  <el-form-item label="查询角色">
                    <el-select v-model="select.r_id" placeholder="查询角色">
                      <el-option label="所有角色" :value="0" key="role"></el-option>
                      <el-option
                        :label="item.r_name"
                        :value="item.r_id"
                        v-for="(item,index) in roles"
                        :key="index"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="12">
                  <el-form-item label="查询学校">
                    <el-select v-model="select.s_id" placeholder="查询学校">
                      <el-option label="所有学校" :value="0" key="shool"></el-option>
                      <el-option
                        :label="item.s_name"
                        :value="item.s_id"
                        v-for="(item,index) in shools"
                        :key="index"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
              </el-row>
              <el-button type="primary" :loading="loading" @click="selectUser">查询用户</el-button>
            </el-form>

            <el-form label-position="top" label-width="80px" :model="clazzmanage" ref="clazzmanage">
              <el-row :gutter="10">
                <el-col :span="12">
                  <el-form-item label="选择用户">
                    <el-select v-model="clazzmanage.u_id" placeholder="选择用户">
                      <el-option
                        v-if="item.clazzManages.length==0"
                        :label="item.real_name"
                        :value="item.u_id"
                        v-for="(item,index) in users"
                        :key="index"
                      ></el-option>
                    </el-select>
                  </el-form-item>
                </el-col>
                <el-col :span="12">
                  <el-form-item label="所属班级">
                    <el-cascader
                      :options="options"
                      @visible-change="visibleChange"
                      placeholder="选择班级"
                      :props="pprops"
                      v-model="bidclazz"
                      @change="gradeChange"
                    ></el-cascader>
                  </el-form-item>
                </el-col>
              </el-row>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">添加</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="14">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>所有班级管理员</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="selectUser">刷新</el-button>
          </div>
          <div class="text item">
            <el-table :data="users" style="width: 100%">
              <el-table-column label="编号" prop="u_id" width="60"></el-table-column>
              <el-table-column label="用户名" prop="real_name"></el-table-column>
              <el-table-column label="班级名">
                <template slot-scope="scope">
                  <div v-for="(item,index) in scope.row.cnames" :key="index">
                      {{item}}
                  </div>
                </template>
              </el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope"></template>
                <template slot-scope="scope">
                  <template>
                    <el-popconfirm v-if="scope.row.clazzManages.length>0"
                      :title="'确定删除'+scope.row.real_name+'的班级管理权吗？'"
                      @onConfirm="handleDelete(scope.$index, scope.row)"
                    >
                      <el-button size="mini" type="danger" slot="reference">删除</el-button>
                    </el-popconfirm>
                  </template>
                </template>
              </el-table-column>
            </el-table>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import {
  addClazzmanages,
  delClazzmanage,
  getClazzmanages
} from "@/api/clazzmanage";
import { getShools } from "@/api/shool";
import { getClazzs } from "@/api/clazz";
import { getGrades } from "@/api/grade";
import { getRoles } from "@/api/role";
import { getUsers } from "@/api/user";
export default {
  name: "GetClazzmanage",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        c_id: null,
        u_id: null,
        total: 0
      },
      clazzmanage: {
        cm_id: null,
        u_id: "",
        c_ids: []
      },
      users: [],
      bidclazz: [],
      shools: [],
      roles: [],
      loading: false,
      options: [],
      clazzs: [],
      grades: [],
      pprops: {
        multiple: true
      },
      select: {
        pageNo: 1,
        pageSize: 50,
        r_id: "",
        s_id: "",
        cm:true
      }
    };
  },
  created() {
    getRoles({ pageNo: 1, pageSize: 50 }).then(res => {
      res.data.list.forEach(item => {
        this.roles.push(item);
      });
    });
    getShools({ pageNo: 1, pageSize: 50 }).then(res => {
      res.data.list.forEach(item => {
        this.shools.push(item);
      });
    });
    getGrades({ pageNo: 1, pageSize: 50 }).then(res => {
      res.data.list.forEach(item => {
        this.grades.push(item);
      });
    });
    getClazzs({ pageNo: 1, pageSize: 500 }).then(res => {
      res.data.list.forEach(item => {
        this.clazzs.push(item);
      });
    });
  },
  onload() {},
  mounted() {},
  methods: {
    handleDelete(index, row) {
      this.mDelClazzmanage(row.u_id);
    },
    selectUser() {
      this.resetForm();
      this.users = [];
      getUsers(this.select).then(res => {
        res.data.list.forEach(item => {
          let cnames = [];
          item.clazzManages.forEach(ite=>{
            let str =  ite.clazz.c_name;
            this.grades.forEach(it=>{
              if(ite.clazz.g_id == it.g_id){
                str = it.g_name+"-"+str;
                this.shools.forEach(i=>{
                  if(it.s_id === i.s_id){
                    str=i.s_name+"-"+str;
                    cnames.push(str);
                  }
                })
              }
            })
          })
          item.cnames = cnames;
          this.users.push(item);
        });
      });
    },
    mAddClazzmanages() {
      addClazzmanages({u_id:this.clazzmanage.u_id,c_ids:JSON.stringify(this.clazzmanage.c_ids)})
        .then(res => {
          if (res.code === "SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.selectUser();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelClazzmanage(u_id) {
      delClazzmanage({ u_id: u_id }).then(res => {
        if (res.code === "SUCCESS") {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.selectUser();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;

        this.mAddClazzmanages();
    },
    resetForm() {
      this.loading = false;
      this.clazzmanage = {
        cm_id: null,
        u_id: "",
        c_ids: []
      };
      this.bidclazz = [];
    },
    visibleChange() {
      if (this.options.length <= 0) {
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
      let clm = []
      this.clazzmanage.c_ids = clm;
      e.forEach(item=>{
        clm.push(item[item.length - 1]);
      })
      
    }
  }
};
</script>
