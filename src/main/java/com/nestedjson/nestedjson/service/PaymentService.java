package com.nestedjson.nestedjson.service;

import com.nestedjson.nestedjson.payload.BaseOrderDto;

import jakarta.validation.Valid;

public interface PaymentService {

    BaseOrderDto createOrder(@Valid BaseOrderDto orderRequest);
}

