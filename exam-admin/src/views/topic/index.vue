<template>
  <div class="app-container">
    <div class="filter-container">
      <el-cascader
        v-model="selectedOptions"
        class="filter-item"
        style="width: 300px"
        expand-trigger="hover"
        :show-all-levels="false"
        :options="options"
        :clearable="true"
        placeholder="选择课程"
      />
      <el-input v-model="keyAndPage.q_content" class="filter-item" style="width: 15rem;" clearable placeholder="查询内容" />
      <el-select v-model="keyAndPage.qt_id" class="filter-item" clearable placeholder="试题类型" style="width: 7.5rem;">
        <el-option v-for="item in types" :key="item.value" :label="item.name" :value="item.value" />
      </el-select>

      <el-input-number v-model="keyAndPage.pageSize" style="width: 7.5rem;" class="filter-item" controls-position="right" :min="1" :max="100" placeholder="每页条数" />
      <el-button :loading="handleLoading" class="filter-item" type="primary" icon="el-icon-search" @click="getQuestionAll">查询</el-button>
      <el-button class="filter-item" type="primary" icon="el-icon-plus" @click="addQuestion">添加试题</el-button>
    </div>

    <el-table :key="tableKey" v-loading="handleLoading" :data="list" border stripe fit highlight-current-row style="width: 100%;" max-height="736" size="mini">
      <el-table-column label="试题编号" fixed="left" prop="id" align="center" width="80">
        <template slot-scope="{ row }">
          <span>{{ row.q_id }}</span>
        </template>
      </el-table-column>
      <el-table-column label="试题内容" prop="q_content" min-width="400px" align="left">
        <template slot-scope="{ row }">
          <span>{{ row.q_content}}</span>
        </template>
      </el-table-column>
      <el-table-column label="试题类型" prop="qt_name" align="center" width="80">
        <template slot-scope="{ row }">
          <span>{{ getType(row.qt_id) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="所属章节" prop="p_name" align="center" min-width="140">
        <template slot-scope="{ row }">
          <span>{{ getChapter(row.ec_id) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="难易度" prop="q_difficulty" align="center" min-width="60">
        <template slot-scope="{ row }">
          <span>{{ getDifficulty(row.q_difficulty) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="知识点" prop="q_ability" align="center" min-width="80">
        <template slot-scope="{ row }">
          <span>{{ row.q_ability }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" prop="create_time" align="center" min-width="120">
        <template slot-scope="{ row }">
          <span>{{ row.q_create_time | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="编辑" fixed="right" align="center" min-width="180" class-name="small-padding fixed-width">
        <template slot-scope="{ row }">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">修改</el-button>

          <el-popover v-model="row.visible" placement="top" width="160">
            <p>是否删除这道试题？</p>
            <div style="text-align: right; margin: 0">
              <el-button size="mini" type="text" @click="call(row)">取消</el-button>
              <el-button type="primary" size="mini" @click="del(row)">确定</el-button>
            </div>
            <el-button slot="reference" size="mini" type="danger">删除</el-button>
          </el-popover>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      v-if="total > keyAndPage.pageNo"
      class="ctlyt-page"
      background
      :page-size="keyAndPage.pageSize"
      layout="prev, pager, next,total"
      :total="total"
      @current-change="currentChange"
    />
    <el-dialog :title="title" :model="question" :visible.sync="dialogFormVisible" width="75%" top="5vh">
      <el-form ref="form" label-width="120px">
        <el-form-item label="试题内容:" />
        <el-form-item label="" label-width="50px"><tinymce ref="md" v-model="question.q_content" :height="200" :value="question.q_content" menubar="" :toolbar="toolbar" /></el-form-item>
        <el-form-item label="所属章节:">
          <el-cascader
            v-model="selectedOptions"
            class="filter-item"
            style="width: 300px"
            expand-trigger="hover"
            :show-all-levels="false"
            :options="options"
            :clearable="true"
            placeholder="选择课程"
          />
          <el-select v-model="question.qt_id" placeholder="试题类型"><el-option v-for="item in types" :key="item.value" :label="item.name" :value="item.value" /></el-select>
          <el-select v-model="question.q_difficulty" placeholder="难易度"><el-option v-for="item in difficultys" :key="item.d_id" :label="item.d_name" :value="item.d_id" /></el-select>
        </el-form-item>
        <div v-if="question.qt_id == 1 || question.qt_id == 2">
          <el-form-item label="选项:" class="ctlyt-option">
            <el-input
              v-for="(o, index) in question.options"
              :key="index"
              v-model="o.o_content"
              :value="o.o_content"
              style="margin:5px 0 ; width: 50%;"
              class="ctlyt-right"
              :placeholder="o.o_desc"
            />
          </el-form-item>
          <el-form-item label="答案:">
            <el-select v-if="question.qt_id == 1" v-model="question.answer.a_title" placeholder="答案">
              <el-option v-for="item in question.options" :key="item.o_content" :label="item.o_content" :value="item.o_content" />
            </el-select>
            <el-select v-if="question.qt_id == 2" v-model="question.answer.a_titles" multiple placeholder="答案">
              <el-option v-for="item in question.options" :key="item.o_content" :label="item.o_content" :value="item.o_content" />
            </el-select>
          </el-form-item>
        </div>
        <el-form-item v-if="question.qt_id == 3" label="答案:">
          <el-radio-group v-model="question.answer.judge">
            <el-radio-button label="1">对</el-radio-button>
            <el-radio-button label="0">错</el-radio-button>
          </el-radio-group>
        </el-form-item>
        <el-form-item v-if="question.qt_id > 3" label="答案:">
          <el-tooltip class="item" effect="dark" content="填空题多个答案以' | '区分" placement="top">
            <el-input v-model="question.answer.text" placeholder="答案" minlength="1" />
          </el-tooltip>
        </el-form-item>
        <el-form-item label="解析:"><el-input v-model="question.q_parse" placeholder="考题解析" /></el-form-item>
        <el-form-item label="知识点:"><el-input v-model="question.q_ability" placeholder="内容的知识点" /></el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="onSubmit">提交</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import { getChapterTree } from '@/api/other.js'
import { getQuestions, addQuestion } from '@/api/question.js'
import { getChaptersAll } from '@/api/chapter.js'
import Tinymce from '@/components/Tinymce'
import { parseTime } from '@/utils'
import { fromTextArea } from 'codemirror'

export default {
  name: 'EditForm',
  components: { Tinymce },
  computed: {
    ...mapGetters(['name'])
  },
  data() {
    return {
      tableKey: 0,
      content: '试题内容',
      toolbar: ['hr bold italic underline strikethrough forecolor backcolor image codesample table media subscript superscript undo redo code charmap fullscreen'],
      dialogFormVisible: false, // 试题显示隐藏
      options: [], // 专业课程
      selectedOptions: null,
      handleLoading: false,
      visible: false,
      title: null,
      list: null,
      total: 0, // 数量
      question: {
        answer: {}
      },
      // 查询数据
      keyAndPage: {
        q_content: null,
        qt_id: null,
        ec_id: null,
        pageNo: 1,
        pageSize: 17
      },
      chapters:[],
      difficultys: [
        {
          d_id: 1,
          d_name: '简单'
        },
        {
          d_id: 2,
          d_name: '中等'
        },
        {
          d_id: 3,
          d_name: '困难'
        }
      ],
      types: [
        {
          value: 1,
          name: '单选题'
        },
        {
          value: 2,
          name: '多选题'
        },
        {
          value: 3,
          name: '判断题'
        },
        {
          value: 4,
          name: '填空题'
        },
        {
          value: 5,
          name: '简答题'
        }
      ]
    }
  },
  created() {
    this.getChapterTreeAll()
    this.getQuestionAll()
  },
  methods: {
    getType(id){
      let name;
      this.types.forEach(item=>{
        if(item.value === id){
          name = item.name
        }
      })
      return name;
    },
    getDifficulty(id){
      let name;
      
      this.difficultys.forEach(item=>{
        if(item.d_id === parseInt(id)){
          name = item.d_name;
        }
      })
      return name;
    },
    getChapter(id){
      let name;
      this.chapters.forEach(item=>{
        if(item.ec_id === id){
          name = item.ec_name;
        }
      })
      return name;
    },
    getChapterTreeAll() {
      getChapterTree().then(res => {
        const list = res.data
        this.options = list
      })
      getChaptersAll().then(res=>{
        this.chapters = res.data;
      })
    },
    addOption(data) {
      data.options.push({ o_content: '', o_desc: '选项内容'})
    },

    // 显示试题弹框
    showQuestion() {
      console.log(this.$refs.md)

      this.dialogFormVisible = true
      this.$refs.md.showMd()
    },
    addQuestion() {
      this.title = '添加试题'
      const data = {
        q_id: null,
        q_content: '<p></p>',
        qt_id: 1,
        ec_id: 1,
        answer:{},
        options: []
      }
      for (let i = 0; i < 4; i++) {
        this.addOption(data)
      }
      this.question = data
      this.showQuestion()
    },
    getQuestionAll() {
      this.keyAndPage.pageNo = 1
      this.handleFilter()
    },
    handleFilter() {
      if (this.selectedOptions) {
        this.keyAndPage.ec_id = this.selectedOptions[this.selectedOptions.length - 1]
      }

      this.handleLoading = true
      getQuestions(this.keyAndPage)
        .then(res => {
          this.list = res.data.list
          this.list.forEach(item => {
            item.visible = false
          })
          this.total = res.data.total
          this.handleLoading = false
        })
        .catch(err => {
          this.handleLoading = false
        })
    },
    currentChange(e) {
      this.keyAndPage.pageNo = e
      this.handleFilter()
    },
    onSubmit() {
      let an
      const options = []

      switch(this.question.qt_id){
        case 1:
          this.question.optionList.forEach(item => {
            if (item.o_content) {
              if(this.question.answer.a_title == item.o_content){
                options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: true })
              }else{
                options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: false })
              }
            }
          })
          break;
        case 2:
           this.question.optionList.forEach(item => {
            if (item.o_content) {
              let tmp = { o_id: item.o_id, o_content: item.o_content, q_id: this.question.q_id,o_flag: false }
              this.question.answer.a_titles.forEach(title => {
                if(title === item.o_content){
                  tmp.o_flag = true;
                }
              })
              options.push(tmp);
            }
          })
          break;
        case 3:
          this.question.optionList.forEach(item => {
            if (item.o_content) {
              options.push({ o_id: item.o_id, o_content: this.question.answer.judge, q_id:  this.question.q_id,o_flag: true })
            }
          })
          break;
        case 4:
          break;



      }
      if (this.question.qt_id <= 2) {
        this.question.optionList.forEach(item => {
          if (item.o_content) {
            if(this.question.answer.a_title == item.o_content){
              options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: true })
            }else{
              options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: false })
            }
            
          }
        })
      }
      if (!this.selectedOptions) {
        this.$message({
          message: '请选择试题章节',
          type: 'warning'
        })
        return
      }
      const question = {
        q_id: this.question.q_id,
        q_content: this.question.q_content,
        q_difficulty: this.question.q_difficulty,
        qt_id: this.question.qt_id,
        q_create_name: this.name,
        // adjunct: this.form.desc,
        q_parse:this.question.q_parse,
        q_ability: this.question.q_ability,
        ec_id: this.selectedOptions[this.selectedOptions.length - 1]
      }
      if (!question.q_content) {
        this.$message({
          message: '题目不允许为空',
          type: 'warning'
        })
        return
      }
      if (!an.a_title) {
        this.$message({
          message: '答案不允许为空',
          type: 'warning'
        })
        return
      }
      question.ops = JSON.stringify(options)
      if (!question.q_id) {
        addQuestion(question).then(res => {
          if (res.code) {
            this.$message({
              message: '试题添加成功',
              type: 'success'
            })
            this.handleFilter()
            this.dialogFormVisible = false
          }
        })
      } else {
        // updateQuestion({ answer: JSON.stringify(an), options: JSON.stringify(options), question: JSON.stringify(question) }).then(res => {
        //   if (res.code) {
        //     this.$message({
        //       message: '试题修改成功',
        //       type: 'success'
        //     })
        //     this.handleFilter()
        //     this.dialogFormVisible = false
        //   }
        // })
      }
    },
    call(row) {
      row.visible = false
      this.$message({
        message: '取消删除'
      })
    },
    del(row) {
      row.visible = false
      // delQuestion({ qid: row.q_id }).then(res => {
      //   if (res.code) {
      //     for (let i = 0; i < this.list.length; i++) {
      //       if (this.list[i].q_id === row.q_id) {
      //         this.list.splice(i, 1)
      //         break
      //       }
      //     }
      //     this.$message({
      //       message: '删除试题成功',
      //       type: 'success'
      //     })
      //   }
      // })
    },
    handleQuetion() {},
    handleUpdate(row) {
      // row.title = '<p>'+row.title+'</p>'
      row.options.forEach(item=>{
        switch(row.qt_id){
          case 1:
            if(item.q_flag){
              this.question.answer.a_title = item.o_content;
            }
            break;
          case 2:
            if(item.q_flag){
              this.question.answer.a_titles.push(item.o_content)
            }
            break;
          case 3:
            this.question.answer.judge = item.o_content;
            break;
          case 4:
            break;
        }
      })
    

      // row.professionTree.p_id;

      this.question = row

      console.log(this.question)
      this.title = '修改试题'
      this.showQuestion()
    }
  }
}
</script>
<style>
.ctlyt-page {
  padding: 10px 0px;
  margin: 0 auto;
}
.ctlyt-right {
  padding-right: 1.25rem;
}
</style>
