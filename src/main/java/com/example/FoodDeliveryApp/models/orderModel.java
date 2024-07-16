package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Order")
public class orderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "rest_id", nullable = false)
    private int restId;

    @Column(name = "food_id", nullable = false)
    private int foodId;

    @Column(name = "cust_id", nullable = false)
    private int custId;

    @Column(name = "order_status", nullable = false)
    private String orderStatus;

    @Column(name = "suggestion")
    private String suggestion;

    @Column(name = "delivery_location")
    private String deliveryLocation;

    @Column(name = "delivery_time")
    private Timestamp deliveryTime;
}