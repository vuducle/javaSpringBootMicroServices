package org.miniairbnb.customer.Services;

import org.miniairbnb.customer.Controller.CustomerRequest;
import org.miniairbnb.customer.Controller.CustomerResponse;
import org.miniairbnb.customer.Model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        return Customer.builder()
                .id(request.id())
                .firstName(request.firstname())
                .lastName(request.lastname())
                .address(request.address())
                .email(request.email())
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
