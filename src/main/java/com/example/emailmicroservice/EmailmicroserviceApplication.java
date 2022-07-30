package com.example.emailmicroservice;

import com.example.emailmicroservice.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class EmailmicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmailmicroserviceApplication.class, args);
	}





}
