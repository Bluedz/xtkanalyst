package com.xtk.xtkanalyst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

public class EmailActionService {

//    @Value("${spring.mail.username}")

    private String sendName, subject;
    private final JavaMailSender mailSender;
    public EmailActionService(JavaMailSender mailSender, String sn, String subj) {
        this.mailSender = mailSender;
        this.sendName = sn;
        this.subject = subj;
    }

    public String sendSimpleMsg(String msg, String email){
        if (StringUtils.isEmpty(msg) || StringUtils.isEmpty(email)){
            return "请输入要发送消息和目标邮箱";
        }

        try{
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setFrom(sendName);
            mail.setTo(email);
            mail.setSubject(subject);
            mail.setText(msg);
            mailSender.send(mail);
            return "发送成功";
        }catch (Exception ex){
            ex.printStackTrace();
            return "发送失败:" + ex.getMessage();
        }
    }



}
