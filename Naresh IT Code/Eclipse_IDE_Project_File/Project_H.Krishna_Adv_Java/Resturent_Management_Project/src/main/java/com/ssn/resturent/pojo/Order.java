package com.ssn.resturent.pojo;

import java.sql.Timestamp;

public class Order {
    private int orderId;
    private String itemName;
    private int quantity;
    private double price;
    private String status;
    private Timestamp orderTime;

    // Constructors
    public Order() {}

    public Order(int orderId, String itemName, int quantity, double price, String status, Timestamp orderTime) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.orderTime = orderTime;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
