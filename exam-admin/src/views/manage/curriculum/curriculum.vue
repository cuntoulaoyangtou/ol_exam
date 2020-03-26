<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加课程</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="curriculum" ref="curriculum">
              <el-form-item label="课程名称">
                <el-input v-model="curriculum.cum_name"></el-input>
              </el-form-item>
              <el-form-item label="优先级">
                <el-input v-model="curriculum.cum_priority"></el-input>
              </el-form-item>
              <el-form-item label="所属专业">
                <el-select v-model="curriculum.m_id" placeholder="请选择专业">
                  <el-option
                    :label="item.m_name"
                    :value="item.m_id"
                    v-for="(item,index) in majors"
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
                <span>所有课程</span>
              </el-col>
              <el-col :span="8">
                <el-select v-model="page.m_id" filterable placeholder="请选择专业" @change="majorChange">
                    <el-option
                    label="所有专业"
                    :value="0"
                    key="major"
                  ></el-option>
                  <el-option
                    :label="item.m_name"
                    :value="item.m_id"
                    v-for="(item,index) in majors"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-col>
              <el-col :span="8">
                <el-button style="float: right; padding: 3px 0; line-height:36px" type="text" @click="mGetCurriculums">刷新</el-button>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="curriculums.filter(data => !search || data.cum_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="cum_id" width="60"></el-table-column>
              <el-table-column label="课程名称" prop="cum_name"></el-table-column>
              <el-table-column label="优先级" prop="cum_priority"></el-table-column>
              <el-table-column label="专业名称" prop="m_name"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除《'+scope.row.cum_name+'》吗？'"
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
import { addCurriculum, updateCurriculum, delCurriculum, getCurriculums } from "@/api/curriculum";
import { getMajors } from "@/api/major";
export default {
  name: "Curriculum",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        cum_name: null,
        m_id: "",
        total: 0
      },
      curriculum: {
        g_id: null,
        g_name: "",
        g_priority: "",
        s_id: ""
      },
      curriculums: [],
      majors: [],
      add: true,
      loading: false,
      search: "",
      visible: false
    };
  },
  created() {
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
    this.mGetCurriculums();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
        this.curriculum.cum_id = row.cum_id;
      this.curriculum.cum_name = row.cum_name;
      this.curriculum.cum_priority = row.cum_priority;
      this.curriculum.m_id = row.m_id;
      this.add = false;
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelCurriculum(row.cum_id);
    },
    mGetCurriculums() {
      this.resetForm();
      getCurriculums(this.page)
        .then(res => {
          if (this.curriculums.length > 0) {
            this.curriculums.splice(0, this.curriculums.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            item.m_name = this.majors.find(function(obj) {
              return obj.m_id === item.m_id;
            }).m_name;
            this.curriculums.push(item);
          });
        })
        .catch(() => {});
    },
    mAddCurriculum() {
      addCurriculum(this.curriculum)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetCurriculums();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateCurriculum() {
      updateCurriculum(this.curriculum)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetCurriculums();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelCurriculum(cum_id) {
      delCurriculum({ cum_id: cum_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetCurriculums();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddCurriculum();
      } else {
        this.mUpdateCurriculum();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.curriculum = {
        cum_id: null,
        cum_name: "",
        cum_priority: "",
        m_id: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetCurriculums();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetCurriculums();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetCurriculums();
    },
    majorChange() {
      this.mGetCurriculums();
    }
  }
};
</script>
<style>
    .ctlyt-line-h{
        line-height: 36px;
    }
</style>