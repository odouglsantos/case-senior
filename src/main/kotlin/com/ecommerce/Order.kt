package com.ecommerce

data class Order(
    val id: String,
    val customerType: String, // "GOLD", "SILVER", "BRONZE"
    val totalAmount: Double
)
