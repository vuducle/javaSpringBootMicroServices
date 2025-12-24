package org.miniairbnb.customer.Repository;

import org.miniairbnb.customer.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
