<template>
  <div class="app-container">
    <el-row :gutter="24">
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>添加班级</span>
            <el-button style="float: right; padding: 3px 0" type="text" @click="resetForm()">清空</el-button>
          </div>
          <div class="text item">
            <el-form label-position="top" label-width="80px" :model="clazz" ref="clazz">
              <el-form-item label="班级名称">
                <el-input v-model="clazz.c_name"></el-input>
              </el-form-item>
              <el-form-item label="优先级">
                <el-input v-model="clazz.c_priority"></el-input>
              </el-form-item>
              <el-form-item label="所属专业">
                <el-select v-model="clazz.m_id" placeholder="请选择专业">
                  <el-option
                    :label="item.m_name"
                    :value="item.m_id"
                    v-for="(item,index) in majors"
                    :key="index"
                  ></el-option>
                </el-select>
              </el-form-item>
              <el-form-item label="所属年级">
                <el-cascader
                  :options="options"
                  @visible-change="visibleChange"
                  placeholder="选择年级"
                  :getCheckedNodes="true"
                  :props="pprops"
                  v-model="opgrades"
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
                <span>所有班级</span>
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
                  placeholder="选择年级"
                  :props="{ checkStrictly: true }"
                  @change="gradesChange"
                ></el-cascader>
              </el-col>
              <el-col :span="6">
                <el-button
                  style="float: right; padding: 3px 0; line-height:36px"
                  type="text"
                  @click="mGetClazzs"
                >刷新</el-button>
              </el-col>
            </el-row>
          </div>
          <div class="text item">
            <el-table
              :data="clazzs.filter(data => !search || data.c_name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%"
            >
              <el-table-column label="编号" prop="c_id" width="60"></el-table-column>
              <el-table-column label="班级名称" prop="c_name"></el-table-column>
              <el-table-column label="优先级" prop="c_priority" width="80"></el-table-column>
              <el-table-column label="分类名称" prop="m_name"></el-table-column>
              <el-table-column label="学校名称" prop="s_name"></el-table-column>
              <el-table-column label="年级名称" prop="g_name"></el-table-column>
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
import { addClazz, updateClazz, delClazz, getClazzs } from "@/api/clazz";
import { getMajors } from "@/api/major";
import { getGrades } from "@/api/grade";
import { getShools } from "@/api/shool";
export default {
  name: "Clazz",
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
      clazz: {
        c_id: null,
        c_name: "",
        c_priority: "",
        g_id: "",
        m_id: ""
      },
      clazzs: [],
      grades: [],
      majors: [],
      shools: [],
      add: true,
      loading: false,
      search: "",
      visible: false,
      options: [],
      opgrades: [],
      pprops: {},
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
    this.mGetClazzs();
  },
  onload() {},
  mounted() {},
  methods: {
    handleEdit(index, row) {
      this.clazz = row;
      //   this.opgrades.splice(0,this.opgrades.length)
      //   row.opgrades.forEach(item=>{
      //       this.opgrades.push(item)
      //   })
      this.opgrades = row.opgrades;
      this.add = false;
    },
    handleDelete(index, row) {
      this.visible = false;
      this.mDelClazz(row.c_id);
    },
    mGetClazzs() {
      this.resetForm();
      getClazzs(this.page)
        .then(res => {
          if (this.clazzs.length > 0) {
            this.clazzs.splice(0, this.clazzs.length);
          }
          this.page.total = res.data.total;

          res.data.list.forEach(item => {
            item.m_name = this.majors.find(function(obj) {
              return obj.m_id === item.m_id;
            }).m_name;
            let grade = this.grades.find(function(obj) {
              return obj.g_id === item.g_id;
            });
            let shool = this.shools.find(function(obj) {
              return obj.s_id == grade.s_id;
            });

            item.g_name = grade.g_name;
            item.s_name = shool.s_name;
            item.opgrades = [shool.s_id, grade.g_id];
            this.clazzs.push(item);
          });
        })
        .catch(() => {});
    },
    mAddClazz() {
      addClazz(this.clazz)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "添加成功",
              type: "success"
            });
            this.mGetClazzs();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mUpdateClazz() {
      updateClazz(this.clazz)
        .then(res => {
          if (res.data && res.code==="SUCCESS") {
            this.$message({
              message: "修改成功",
              type: "success"
            });
            this.mGetClazzs();
          }
        })
        .catch(() => {
          this.loading = false;
        });
    },
    mDelClazz(c_id) {
      delClazz({ c_id: c_id }).then(res => {
        if (res.data && res.data > 0) {
          this.$message({
            message: "删除成功",
            type: "success"
          });
          this.mGetClazzs();
        }
      });
    },
    addAndUpdate() {
      this.loading = true;
      if (this.add) {
        this.mAddClazz();
      } else {
        this.mUpdateClazz();
      }
    },
    resetForm() {
      this.add = true;
      this.loading = false;
      this.opgrades = null;
      this.clazz = {
        c_id: null,
        c_name: "",
        c_priority: "",
        g_id: "",
        m_id: ""
      };
    },
    prevClick() {
      this.page.pageNo--;
      this.mGetClazzs();
    },
    nextClick() {
      this.page.pageNo++;
      this.mGetClazzs();
    },
    currentChange(e) {
      this.page.pageNo = e;
      this.mGetClazzs();
    },
    curChange() {
      this.mGetClazzs();
    },
    visibleChange() {
      if (this.options.length <= 0) {
        this.options.push({ value: 0, label: "所有班级" });
        this.shools.forEach(item => {
          let c = [];
          let ch = { value: item.s_id, label: item.s_name, children: c };

          this.grades.forEach(it => {
            if (item.s_id == it.s_id) {
              c.push({ value: it.g_id, label: it.g_name });
            }
          });
          this.options.push(ch);
        });
      }
    },

    gradeChange(e) {
      this.clazz.g_id = e[e.length - 1];
    },
    gradesChange(e) {
      switch (e.length) {
        case 1:
          this.page.g_id = null;
          this.page.s_id = e[0];
          break;
        case 2:
          this.page.s_id = null;
          this.page.g_id = e[1];
          break;
        default:
          return;
      }
      this.mGetClazzs();
    }
  }
};
</script>
<style>
.ctlyt-line-h {
  line-height: 36px;
}
</style>