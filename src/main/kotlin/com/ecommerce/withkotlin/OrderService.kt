package com.ecommerce.withkotlin

class OrderService {

    fun calculateTotal(order: Order): Double {
        var discount = 0.0

        if (order.customerType == "GOLD") {
            discount = order.totalAmount * 0.20
        } else if (order.customerType == "SILVER") {
            discount = order.totalAmount * 0.10
        } else if (order.customerType == "BRONZE") {
            discount = order.totalAmount * 0.05
        }

        if (order.totalAmount > 1000.0) {
            discount += 50.0
        }

        val finalValue = order.totalAmount - discount

        println("Processando pedido ${order.id} para cliente ${order.customerType}")

        return finalValue
    }
}