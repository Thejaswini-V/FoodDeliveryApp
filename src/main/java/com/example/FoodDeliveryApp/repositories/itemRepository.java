package com.example.FoodDeliveryApp.repositories;


import com.example.FoodDeliveryApp.models.itemModel;
import org.springframework.data.repository.CrudRepository;


public interface itemRepository extends CrudRepository<itemModel, Integer> {

}
