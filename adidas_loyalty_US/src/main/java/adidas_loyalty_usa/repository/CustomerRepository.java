package adidas_loyalty_usa.repository;

import adidas_loyalty_usa.common.generic.GenericRepository;
import adidas_loyalty_usa.entity.Customer;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository("customerRepository")
public interface CustomerRepository extends GenericRepository<Customer, String> {
    List<Customer> findByDateOfBirth(LocalDate localDate);
}
