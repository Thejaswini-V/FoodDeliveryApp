package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
@Table(name = "Restaurant_menu")
public class restaurantmenuModel {
    @Id
    @Column(name="rest_id")
    private int restId;

    @Column(name = "food_id")
    private int foodId;

    @Column(name = "food_price")
    private double foodPrice;

    @Column(name = "preparation_time")
    private Time preparationTime;
}
