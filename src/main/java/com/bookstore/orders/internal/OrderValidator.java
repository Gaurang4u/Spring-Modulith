
package com.bookstore.orders.internal;

import com.bookstore.orders.api.OrderValidation;
import org.springframework.stereotype.Component;

@Component
class OrderValidator implements OrderValidation {

    @Override
    public boolean isValid(String orderId) {
        return orderId != null && !orderId.isBlank();
    }
}
