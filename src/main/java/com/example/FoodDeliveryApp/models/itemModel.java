package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;
    @Data
    @Entity
    @Table(name = "Item")
    public class itemModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "food_id")
        private int foodId;

        @Column(name = "food_name", nullable = false, unique = true)
        private String foodName;

        @Column(name = "food_category", nullable = false)
        private String foodCategory;

        @Column(name = "veg_nonveg", nullable = false)
        private boolean vegNonveg;
    }

