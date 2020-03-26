<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加年级</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="grade" ref="grade">
              <el-form-item label="年级名称">
                <el-input v-model="grade.g_name"></el-input>
              </el-form-item>
              <el-form-item label="优先级">
                <el-input v-model="grade.g_priority"></el-input>
              </el-form-item>
              <el-form-item label="所属学校">
                <el-select v-model="grade.s_id" placeholder="请选择学校">
                  <el-option
                    :label="item.s_name"
                    :value="item.s_id"
                    v-for="(item,index) in shools"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-form-item>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">{{add?"添加":"更新"}}</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="14">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <el-row :gutter="10" class="ctlyt-line-h">
              <el-col :span="8">
                <span>所有年级</span>
              </el-col>
              <el-col :span="8">
                <el-select v-model="page.s_id" filterable placeholder="请选择学校" @change="shoolChange">
                    <el-option
                    label="所有学校"
                    :value="0"
                    key="shool"
                  ></el-option>
                  <el-option
                    :label="item.s_name"
                    :value="item.s_id"
                    v-for="(item,index) in shools"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-col>
              <el-col :span="8">
                <el-button style="float: right; padding: 3px 0; line-height:36px" type="text" @click="mGetGrades">刷新</el-button>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="grades.filter(data => !search || data.g_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="g_id" width="60"></el-table-column>
              <el-table-column label="年级名称" prop="g_name"></el-table-column>
              <el-table-column label="优先级" prop="g_priority"></el-table-column>
              <el-table-column label="学校名称" prop="s_name"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除'+scope.row.g_name+'吗？'"
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
import { addGrade, updateGrade, delGrade, getGrades } from "@/api/grade";
import { getShools } from "@/api/shool";
export default {
  name: "Grade",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        g_name: null,
        s_id: "",
        total: 0
      },
      grade: {
        g_id: null,
        g_name: "",
        g_priority: "",
        s_id: ""
      },
      grades: [],
      shools: [],
      add: true,
      loading: false,
      search: "",
      visible: false
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
    this.mGetGrades();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.grade = row;
      this.add = false;
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelGrade(row.g_id);
    },
    mGetGrades() {
      this.resetForm();
      getGrades(this.page)
        .then(res => {
          if (this.grades.length > 0) {
            this.grades.splice(0, this.grades.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            item.s_name = this.shools.find(function(obj) {
              return obj.s_id === item.s_id;
            }).s_name;
            this.grades.push(item);
          });
        })
        .catch(() => {});
    },
    mAddGrade() {
      addGrade(this.grade)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetGrades();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateGrade() {
      updateGrade(this.grade)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetGrades();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelGrade(g_id) {
      delGrade({ g_id: g_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetGrades();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddGrade();
      } else {
        this.mUpdateGrade();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.grade = {
        g_id: null,
        g_name: "",
        g_priority: "",
        s_id: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetGrades();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetGrades();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetGrades();
    },
    shoolChange() {
      this.mGetGrades();
    }
  }
};
</script>
<style>
    .ctlyt-line-h{
        line-height: 36px;
    }
</style>