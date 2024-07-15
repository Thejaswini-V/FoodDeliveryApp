package com.example.FoodDeliveryApp.repositories;

import com.example.FoodDeliveryApp.models.orderModel;
import org.springframework.data.repository.CrudRepository;


public interface orderRepository extends CrudRepository<orderModel, Integer> {
}

