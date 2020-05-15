package cn.ctlyt.exam.controller.student.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: exam
 * @description: 考试视图控制器
 * @author: 村头老杨头
 * @create: 2020-05-06 11:46
 */
@Controller
@RequestMapping("view/exam")
public class ExamViewController {
    @GetMapping("test")
    public String getTest(){
        return "student/exam/test";
    }
}