package com.nestedjson.nestedjson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nestedjson.nestedjson.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{

    @Query("SELECT od FROM OrderDetail od WHERE od.orderid = :orderid")
    List<OrderDetail> findByOrderDetailOrderid(@Param("orderid") String orderId);
}
