package com.nestedjson.nestedjson.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Orders{

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Orders ID is required")
    private String orderid;

    @NotEmpty(message = "Orders customer ID is required")
    private String customerid;

    @NotEmpty(message = "Orders order date is required")
    private String orderdate;
}
