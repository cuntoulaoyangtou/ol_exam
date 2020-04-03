package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Option;
import cn.ctlyt.exam.pojo.Question;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.QuestionService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassNameQuestionController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:19
 * @Version V1.0
 **/
@RestController("adminQuestionControoler")
@RequestMapping("admin/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @PostMapping("getquestions")
    public Result getQuestions(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize,@RequestParam(value = "q_content",required = false)String q_content,@RequestParam(value="qt_id",defaultValue="0" ,required=false)Integer qt_id,@RequestParam(value="ec_id",defaultValue="0" ,required=false)Integer ec_id){
        PageInfo<Question> questions = questionService.getQuestions(pageNo, pageSize, q_content, qt_id, ec_id);
        return ResultGenerator.genSuccessResult(questions);
    }
    @PostMapping("add")
    public Result addQuestion(Question question,String ops){
        List<Option> options = JSON.parseArray(ops, Option.class);
        question.setOptions(options);
        int i = questionService.addQuestion(question);
        return ResultGenerator.genSuccessResult(question);
    }
    @PostMapping("del")
    public Result delQuestion(Integer qid){
        int i = questionService.delQuestion(qid);
        return ResultGenerator.genSuccessResult(i);
    }
    @PostMapping("update")
    public Result updateQuestion(Question question,String ops){
        List<Option> options = JSON.parseArray(ops, Option.class);
        question.setOptions(options);
        int i = questionService.updateQuestion(question);
        return ResultGenerator.genSuccessResult(question);
    }
}
