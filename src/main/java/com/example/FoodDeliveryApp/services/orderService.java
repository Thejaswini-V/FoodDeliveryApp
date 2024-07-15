package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.orderModel;
import com.example.FoodDeliveryApp.repositories.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    orderRepository order_Repository;

    public Iterable<orderModel> selectAll() {
        return order_Repository.findAll();
    }

    public orderModel insertOne(orderModel order_Model) {
        return order_Repository.save(order_Model);
    }
}

