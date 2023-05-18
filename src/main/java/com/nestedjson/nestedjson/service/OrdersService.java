package com.nestedjson.nestedjson.service;

import java.util.List;

import com.nestedjson.nestedjson.entity.Orders;

public interface OrdersService {
    
    Orders fetchOrderById(String orderId);

    List<Orders> fetchOrderList();

    public String updateOrderById(String orderId, Orders orders);



}
