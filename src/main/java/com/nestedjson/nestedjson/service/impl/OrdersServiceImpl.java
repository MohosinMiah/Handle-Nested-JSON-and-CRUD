package com.nestedjson.nestedjson.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestedjson.nestedjson.entity.OrderDetail;
import com.nestedjson.nestedjson.entity.Orders;
import com.nestedjson.nestedjson.repository.OrderDetailRepository;
import com.nestedjson.nestedjson.repository.OrdersRepository;
import com.nestedjson.nestedjson.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;

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


    @Override
    public String deleteOrderById(String orderId) {
        // Delete Order
        Orders order = ordersRepository.findById(orderId).get();

        // Before Delete Order is exists or not
        if( order.getOrderid() != "" )
        {
            ordersRepository.deleteById(orderId);
            return "Order ID:  " + orderId + " Deleted Success fully";
        }
        return "Order ID: " + orderId + " Not Found";
    }


    @Override
    public List<OrderDetail> fetchOrderDetailsByOrderId(String orderId) {
        // Order Detail List By Order ID
        return orderDetailRepository.findByOrderDetailOrderid(orderId);
    }

    



}
