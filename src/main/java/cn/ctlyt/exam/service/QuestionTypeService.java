package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.QuestionTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNameQuestionTypeService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:16
 * @Version V1.0
 **/
@Service
public class QuestionTypeService {
    @Autowired
    QuestionTypeMapper questionTypeMapper;
}
