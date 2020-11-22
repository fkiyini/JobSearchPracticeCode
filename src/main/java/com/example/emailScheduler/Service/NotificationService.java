package com.example.emailScheduler.Service;

import com.example.emailScheduler.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class NotificationService {

    private int count = 1;
    private JavaMailSender javaMailSender;
//    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){

        this.javaMailSender = javaMailSender;
    }

//    public void reportCurrentTime(){
//        System.out.println("The time is now is "+dateFormat.format(new Date()));
//    }
    @Scheduled(fixedRate = 50000)
    public void sendNotification(User user) throws MailException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmailAddress());
        mailMessage.setFrom("fktele989@gmail.com");
        mailMessage.setSubject("Hello World");
        mailMessage.setText("This is a cool email Notification");

        javaMailSender.send(mailMessage);
    }

}
