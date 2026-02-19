
package com.bookstore.inventory;

import com.bookstore.orders.api.OrderValidation;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final OrderValidation validator;

    public InventoryService(OrderValidation validator) {
        this.validator = validator;
    }

    public boolean canReserve(String orderId) {
        return validator.isValid(orderId);
    }
}
