package adidas_loyalty_usa.service;

import adidas_loyalty_usa.entity.Customer;
import adidas_loyalty_usa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("CustomerService")
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> saveCustomers(List<Customer> customerList) {
        customerRepository.saveAll(customerList);
        return customerList;
    }

    public List<Customer> getCustomerByDateOfBirth(LocalDate localDate) {
        return customerRepository.findByDateOfBirth(localDate);
    }
}
