
package com.bookstore.orders;

import com.bookstore.orders.api.OrderValidation;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderValidation validation;

    public OrderService(OrderValidation validation) {
        this.validation = validation;
    }

    public boolean processOrder(String orderId) {
        return validation.isValid(orderId);
    }
}
