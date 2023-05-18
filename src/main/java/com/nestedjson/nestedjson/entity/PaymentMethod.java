package com.nestedjson.nestedjson.entity;

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
public class PaymentMethod {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Payment method customer ID is required")
    private String customerid;

    @NotEmpty(message = "Payment Type is required")
    private String type;

    @NotEmpty(message = "Card number is required")
    private String cardNumber;

    @NotEmpty(message = "Month of expiration is required")
    private String expirationMonth;

    @NotEmpty(message = "Expiration Year is required")
    private String expirationYear;

    @NotEmpty(message = "Card CVV is required")
    private String cvv;

    @NotEmpty(message = "Card Billing ID is required")
    private String billindaddressid;


}
