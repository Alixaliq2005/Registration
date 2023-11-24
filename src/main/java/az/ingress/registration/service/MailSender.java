package az.ingress.registration.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;
@Service
public class MailSender {

    public void sendEmail(String to, String subject, String text) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl ();
        mailSender.setHost ("alihuseynxaliqov5.gmail.com");
        mailSender.setPort (587);
        mailSender.setUsername ("ali");
        mailSender.setPassword ("password");

        Properties props = mailSender.getJavaMailProperties ();
        props.put ("mail.transport.protocol", "smtp");
        props.put ("mail.smtp.auth", "true");
        props.put ("mail.smtp.starttls.enable", "true");
        props.put ("mail.debug", "true");

        SimpleMailMessage mailMessage = new SimpleMailMessage ();
        mailMessage.setTo (to);
        mailMessage.setSubject (subject);
        mailMessage.setText (text);

        mailSender.send (mailMessage);

    }
}