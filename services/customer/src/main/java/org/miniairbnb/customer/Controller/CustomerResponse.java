package org.miniairbnb.customer.Controller;

import org.miniairbnb.customer.Model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}
