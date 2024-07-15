package com.example.FoodDeliveryApp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.FoodDeliveryApp.models.customerModel;

public interface customerRepository extends CrudRepository<customerModel, Integer> {
    // Method to find a customer by email
    customerModel findByCustMail(String custMail);
}
