package com.example.FoodDeliveryApp.repositories;

import com.example.FoodDeliveryApp.models.restaurantModel;
import org.springframework.data.repository.CrudRepository;

public interface restaurantRepository extends CrudRepository<restaurantModel,Integer> {
}
