package com.ecommerce.withjava;


public class Order {
    String id;
    String customerType;
    double totalAmount;

    public Order(String id, String customerType, double totalAmount) {
        this.id = id;
        this.customerType = customerType;
        this.totalAmount = totalAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
