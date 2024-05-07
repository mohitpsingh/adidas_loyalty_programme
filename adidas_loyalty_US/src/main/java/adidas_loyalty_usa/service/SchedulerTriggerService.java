package adidas_loyalty_usa.service;

import adidas_loyalty_usa.domain.CustomerDto;
import adidas_loyalty_usa.domain.CustomerResponse;
import adidas_loyalty_usa.entity.Customer;
import adidas_loyalty_usa.entity.ExecutionScheduler;
import adidas_loyalty_usa.handler.CustomerHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("schedulerTriggerService")
public class SchedulerTriggerService {
    private static final Logger LOGGER  = LoggerFactory.getLogger(SchedulerTriggerService.class);

    private String URL = "http://localhost:8081/api/customer/zones/?zone=US";

    @Autowired
    private SchedulerDataService service;

    @Autowired
    private CustomerHandler customerHandler;

    public void schedulerTrigger() {
        try {
            LOGGER.info("**********Scheduler Trigger Started**********");
            String schedulerId = fillerExecutionScheduler();
            LOGGER.info("SchedulerId {}", schedulerId);
            loadCustomerFromAPI();
            updateSchedulerStatus(schedulerId, "Completed");
        } catch (Exception e) {
            LOGGER.error("Exception Occurred");
        }
    }

    private String fillerExecutionScheduler() {
        ExecutionScheduler scheduler = new ExecutionScheduler();
        scheduler.setSchedulerId(UUID.randomUUID().toString());
        scheduler.setStatus("IN-PROGRESS");
        scheduler.setSchedulerStartTime(new Date());
        scheduler.setCreatedAt(new Date());
        return service.saveExecutionScheduler(scheduler);
    }

    private void updateSchedulerStatus(String schedulerId, String status) {
        ExecutionScheduler scheduler = service.getSchedulerById(schedulerId);
        scheduler.setStatus(status);
        scheduler.setSchedulerEndTime(new Date());
        service.updateExecutionScheduler(scheduler);
    }

    private void loadCustomerFromAPI() {
        try {
            LOGGER.info("Loading customer from API...");
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CustomerResponse> response = restTemplate.getForEntity(URL, CustomerResponse.class);
            CustomerResponse customerResponse = response.getBody();
            if (customerResponse.getStatus() == 200) {
                List<CustomerDto> customerDto = customerResponse.getData();
                List<Customer> customers = customerHandler.processCustomer(customerDto);
                LOGGER.info("Converted Response {}", customers);
            }
        } catch (Exception e) {
            LOGGER.error("Error loading customer from API", e);
        }
    }
}
