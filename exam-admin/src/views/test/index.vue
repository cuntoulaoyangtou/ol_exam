<template>
  <div class="app-container">
    <div class="filter-container">
       <el-date-picker
        class="filter-item"
        v-model="date"
        type="daterange"
        align="right"
        unlink-panels
        range-separator="至"
        start-placeholder="开始日期"
        end-placeholder="结束日期"
        :picker-options="pickerOptions">
      </el-date-picker>
      <el-cascader
        v-model="selectedOptions"
        class="filter-item"
        style="width: 300px"
        expand-trigger="hover"
        :show-all-levels="false"
        :options="options"
        :clearable="true"
        placeholder="选择班级"
      />
      <el-input v-model="keyAndPage.q_content" class="filter-item" style="width: 15rem;" clearable placeholder="查询内容" />

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
          <span>{{ row.q_content.replace(/<\/?.+?\/?>/g,'')}}</span>
        </template>
      </el-table-column>
      <el-table-column label="试题类型" prop="qt_name" align="center" width="80">
        <template slot-scope="{ row }">
          <span>{{ getType(row.qt_id) }}</span>
        </template>
      </el-table-column>
      <el-table-column label="所属章节" prop="p_name" align="center" min-width="140">
        <template slot-scope="{ row }">
          <span>{{ row.ec_id }}</span>
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
    <el-dialog :title="title" :model="question" :visible.sync="dialogFormVisible" width="85%" top="5vh">
      <el-form ref="form" label-width="120px">
        <el-form-item label="试卷名称:">
          <el-input v-model="test.t_title" placeholder="试卷名称" />
        </el-form-item>
        <el-form-item label="试卷摘要:">
          <el-input v-model="test.t_summary" placeholder="试卷摘要" />
        </el-form-item>
        <el-row :gutter="24">
          <el-col :span="8">
            <el-form-item label="试卷摘要:">
              <el-select v-model="question.qt_id" placeholder="试题类型"><el-option v-for="item in types" :key="item.value" :label="item.name" :value="item.value" /></el-select>
            </el-form-item>
          </el-col>
          <el-col :span="6">
            <el-form-item label="总分:">
              <el-input v-model="test.t_summary" placeholder="总分"/>
            </el-form-item>
          </el-col>
          <el-col :span="7" :offset="3">
            <el-form-item label="其他老师是否可见:" label-width="140px" style="display:table;" class="ctlyt-sw">
              <el-switch
                style="display:block;"
                v-model="test.visibility"
                active-color="#409EFF"
                inactive-color="#ff4949"
                active-text="可见"
                inactive-text="不可见">
              </el-switch>
            </el-form-item>
          </el-col>
        </el-row>
        <el-form-item label="分数:">
          <el-row :gutter="24" style="margin:0">
            <el-col :span="4">
              <el-form-item label="选择题:" label-width="60px">
                <el-input v-model="test.single_val" placeholder="分值"/>
              </el-form-item>
            </el-col>
            <el-col :span="4" :offset="1">
              <el-form-item label="多选题:" label-width="60px">
                <el-input v-model="test.multiple_val" placeholder="分值"/>
              </el-form-item>
            </el-col>
            <el-col :span="4" :offset="1">
              <el-form-item label="判断题:" label-width="60px">
                <el-input v-model="test.judge_val" placeholder="分值"/>
              </el-form-item>
            </el-col>
            <el-col :span="4" :offset="1">
              <el-form-item label="填空题:" label-width="60px">
                <el-input v-model="test.filling_val" placeholder="分值"/>
              </el-form-item>
            </el-col>
            <el-col :span="4" :offset="1">
              <el-form-item label="简答题:" label-width="60px">
                <el-input v-model="test.short_val" placeholder="分值"/>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form-item>
        <el-row :gutter="24" style="margin:0">
          <el-col :span="6">
            <el-form-item label="班级选择:">
              <el-cascader
                v-model="clazzOptions"
                class="filter-item"
                expand-trigger="hover"
                :show-all-levels="false"
                :props="propsMajor"
                :options="options"
                :clearable="true"
                placeholder="选择班级"
              />
            </el-form-item>
          </el-col>
          <el-col :span="7">
            <el-form-item label="考试日期:">
              <el-date-picker
                class="filter-item"
                v-model="examDate"
                type="date"
                placeholder="选择日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="11">
            <el-form-item label="考试时间:">
              <el-time-picker
                class="filter-item"
                is-range
                v-model="time"
                range-separator="至"
                start-placeholder="开始时间"
                end-placeholder="结束时间"
                placeholder="选择时间范围">
              </el-time-picker>
            </el-form-item>
            
          </el-col>
        </el-row>
        <el-form-item label="创建方式">
          <el-tabs tab-position="top">
            <el-tab-pane label="随机选择">
              <el-row :gutter="24" class="ctlyt-bottom">
                <el-col :span="4">
                  <el-form-item label="选择题:" label-width="60px">
                    <el-input v-model="test.single_num" placeholder="数量"/>
                  </el-form-item>
                </el-col>
                <el-col :span="4" :offset="1">
                  <el-form-item label="多选题:" label-width="60px">
                    <el-input v-model="test.multiple_num" placeholder="数量"/>
                  </el-form-item>
                </el-col>
                <el-col :span="4" :offset="1">
                  <el-form-item label="判断题:" label-width="60px">
                    <el-input v-model="test.judge_num" placeholder="数量"/>
                  </el-form-item>
                </el-col>
                <el-col :span="4" :offset="1">
                  <el-form-item label="填空题:" label-width="60px">
                    <el-input v-model="test.filling_num" placeholder="数量"/>
                  </el-form-item>
                </el-col>
                <el-col :span="4" :offset="1">
                  <el-form-item label="简答题:" label-width="60px">
                    <el-input v-model="test.short_num" placeholder="数量"/>
                  </el-form-item>
                </el-col>
              </el-row>
              <el-row :gutter="24" class="ctlyt-bottom">
                <el-col :span="8">
                  <el-form-item label="章节:" label-width="60px">
                    <el-cascader
                      v-model="selectedMajorTree"
                      class="filter-item"
                      style="width: 300px"
                      expand-trigger="hover"
                      :show-all-levels="false"
                      :options="majorTree"
                      :clearable="true"
                      :props="propsMajor"
                      placeholder="选择章节"
                    />
                  </el-form-item>
                </el-col>
                <el-col :span="10" :offset="6">
                  <el-form-item label="难度系数:">
                    <div class="block">
                      <el-slider
                        v-model="test.difficulty"
                        show-input :max="10">
                      </el-slider>
                    </div>
                  </el-form-item>
                </el-col>
              </el-row>
              
            </el-tab-pane>
            <el-tab-pane label="手动选择">
              <el-button type="primary" @click="innerVisible = true">添加试题</el-button>
              <el-dialog
                width="70%"
                title="内层 Dialog"
                :visible.sync="innerVisible"
                append-to-body>
                <el-row :gutter="24">
                  <el-col :span="7">
                    <el-cascader
                      v-model="inSelectedMajorTree"
                      class="filter-item"
                      style="width: 300px"
                      expand-trigger="hover"
                      :show-all-levels="false"
                      :options="majorTree"
                      :clearable="true"
                      :props="propsMajor"
                      placeholder="选择章节"
                    />
                  </el-col>
                  <el-col :span="4">
                  </el-col>
                  <el-col :span="5">
                  </el-col>
                </el-row>
              </el-dialog>
            </el-tab-pane>
          </el-tabs>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="onSubmit" :loading="submitLoading">提交</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import { preTest } from '@/api/test.js'
