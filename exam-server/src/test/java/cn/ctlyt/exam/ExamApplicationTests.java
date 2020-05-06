package cn.ctlyt.exam;

import cn.ctlyt.exam.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;

@SpringBootTest
class ExamApplicationTests {

    @Autowired
    EmailService emailService;
    @Test
    void contextLoads() {
//        String str = "<h1>今天天气不错</h1><a href='www.baidu.com'>百度</a>";
//        try {
//            emailService.sendHtmlMail("2962598997@qq.com",str,"测试");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
    }

}
