package org.miniairbnb.customer.Exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerNotFoundException extends RuntimeException {
    private String msg;
    public CustomerNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