import { getQuestions, addQuestion, delQuestion,updateQuestion} from '@/api/question.js'
import { parseTime } from '@/utils'

export default {
  name: 'EditForm',
  computed: {
    ...mapGetters(['name'])
  },
  data() {
    return {
       options: [], // 班级
       date:{},
       pickerOptions: {
          shortcuts: [{
            text: '最近一周',
            onClick(picker) {
              const end = new Date();
              const start = new Date();
              start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
              picker.$emit('pick', [start, end]);
            }
          }, {
            text: '最近一个月',
            onClick(picker) {
              const end = new Date();
              const start = new Date();
              start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
              picker.$emit('pick', [start, end]);
            }
          }, {
            text: '最近三个月',
            onClick(picker) {
              const end = new Date();
              const start = new Date();
              start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
              picker.$emit('pick', [start, end]);
            }
          }]
        },
      dialogFormVisible: false, // 试题显示隐藏
      selectedOptions: null,
      clazzOptions:null,
      selectedMajorTree:null,
      inSelectedMajorTree:null,
      //考试日期
      examDate:'',
      //考试时间
      time:{},

 

      majorTree:[],
      propsMajor:{
        multiple:true
      },
      innerVisible:false,
      test:{
        single_val:2,
        multiple_val:2,
        judge_val:2,
        filling_val:2,
        short_val:2,
        difficulty:5,

      },

      tableKey: 0,
      content: '试卷内容',
      submitLoading:false,

     
      
      handleLoading: false,
      visible: false,
      
      title: null,
      list: null,
      total: 0, // 数量
      question: {
        answer: {
          a_titles:[]
        }
      },
      // 查询数据
      keyAndPage: {q_content: null,qt_id: null,ec_id: null,pageNo: 1,pageSize: 17},
      difficultys: [{d_id: 1,d_name: '简单'},{d_id: 2,d_name: '中等'},{d_id: 3,d_name: '困难'}],
      types: [{value: 1,name: '单选题'},{value: 2,name: '多选题'},{value: 3,name: '判断题'},{value: 4,name: '填空题'},{value: 5,name: '简答题'}
      ]
    }
  },
  created() {
    preTest().then(res=>{
      res.data.shoolTree.forEach(item=>{
        this.options.push(item);
      })
      res.data.majorTree.forEach(item=>{
        this.majorTree.push(item);
      })
    })
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
    addOption(data) {
      data.options.push({o_no:Math.floor(Math.random()*10000),o_content: '', o_desc: '选项内容'})
    },

    // 显示试题弹框
    showQuestion() {

      this.dialogFormVisible = true

    },
    addQuestion() {
      this.title = '添加试题'
      const data = {
        q_id: null,
        q_content: '<p></p>',
        qt_id: 1,
        ec_id: 1,
        answer:{},
        options: [],
        q_difficulty:1
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
      this.submitLoading = true;
      console.log(this.clazzOptions);
      console.log(this.selectedMajorTree)
      // let an = true;
      // const options = []

      // switch(this.question.qt_id){
      //   case 1:
      //     this.question.options.forEach(item => {
      //       if (item.o_content) {
      //         if(this.question.answer.a_title == item.o_content){
      //           options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: true })
      //           an = false;
      //         }else{
      //           options.push({ o_id: item.o_id, o_content: item.o_content, q_id: item.q_id,o_flag: false })
      //         }
      //       }
      //     })
      //     break;
      //   case 2:
      //      this.question.options.forEach(item => {
      //       if (item.o_content) {
      //         let tmp = { o_id: item.o_id, o_content: item.o_content, q_id: this.question.q_id,o_flag: false }
      //         this.question.answer.a_titles.forEach(title => {
      //           if(title === item.o_content){
      //             tmp.o_flag = true;
      //             an = false;
      //           }
      //         })
      //         options.push(tmp);
      //       }
      //     })
      //     break;
      //   case 3:
      //       if (this.question.answer.judge!=null) {
      //         an = false;
      //         options.push({o_id:this.question.options[0].o_id|null, o_content: this.question.answer.judge, q_id:  this.question.q_id,o_flag: true })
      //       }
      //     break;
      //   case 4:
      //       if(this.question.answer.text.length>0){
      //         an = false;
      //         options.push({ o_id:this.question.options[0].o_id|null, o_content: this.question.answer.text.split("|"), q_id:  this.question.q_id,o_flag: true })
      //       }
      //     break;
      //   case 5:
      //       if(this.question.answer.text.length>0){
      //         an = false;
      //         options.push({o_id:this.question.options[0].o_id|null, o_content: this.question.answer.text, q_id:  this.question.q_id,o_flag: true })
      //       }
      //     break;
      // }
      // if (!this.selectedOptions) {
      //   this.$message({
      //     message: '请选择试题章节',
      //     type: 'warning'
      //   })
      //   this.submitLoading = false;
      //   return
      // }
      // const question = {
      //   q_id: this.question.q_id,
      //   q_content: this.question.q_content,
      //   q_difficulty: this.question.q_difficulty,
      //   qt_id: this.question.qt_id,
      //   q_create_name: this.name,
      //   // adjunct: this.form.desc,
      //   q_parse:this.question.q_parse,
      //   q_ability: this.question.q_ability,
      //   ec_id: this.selectedOptions[this.selectedOptions.length - 1]
      // }
      // if (!question.q_content) {
      //   this.$message({
      //     message: '题目不允许为空',
      //     type: 'warning'
      //   })
      //   this.submitLoading = false;
      //   return
      // }
      // if (an) {
      //   this.$message({
      //     message: '答案不允许为空',
      //     type: 'warning'
      //   })
      //   this.submitLoading = false;
      //   return
      // }
      // question.ops = JSON.stringify(options)
      // if (!question.q_id) {
      //   addQuestion(question).then(res => {
      //     if (res.code) {
      //       this.submitLoading = false;
      //       this.$message({
      //         message: '试题添加成功',
      //         type: 'success'
      //       })
      //       this.handleFilter()
      //       this.dialogFormVisible = false
      //     }
      //   })
      // } else {
      //   updateQuestion(question).then(res=>{
      //     if (res.code) {
      //       this.submitLoading = false;
      //       this.$message({
      //         message: '试题修改成功',
      //         type: 'success'
      //       })
      //       this.handleFilter()
      //       this.dialogFormVisible = false
      //     }
      //   })
      // }
    },
    call(row) {
      console.log(row)
      row.visible = false
      this.$message({
        message: '取消删除'
      })
    },
    del(row) {
      row.visible = false
      delQuestion({ qid: row.q_id }).then(res => {
        if (res.code) {
          for (let i = 0; i < this.list.length; i++) {
            if (this.list[i].q_id === row.q_id) {
              this.list.splice(i, 1)
              break
            }
          }
          this.$message({
            message: '删除试题成功',
            type: 'success'
          })
        }
      })
    },
    getSelectedOptions(ec_id){
      let arr = [];
        this.options.forEach(item=>{
          if(item.children!=null || item.children.length>0){
            item.children.forEach(it=>{
              if(it.children!=null || it.children.length>0){
                it.children.forEach(i=>{
                  if( parseInt(i.value) ===  parseInt(ec_id)){
                    arr = [item.value,it.value,i.value];
                  }
                })
              }
            })
          }
        })
        return arr;
    },
    handleQuetion() {},
    handleUpdate(row) {
      // row.title = '<p>'+row.title+'</p>'
      this.selectedOptions = this.getSelectedOptions(row.ec_id);

      const data = {
        q_id: row.q_id,
        q_content: row.q_content,
        qt_id: row.qt_id,
        ec_id: row.ec_id,
        answer:{
          a_title:null,
          a_titles:[]
        },
        options: [],
        q_difficulty: parseInt(row.q_difficulty),
        q_ability: row.q_ability,
        q_parse:row.q_parse
      }
      row.options.forEach(item=>{
        console.log(item);
        data.options.push(item);
        switch(row.qt_id){
          case 1:
            if(item.o_flag){
              data.answer.a_title = item.o_content;
            }
            break;
          case 2:
            if(item.o_flag){
              data.answer.a_titles.push(item.o_content)
            }
            break;
          case 3:
            data.answer.judge = item.o_content;
            break;
          case 4:
            data.answer.text = JSON.parse(item.o_content).join("|");
            break;
          case 5:
            data.answer.text = item.o_content;
            break;
        }
      })
    
      // row.professionTree.p_id;

     


      this.title = '修改试题'
      this.question = data;
      console.log(this.question)
      console.log("sele",this.selectedOptions);
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
.ctlyt-sw>div{
  display:table-cell;
  vertical-align: middle;
}
.ctlyt-bottom{
  margin-bottom: 22px;
}
</style>
