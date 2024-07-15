package com.example.FoodDeliveryApp.repositories;

import com.example.FoodDeliveryApp.models.paymentModel;
import org.springframework.data.repository.CrudRepository;

public interface paymentRepository extends CrudRepository<paymentModel,Integer> {
}
