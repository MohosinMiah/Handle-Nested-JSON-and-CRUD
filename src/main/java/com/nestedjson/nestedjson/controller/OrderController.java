package com.nestedjson.nestedjson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nestedjson.nestedjson.entity.Orders;
import com.nestedjson.nestedjson.service.OrdersService;

@RestController
public class OrderController {
    
    @Autowired
    OrdersService orderService;

    @GetMapping("order/list")
    public List<Orders> fetchOrderList()
    {
        return orderService.fetchOrderList();
    }

    @GetMapping("order/{orderId}")
    public Orders fetchOrderById(@PathVariable("orderId") String orderId )
    {
        return orderService.fetchOrderById(orderId);
    }
}
