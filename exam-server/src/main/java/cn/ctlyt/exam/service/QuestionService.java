package cn.ctlyt.exam.service;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.mapper.OptionMapper;
import cn.ctlyt.exam.mapper.QuestionMapper;
import cn.ctlyt.exam.pojo.Option;
import cn.ctlyt.exam.pojo.Question;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassNameQuestionService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:16
 * @Version V1.0
 **/
@Service
@Transactional
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    OptionMapper optionMapper;
    public PageInfo<Question> getQuestions(Integer pageNo, Integer pageSize, String q_content, Integer qt_id, Integer ec_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Question> questionsLikeContent = questionMapper.getQuestionsLikeContent(q_content, qt_id, ec_id);
        return new PageInfo<Question>(questionsLikeContent);
    }
    public int addQuestion(Question question){
        question.setQ_create_time(new Date());
        int i = questionMapper.insertSelective(question);
        if(question.getOptions()== null){
            throw new BizException("选项不能为空");
        }
        question.getOptions().forEach(item->{
            System.out.println(item);
            item.setQ_id(question.getQ_id());
            int i1 = (int) (Math.random() * 10000);
            item.setO_no(i1+"");
            optionMapper.insertSelective(item);
        });
        return i;
    }
    public int delQuestion(Integer qid){
        return questionMapper.deleteByPrimaryKey(qid);
    }
    public int updateQuestion(Question question){
        return questionMapper.updateByPrimaryKeySelective(question);
    }
}
