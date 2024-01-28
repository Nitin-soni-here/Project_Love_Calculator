package org.springProject.Servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServicesLayer implements EmailMethods {
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void SendEmail(String userName, String userEmail, String Result) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(userEmail);
        simpleMailMessage.setSubject("Love Calculator Application Result");
        simpleMailMessage.setText("Hello"+userName+"The result is predict by love Calculator Application is"+Result);

        javaMailSender.send(simpleMailMessage);
    }
}
