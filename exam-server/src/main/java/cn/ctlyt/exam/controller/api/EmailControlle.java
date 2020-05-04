package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.MessagingException;

/**
 * @program: exam
 * @description: 邮箱控制器
 * @author: 村头老杨头
 * @create: 2020-04-30 17:16
 */
@Controller
public class EmailControlle {
/*    @Autowired
    EmailService emailService;
    @GetMapping("test")
    public void context() {
        String str = "<h1>今天天气不错</h1><a href='www.baidu.com'>百度</a>";
        try {
            emailService.sendHtmlMail("2962598997@qq.com",str,"测试");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }*/
}