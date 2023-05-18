package com.nestedjson.nestedjson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestedjson.nestedjson.entity.BaseOrder;

@Repository
public interface BaseOrderRepository extends JpaRepository<BaseOrder, String> {
    
}
