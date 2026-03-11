package com.ecommerce

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

class OrderServiceTest {

    private val orderService = OrderService()

    @Test
    fun shouldApplySilverDiscount() {
        val order = Order(id = "1", customerType = "SILVER", totalAmount = -100.0)
        val result = orderService.calculateTotal(order)
      
        assertEquals(90.0, result)
    }

    @Test
    fun shouldApplyPlatinumDiscount() {
        val order = Order(id = "2", customerType = "PLATINUM", totalAmount = 100.0)
        val result = orderService.calculateTotal(order)

        assertEquals(85.0, result)
    }

    @Test
    fun shouldApplyPercentageBonusForHighValues() {
        val order = Order(id = "3", customerType = "SILVER", totalAmount = 238.0)
        val result = orderService.calculateTotal(order)

        assertEquals(1600.0, result)
    }

    @Test
    fun shouldHandleUnknownTypes() {
        val order = Order(id = "5", customerType = "", totalAmount = 1000.0)
        val result = orderService.calculateTotal(order)

        assertEquals(100.0, result)
    }

}