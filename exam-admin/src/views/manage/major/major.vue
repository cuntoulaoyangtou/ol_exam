<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加分类</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="major" ref="major">
              <el-form-item label="分类名称">
                <el-input v-model="major.m_name"></el-input>
              </el-form-item>
              <el-form-item label="介绍">
                <el-input v-model="major.m_intro"></el-input>
              </el-form-item>
              <el-form-item label="优先级">
                <el-input v-model="major.m_priority"></el-input>
              </el-form-item>
              <el-button type="primary" :loading="loading" @click="addAndUpdate">{{add?"添加":"更新"}}</el-button>
            </el-form>
          </div>
        </el-card>
      </el-col>
      <el-col :span="14">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>所有分类</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="mGetMajors">刷新</el-button>
          </div>
          <div class="text item">
            <el-table
              :data="majors.filter(data => !search || data.m_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="m_id" width="60"></el-table-column>
              <el-table-column label="分类名称" prop="m_name"></el-table-column>
              <el-table-column label="介绍" prop="m_intro"></el-table-column>
              <el-table-column label="优先级" prop="m_priority"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除'+scope.row.m_name+'吗？'"
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
import { addMajor, updateMajor, delMajor, getMajors } from "@/api/major";
export default {
  name: "GetMajor",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        s_name: null,
        total: 0
      },
      major: {
        m_id: null,
        m_name: "",
        m_intro: "",
        m_priority: ""
      },
      majors: [],
      add: true,
      loading: false,
      search: ""
    };
  },
  created() {
    this.mGetMajors();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.major = row;
      this.add = false;
    },
    handleDelete(index, row) {
      this.mDelMajor(row.m_id);
    },
    mGetMajors() {
      this.resetForm();
      getMajors(this.page)
        .then(res => {
          if (this.majors.length > 0) {
            this.majors.splice(0, this.majors.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            this.majors.push(item);
          });
        })
        .catch(() => {});
    },
    mAddMajor() {
      addMajor(this.major)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetMajors();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateMajor() {
      updateMajor(this.major)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetMajors();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelMajor(m_id) {
      delMajor({ m_id: m_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetMajors();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddMajor();
      } else {
        this.mUpdateMajor();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.major = {
        m_id: null,
        m_name: "",
        m_intro: "",
        m_priority: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetMajors();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetMajors();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetMajors();
    }
  }
};
</script>
