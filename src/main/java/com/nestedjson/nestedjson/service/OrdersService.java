package com.nestedjson.nestedjson.service;

import java.util.List;

import com.nestedjson.nestedjson.entity.OrderDetail;
import com.nestedjson.nestedjson.entity.Orders;

public interface OrdersService {
    
    public Orders fetchOrderById(String orderId);

    public List<Orders> fetchOrderList();

    public String updateOrderById(String orderId, Orders orders);

    public String deleteOrderById(String orderId);

    public List<OrderDetail> fetchOrderDetailsByOrderId(String orderId);



}
