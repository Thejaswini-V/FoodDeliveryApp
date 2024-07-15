package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.restaurantmenuModel;
import com.example.FoodDeliveryApp.repositories.restaurantmenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class restaurantmenuService {
    @Autowired
    restaurantmenuRepository restaurantmenu_Repository;

    public Iterable<restaurantmenuModel> selectAll() {
        return restaurantmenu_Repository.findAll();
    }

    public restaurantmenuModel insertOne(restaurantmenuModel restaurantmenu_Model) {
        return restaurantmenu_Repository.save(restaurantmenu_Model);
    }
}

