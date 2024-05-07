package adidas_loyalty_usa.configuration;

import adidas_loyalty_usa.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfiguration {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("email@gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("your_username");
        mailSender.setPassword("your_password");
        return mailSender;
    }

    @Bean
    public EmailService emailService() {
        return new EmailService(javaMailSender());
    }


}
