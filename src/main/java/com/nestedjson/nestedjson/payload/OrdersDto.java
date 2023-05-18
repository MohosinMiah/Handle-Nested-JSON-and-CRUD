package com.nestedjson.nestedjson.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {
    @NotEmpty(message = "Orders ID is required")
    private String orderid;

    @NotEmpty(message = "Orders customer ID is required")
    private String customerid;

    @NotEmpty(message = "Orders order date is required")
    private String orderdate;
}
