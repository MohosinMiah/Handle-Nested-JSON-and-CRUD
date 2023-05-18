package com.nestedjson.nestedjson.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestedjson.nestedjson.entity.Orders;
import com.nestedjson.nestedjson.repository.OrdersRepository;
import com.nestedjson.nestedjson.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    OrdersRepository ordersRepository;


    @Override
	public Orders fetchOrderById(String orderId) {
        // Get Order By ID
		return ordersRepository.findById(orderId).get();
	}


    @Override
    public List<Orders> fetchOrderList() {
        // Get Order List
        return ordersRepository.findAll();
    }

    



}
