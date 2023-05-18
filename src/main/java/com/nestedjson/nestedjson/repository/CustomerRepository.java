package com.nestedjson.nestedjson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nestedjson.nestedjson.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{
    
}
