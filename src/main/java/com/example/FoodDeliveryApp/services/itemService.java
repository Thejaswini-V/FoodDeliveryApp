package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.itemModel;
import com.example.FoodDeliveryApp.repositories.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemService {
    @Autowired
    itemRepository item_Repository;

    public Iterable<itemModel> selectAll() {
        return item_Repository.findAll();
    }

    public itemModel insertOne(itemModel item_Model) {
        return item_Repository.save(item_Model);
    }
}

