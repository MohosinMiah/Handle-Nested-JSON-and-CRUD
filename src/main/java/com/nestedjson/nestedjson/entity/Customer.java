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
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.UUID )
    @NotEmpty(message = "Customer ID is required")
    private String id;

    @NotEmpty(message = "Customer name is required")
    private String name;

    @NotEmpty(message = "Customer email is required")
    private String email;
}
