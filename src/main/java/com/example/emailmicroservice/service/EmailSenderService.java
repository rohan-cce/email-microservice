package com.example.emailmicroservice.service;

import com.example.emailmicroservice.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.mail.MessagingException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;
    OrderDetails orderDetails;

    public void sendSimpleEmail(String toEmail,String subject,String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo(toEmail);
        message.setText(subject);
        message.setSubject(body);
        mailSender.send(message);
        System.out.println("Mail Send...");


    }

    public void triggerMail(String toEmail,String  subject, String body) throws MessagingException {
       sendSimpleEmail(toEmail,subject,body);
        //System.out.println(toEmail);
    }

}




//    String toEmail,
//    String subject,
//    String body