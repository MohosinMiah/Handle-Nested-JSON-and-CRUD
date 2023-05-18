package com.nestedjson.nestedjson.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto {
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
