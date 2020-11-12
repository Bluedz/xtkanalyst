package com.xtk.xtkanalyst.controller;

import com.xtk.xtkanalyst.service.EmailActionService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
@RequestMapping(value = "email")
public class EmailAction {

    @Value("${spring.mail.username}")
    private String sendName;

    private final JavaMailSender mailSender;
    // 也可以使用AutoWired

    public EmailAction(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

/*    @PostMapping(value = "simple")
    public String sendSimpleMsg(String msg, String email) {
        if (StringUtils.isEmpty(msg) || StringUtils.isEmpty(email)) {
            return "请输入要发送消息和目标邮箱";
        }

        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setFrom(sendName);
            mail.setTo(email);
            mail.setSubject("这是一封简单邮件");
            mail.setText(msg);
            mailSender.send(mail);
            return "发送成功";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "发送失败:" + ex.getMessage();
        }
    }*/

    //

    @PostMapping(value = "simple")
    public String sendSimpleMsg(String msg, String email, String subject){
       EmailActionService emailActionService = new EmailActionService(mailSender, sendName, subject);
        return emailActionService.sendSimpleMsg(msg, email);
    }
}


