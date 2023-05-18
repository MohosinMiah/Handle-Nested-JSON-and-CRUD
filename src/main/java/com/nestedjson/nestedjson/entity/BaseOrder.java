package com.nestedjson.nestedjson.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseOrder {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Transaction ID is requirede")
    private String transactionId;

    @NotNull(message = "Order amount is required")
    private Double amount;

    @NotEmpty(message = "Order Currency is required")
    private String currency;

}