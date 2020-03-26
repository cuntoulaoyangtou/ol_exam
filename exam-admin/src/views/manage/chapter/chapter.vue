<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="10">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加章节</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="chapter" ref="chapter">
              <el-form-item label="章节名称">
                <el-input v-model="chapter.ec_name"></el-input>
              </el-form-item>
              <el-form-item label="优先级">
                <el-input v-model="chapter.ec_priority"></el-input>
              </el-form-item>
              <el-form-item label="所属课程">
                <el-select v-model="chapter.cum_id" placeholder="请选择课程">
                  <el-option
                    :label="item.cum_name"
                    :value="item.cum_id"
                    v-for="(item,index) in curriculums"
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
                <span>所有章节</span>
              </el-col>
              <el-col :span="8">
                <el-select
                  v-model="page.cum_id"
                  filterable
                  placeholder="请选择课程"
                  @change="curriculumChange"
                >
                  <el-option label="所有专业" :value="0" key="curriculum"></el-option>
                  <el-option
                    :label="item.cum_name"
                    :value="item.cum_id"
                    v-for="(item,index) in curriculums"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-col>
              <el-col :span="8">
                <el-button
                  style="float: right; padding: 3px 0; line-height:36px"
                  type="text"
                  @click="mGetChapters"
                >刷新</el-button>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="chapters.filter(data => !search || data.ec_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="ec_id" width="60"></el-table-column>
              <el-table-column label="章节名称" prop="ec_name"></el-table-column>
              <el-table-column label="优先级" prop="ec_priority"></el-table-column>
              <el-table-column label="课程名称" prop="cum_name"></el-table-column>
              <el-table-column align="right" fixed="right" width="140">
                <template slot="header" slot-scope="scope">
                  <el-input v-model="search" size="mini" placeholder="输入关键字搜索" />
                </template>
                <template slot-scope="scope">
                  <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                  <template>
                    <el-popconfirm
                      :title="'确定删除《'+scope.row.ec_name+'》吗？'"
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
import {
  addChapter,
  updateChapter,
  delChapter,
  getChapters
} from "@/api/chapter";
import { getCurriculums } from "@/api/curriculum";
export default {
  name: "Chapter",
  data() {
    return {
      page: {
        pageNo: 1,
        pageSize: 10,
        ec_name: null,
        cum_id: "",
        total: 0
      },
      chapter: {
        ec_id: null,
        ec_name: "",
        ec_priority: "",
        cum_id: ""
      },
      chapters: [],
      curriculums: [],
      add: true,
      loading: false,
      search: "",
      visible: false
    };
  },
  created() {
    getCurriculums({
      pageNo: 1,
      pageSize: 100,
      cum_name: null
    })
      .then(res => {
        if (this.curriculums.length > 0) {
          this.curriculums.splice(0, this.curriculums.length);
        }
        res.data.list.forEach(item => {
          this.curriculums.push(item);
        });
      })
      .catch(() => {});
    this.mGetChapters();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.chapter.ec_id = row.ec_id;
      this.chapter.ec_name = row.ec_name;
      this.chapter.ec_priority = row.ec_priority;
      this.chapter.cum_id = row.cum_id;
      this.add = false;
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelChapter(row.ec_id);
    },
    mGetChapters() {
      this.resetForm();
      getChapters(this.page)
        .then(res => {
          if (this.chapters.length > 0) {
            this.chapters.splice(0, this.chapters.length);
          }
          this.page.total = res.data.total;
          res.data.list.forEach(item => {
            item.cum_name = this.curriculums.find(function(obj) {
              return obj.cum_id === item.cum_id;
            }).cum_name;
            this.chapters.push(item);
          });
        })
        .catch(() => {});
    },
    mAddChapter() {
      addChapter(this.chapter)
        .then(res => {
          if (res.data && res.code === "SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetChapters();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateChapter() {
      updateChapter(this.chapter)
        .then(res => {
          if (res.data && res.code === "SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetChapters();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelChapter(ec_id) {
      delChapter({ ec_id: ec_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetChapters();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddChapter();
      } else {
        this.mUpdateChapter();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.chapter = {
        ec_id: null,
        ec_name: "",
        ec_priority: "",
        cum_id: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetChapters();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetChapters();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetChapters();
    },
    curriculumChange() {
      this.mGetChapters();
    }
  }
};
</script>
<style>
.ctlyt-line-h {
  line-height: 36px;
}
</style>