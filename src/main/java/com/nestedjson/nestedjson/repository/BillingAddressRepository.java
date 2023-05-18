package com.nestedjson.nestedjson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestedjson.nestedjson.entity.BillingAddress;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, String>{
    
}
