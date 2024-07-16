package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Delivery_partner")
public class deliverypartnerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryId;

    @Column(name = "delivery_phn")
    private long deliveryPhn;

    @Column(name = "order_id")
    private int orderId;
}
