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
public class BillingAddress {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Billing Address is required")
    private String billindaddressid;

    @NotEmpty(message = "Billing street is required")
    private String street;

    @NotEmpty(message = "Billing city is required")
    private String city;

    @NotEmpty(message = "Billing state is required")
    private String state;

    @NotEmpty(message = "Billing zip is required")
    private String zip;

}
