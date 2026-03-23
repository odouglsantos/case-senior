package com.ecommerce.withjava;

public class OrderService {

    public double calculateTotal(Order order) {
        double discount = 0.0;

        if (order.getCustomerType().equals("GOLD")) {
            discount = order.getTotalAmount() * 0.20;
        } else if (order.getCustomerType().equals("SILVER")) {
            discount = order.getTotalAmount() * 0.10;
        } else if (order.getCustomerType().equals("BRONZE")) {
            discount = order.getTotalAmount() * 0.05;
        }

        if (order.getTotalAmount() > 1000.0) {
            discount += 50.0;
        }

        double finalValue = order.getTotalAmount() - discount;

        System.out.println("Processando pedido " + order.getId() + " para cliente " + order.getCustomerType());

        return finalValue;
    }
}