package com.example.emailmicroservice.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class OrderDetails {
    private String orderId;
    private String userName;
    private String date;
    private Product[] product;
    private double totalPrice;
    private String userEmail;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId='" + orderId + '\'' +
                ", userName='" + userName + '\'' +
                ", date='" + date + '\'' +
                ", product=" + Arrays.toString(product) +
                ", totalPrice=" + totalPrice +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
