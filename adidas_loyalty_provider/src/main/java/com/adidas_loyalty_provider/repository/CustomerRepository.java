package com.adidas_loyalty_provider.repository;

import com.adidas_loyalty_provider.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends GenericRepository<Customer, String>{
    List<Customer> findByZone(String zone);
}
