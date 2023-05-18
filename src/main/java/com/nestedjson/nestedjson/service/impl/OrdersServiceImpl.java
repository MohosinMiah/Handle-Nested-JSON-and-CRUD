package com.nestedjson.nestedjson.service.impl;

import java.util.List;
import java.util.Objects;

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


    @Override
    public String updateOrderById(String orderId, Orders orders) {
        // Update By Order ID
        Orders updateOrder = ordersRepository.findById(orderId).get();
        
        // Check Order ID is exists or not before update
        if(updateOrder.getOrderid() == orderId )
        {
            if( Objects.nonNull( updateOrder.getCustomerid() ) && !"".equalsIgnoreCase(updateOrder.getCustomerid()))
            {
                updateOrder.setCustomerid(orders.getCustomerid());
            }

            if( Objects.nonNull( updateOrder.getCustomerid() ) && !"".equalsIgnoreCase(updateOrder.getCustomerid()))
            {
                updateOrder.setOrderdate(orders.getOrderdate());
            }

            ordersRepository.save(updateOrder);
            return "Order Update Successfully";
        }
        return "Order ID Not Found";
    }

    



}
