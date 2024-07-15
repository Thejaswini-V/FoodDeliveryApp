package com.example.FoodDeliveryApp.repositories;

import com.example.FoodDeliveryApp.models.restaurantmenuModel;
import org.springframework.data.repository.CrudRepository;

public interface restaurantmenuRepository extends CrudRepository<restaurantmenuModel,Integer> {
}
