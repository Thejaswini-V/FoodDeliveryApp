package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.restaurantModel;
import com.example.FoodDeliveryApp.repositories.restaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class restaurantService {
    @Autowired
    restaurantRepository restaurant_Repository;

    public Iterable<restaurantModel> selectAll() {
        return restaurant_Repository.findAll();
    }

    public restaurantModel insertOne(restaurantModel restaurant) {
        return restaurant_Repository.save(restaurant);
    }
}

