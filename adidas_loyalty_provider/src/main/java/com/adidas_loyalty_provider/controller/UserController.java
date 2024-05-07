package com.adidas_loyalty_provider.controller;

import com.adidas_loyalty_provider.entity.Customer;
import com.adidas_loyalty_provider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class UserController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/zones")
    public ResponseEntity<?> getCustomerByZones(@RequestParam("zone") String zone) {
        List<Customer> customer = customerService.getByZone(zone);
        int statusCode = HttpStatus.OK.value();
        Map<String, Object> response = new HashMap<>();
        response.put("status", statusCode);
        response.put("data", customer);
        return ResponseEntity.status(statusCode).body(response);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
}
