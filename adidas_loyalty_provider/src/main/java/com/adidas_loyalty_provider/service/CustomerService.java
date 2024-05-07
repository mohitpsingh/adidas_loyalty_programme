package com.adidas_loyalty_provider.service;

import com.adidas_loyalty_provider.entity.Customer;
import com.adidas_loyalty_provider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Customer> getByZone(String zone) {
        return customerRepository.findByZone(zone);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
