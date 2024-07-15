package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Payment")
public class paymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "payment_mode")
    private String paymentMode;
}
