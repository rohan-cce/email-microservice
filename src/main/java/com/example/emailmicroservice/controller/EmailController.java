package com.example.emailmicroservice.controller;

import com.example.emailmicroservice.model.OrderDetails;
import com.example.emailmicroservice.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.time.LocalDate;

@RestController
@RequestMapping("/")
@CrossOrigin(value = "*")
public class EmailController {

    @Autowired
    EmailSenderService emailSenderService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody OrderDetails orderDetails) throws MessagingException {
        //System.out.println(orderDetails);
        String toEmail = orderDetails.getUserEmail();
        String subject = "Your order "+orderDetails.getOrderId()+" is successfull.";
        String body = "hello "+orderDetails.getUserName()+" \n Thank you for your order. We'll send a confirmation when your order ships. \n You can pickup your car on "
                +LocalDate.now().plusDays(20)+" \n \n Order Summary "+orderDetails.getOrderId()+"\n placed on "+LocalDate.now() + "\nOrder Amount : Rs"
                +orderDetails.getTotalPrice()+"\n\n\n We Hope you had a good experience with our platform";
        emailSenderService.triggerMail( toEmail,body,subject);
        return "Successfully sent";
    }
}
