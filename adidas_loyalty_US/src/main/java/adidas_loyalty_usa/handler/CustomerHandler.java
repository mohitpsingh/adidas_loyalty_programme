package adidas_loyalty_usa.handler;

import adidas_loyalty_usa.domain.CustomerDto;
import adidas_loyalty_usa.domain.DomainConverter;
import adidas_loyalty_usa.entity.Customer;
import adidas_loyalty_usa.service.CustomerService;
import adidas_loyalty_usa.utils.Tier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("CustomerHandler")
public class CustomerHandler {

    @Autowired
    private DomainConverter domainConverter;

    @Autowired
    private CustomerService customerService;

    private static final Logger LOGGER  = LoggerFactory.getLogger(CustomerHandler.class);

    public List<Customer> processCustomer(List<CustomerDto> customerDtos) {
        List<Customer> customerList = new ArrayList<>();
        try {
            for (CustomerDto customerDto : customerDtos) {
                Customer customer = domainConverter.toEntity(customerDto);
                Customer validCustomer = tierDistribure(customer);
                customerList.add(validCustomer);
                LOGGER.info("Customer From the Valid List {}", validCustomer);
            }
            LOGGER.info("Customers {}", customerList);
            persistCustomerProcess(customerList);
            return customerList;
        } catch (Exception e) {
            LOGGER.error("Err0r");
        }
        return customerList;
    }

    private Customer tierDistribure(Customer customer) {
        Long amount = Long.parseLong(customer.getTotalPurchaseAmount());
        LOGGER.info("The Amount Value is {}", amount);
        if (amount >= 8000) {
            customer.setTier(Tier.PLATINUM);
        } else if (amount >= 5000) {
            customer.setTier(Tier.GOLD);
        } else {
            customer.setTier(Tier.SILVER);
        }
        LOGGER.info("Customer with Valid Tier {}", customer);
        return customer;
    }

    private void persistCustomerProcess(List<Customer> customersList) {
        List<Customer> savedCustomers =  customerService.saveCustomers(customersList);
    }

}
