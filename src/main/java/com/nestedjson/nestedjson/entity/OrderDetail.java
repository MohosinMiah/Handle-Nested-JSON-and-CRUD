package com.nestedjson.nestedjson.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Order Details Id is required")
    private String orderdetailsid;

    @NotEmpty(message = "Order ID is required")
    private String orderid;

    @NotEmpty(message = "Product ID is requried")
    private String productid;

    @NotNull(message = "Product price is required")
    private Double price;

    @NotNull(message = "Product Quantity is required")
    private Integer quantity;
}
