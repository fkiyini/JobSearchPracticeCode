package com.example.emailScheduler.Controller;


import com.example.emailScheduler.Domain.User;
import com.example.emailScheduler.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/signup")
    public String signUp(){
        return "please sign up for our service";
    }

    @PostMapping("/signup-success")
    public String signUpSuccess(User user){
        try{
            notificationService.sendNotification(user);
        }catch (MailException e){
            //catch error
        }
        return "Thank you for registering with us";
    }
}
