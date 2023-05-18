package com.nestedjson.nestedjson.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nestedjson.nestedjson.entity.Orders;
import com.nestedjson.nestedjson.payload.BaseOrderDto;
import com.nestedjson.nestedjson.service.PaymentService;

import jakarta.validation.Valid;

@RestController
public class PaymentController {

    @Autowired
    private  PaymentService paymentService;

    @PostMapping("/processorder")
    public ResponseEntity<String> saveCompany(@Valid @RequestBody BaseOrderDto orderRequest) {
        paymentService.createOrder(orderRequest);
        return ResponseEntity.ok("Order Request saved successfully");
    }

    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException e) {
    //     List<String> errors = e.getBindingResult().getAllErrors().stream()
    //             .map(ObjectError::getDefaultMessage)
    //             .collect(Collectors.toList());
    //     String errorMessage = String.join(",", errors);
    //     return ResponseEntity.badRequest().body(errorMessage);
    // }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationException(MethodArgumentNotValidException e) {
        Map<String, String> errors = new HashMap<>();
    
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            String fieldName = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        }

        Map<String, Object> errorResponse = new HashMap<>();

        errorResponse.put("errors", errors);
    
        return ResponseEntity.badRequest().body(errorResponse);
    }

// Response Sample By This Method  **********************************************************
// {
//     "errors": {
//         "employee.firstName": "Employee first name must requred",
//         "employee.lastName": "Employee last name must requred"
//     }
// }


}