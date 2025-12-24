package org.miniairbnb.customer.Controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.miniairbnb.customer.Model.Address;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer firstname is required")
        String lastname,
        @NotNull(message = "Customer Email is required")
        @Email(message = "Customer Email is not a valid email address")
        String email,
        Address address
) {

}
