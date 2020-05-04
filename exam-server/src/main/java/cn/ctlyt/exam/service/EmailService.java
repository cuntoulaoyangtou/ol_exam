package cn.ctlyt.exam.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;


/**
 * @program: thesis
 * @description: 邮件服务
 * @author: 村头老杨头
 * @create: 2020-04-29 00:09
 */

@Service
public class EmailService {
    private final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender javaMailSender;
    /**
     * 发件人。这里发件人一般是同使用的发件邮箱一致
     */
    @Value("${spring.mail.username}")
    private String from;


    /**
     * 发送文本邮件
     * @param to 收件人邮箱地址
     * @param subject 主题
     * @param content 内容
     */
    public void sendTextMail(String to,
                             String subject,
                             String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        simpleMailMessage.setFrom(from);
        logger.info("____发送文本邮件到：{} \t 主题：{}\n内容：{}",to,subject,content);
        javaMailSender.send(simpleMailMessage);
    }


    /**
     * 发送html内容的邮件
     * @param to 收件人
     * @param htmlContent html内容
     * @param subject 主题
     * @throws MessagingException
     */
    public void sendHtmlMail(String to,
                             String htmlContent,
                             String subject) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setFrom(from);
        messageHelper.setText(htmlContent, true);
        logger.info("____发送HTML邮件到：{} \t 主题：{}\n内容：{}",to,subject,htmlContent);
        javaMailSender.send(message);
    }

    /**
     * 发送图文邮件
     * @param to 收件人
     * @param imgContent 图文内容
     * @param subject 主题
     * @param rscId 资源id
     * @param imgPath 资源路径
     * @throws MessagingException
     */
    public void sendImgMail(String to,
                            String imgContent,
                            String subject,
                            String rscId,
                            String imgPath) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setFrom(from);
        messageHelper.setText(imgContent, true);
        messageHelper.addInline(rscId, new File(imgPath));
        logger.info("____发送图文邮件到：{} \t 主题：{}\n内容：{}",to,subject,imgContent);
        javaMailSender.send(message);
    }
}
