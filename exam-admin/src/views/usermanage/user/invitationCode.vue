<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>创建班级邀请码</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="db" ref="clazz">
              <el-form-item label="有效期">
                <el-date-picker
                    v-model="db.endDate"
                    type="datetime"
                    placeholder="选择日期时间"
                    align="right"
                    :picker-options="pickerOptions">
                </el-date-picker>
              </el-form-item>
              <el-form-item label="角色">
                <el-select v-model="db.r_id" placeholder="角色">
                  <el-option
                    :label="item.r_name"
                    :value="item.r_id"
                    v-for="(item,index) in roles"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-form-item>
              <el-form-item label="班级">
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
              <el-button type="primary" :loading="loading" @click="mCreateCode">创建</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="16">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <el-row :gutter="10" class="ctlyt-line-h">
              <el-col :span="4">
                <span>所有邀请码</span>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="codes"
              style="width: 100%"
            >
              <el-table-column label="编号" width="60">
                  <template slot-scope="scope">{{scope.$index+1}}</template>
              </el-table-column>
              <el-table-column label="邀请码" prop="code"></el-table-column>
              <el-table-column label="失效时间" prop="endDate" min-width="110">
                <template slot-scope="{ row }">
                    <span>{{ row.endDate | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
                </template>
              </el-table-column>
              <el-table-column label="角色" prop="r_name">
              </el-table-column>
              <el-table-column label="所属班级" prop="c_name" min-width="140"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot-scope="scope">
                  <el-button size="mini" v-clipboard:copy='"班级："+scope.row.c_name+"\n角色："+scope.row.r_name+"\n注册邀请码："+scope.row.code'
                    v-clipboard:success="copyCode"
                    v-clipboard:error="onError">复制</el-button>
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
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import { preUser, delCode, createCode,findCode } from "@/api/user";
import VueClipboard from 'vue-clipboard2';
import { Col, Form } from "element-ui";
import {parseTime} from "@/utils";
export default {
  name: "userCom",
  data() {
    return {
        pickerOptions: {
          shortcuts: [{
            text: '一天',
            onClick(picker) {
              const date = new Date();
              date.setTime(date.getTime() + 3600 * 1000 * 24);
              picker.$emit('pick', date);
            }
          }, {
            text: '两天',
            onClick(picker) {
              const date = new Date();
              date.setTime(date.getTime() + 3600 * 1000 * 24*2);
              picker.$emit('pick', date);
            }
          }, {
            text: '一周',
            onClick(picker) {
              const date = new Date();
              date.setTime(date.getTime() + 3600 * 1000 * 24 * 7);
              picker.$emit('pick', date);
            }
          }]
        },
        
        db:{
            endDate:null,
            r_id:null,
            c_id:null
        },
        codes:[],
        message:'',
      roles: [],
      clazzs: [],
      grades: [],
      majors: [],
      shools: [],
      loading: false,
      visible: false,
      options: [],
      pprops: {
        emitPath: false
      }
    };
  },
  computed: {
  },
  created() {
    preUser().then(res=>{
      if(res.data.shools){
        res.data.shools.forEach(item => {
          this.shools.push(item);
        });
         res.data.grades.forEach(item => {
          this.grades.push(item);
        });

      }
      res.data.clazzes.forEach(item => {
        this.clazzs.push(item);
      });
      res.data.majors.forEach(item => {
        this.majors.push(item);
      });
      res.data.roles.forEach(item => {
        this.roles.push(item);
      });
    })
    this.mFindCode();
  },
  onload() {},
  mounted() {},
  methods: {
    copyCode(row) {
        console.log(row);
        this.$message.success("内容已复制到剪切板！")
    },
    onError(e){
        console.log(e)
        this.$message.error("内容已复制失败！")
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelCode(row.code);
    },
    //获取code
    mFindCode(){
        this.codes.splice(0,this.codes.length);
        findCode().then(res=>{
            res.data.forEach(item=>{
                item.r_name = this.getRName(item.r_id);
                item.c_name = this.getCName(item.c_id);
                this.codes.push(item);
            })
        })
        this.loading = false;
    },
    getRName(id){
        var name;
        this.roles.forEach(item=>{
            if(item.r_id===id){
                name = item.r_name;
            }
        })
        return name;
    },
    getCName(id){
        var name;
        this.clazzs.forEach(item=>{
            if(item.c_id===id){
                name = item.c_name;
            }
        })
        return name;
    },
    mCreateCode() {
      this.loading = true;
      this.db.endDate = parseTime(this.db.endDate);
      createCode(this.db)
        .then(res => {
          if (res.data && res.code === "SUCCESS") {
            this.$message({
              message: "创建成功",
              type: "success"
            });
            this.mFindCode();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelCode(code) {
      delCode({ "code": code }).then(res => {
        if (res.code === "SUCCESS") {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          for(var i=0; i<this.codes.length; i++){
              if(this.codes[i].code === code){
                  this.codes.splice(i,1);
                  return;
              }
          }
        }
      });
    },
    visibleChange() {
      if (this.options.length <= 0) {
       
        if(this.shools !=null && this.shools.length>0){
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
        }else{
          this.clazzs.forEach(i => {
              this.options.push({ value: i.c_id, label: i.c_name });
          });
        }
       
      }
    },
    gradeChange(e) {
      this.db.c_id = e;
    },
    gradesChange(e) {
      if(this.shools!=null && this.shools.length>0){
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

      }else{
        this.page.c_id = e[e.length - 1];
      }
     
      this.mFindCode();
    }
  }
};
</script>

<style>
.ctlyt-line-h {
  line-height: 36px;
}
</style>