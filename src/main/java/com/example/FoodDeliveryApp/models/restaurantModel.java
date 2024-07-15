package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Restaurant")
public class restaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rest_id")
    private int restId;

    @Column(name = "rest_name", nullable = false)
    private String restName;

    @Column(name = "rest_address", nullable = false)
    private String restAddress;

    @Column(name = "rest_phone", nullable = false, unique = true)
    private int restPhone;
}
