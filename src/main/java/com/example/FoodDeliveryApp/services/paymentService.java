package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.paymentModel;
import com.example.FoodDeliveryApp.repositories.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {
    @Autowired
    paymentRepository payment_Repository;

    public Iterable<paymentModel> selectAll() {
        return payment_Repository.findAll();
    }

    public paymentModel insertOne(paymentModel payment_Model) {
        return payment_Repository.save(payment_Model);
    }
}

