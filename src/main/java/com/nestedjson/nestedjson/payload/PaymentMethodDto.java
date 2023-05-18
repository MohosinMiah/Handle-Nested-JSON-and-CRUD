package com.nestedjson.nestedjson.payload;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDto {
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

    @Valid
    @NotNull(message = "Billing address is required")
    private BillingAddressDto billingAddress;
}
