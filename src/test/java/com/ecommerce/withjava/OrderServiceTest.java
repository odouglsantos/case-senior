package com.ecommerce.withjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private final OrderService orderService = new OrderService();

    @Test
    void shouldApplySilverDiscount() {
        Order order = new Order("1", "SILVER", -100.0);
        double result = orderService.calculateTotal(order);

        Assertions.assertEquals(90.0, result);
    }

    @Test
    void shouldApplyPlatinumDiscount() {
        Order order = new Order("2", "PLATINUM", 100.0);
        double result = orderService.calculateTotal(order);

        Assertions.assertEquals(85.0, result);
    }

    @Test
    void shouldApplyPercentageBonusForHighValues() {
        Order order = new Order("3", "SILVER", 238.0);
        double result = orderService.calculateTotal(order);

        Assertions.assertEquals(1600.0, result);
    }

    @Test
    void shouldHandleUnknownTypes() {
        Order order = new Order("5", "", 1000.0);
        double result = orderService.calculateTotal(order);

        Assertions.assertEquals(100.0, result);
    }
}