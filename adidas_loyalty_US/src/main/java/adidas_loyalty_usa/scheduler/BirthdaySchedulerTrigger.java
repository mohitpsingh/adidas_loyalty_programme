package adidas_loyalty_usa.scheduler;

import adidas_loyalty_usa.entity.Customer;
import adidas_loyalty_usa.service.CustomerService;
import adidas_loyalty_usa.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component("birthdaySchedulerTrigger")
public class BirthdaySchedulerTrigger {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 0 * * ?")
    public void sendBirthdayWish() {
        List<Customer> customer = customerService.getCustomerByDateOfBirth(LocalDate.now());
        for (Customer birthdayGuy : customer) {
            emailService.sendBirthdayWish(birthdayGuy.getEmail());
        }
    }
}
