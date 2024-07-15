package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.customerModel;
import com.example.FoodDeliveryApp.repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class customerService {
    @Autowired
    customerRepository customer_Repository;
    public Iterable<customerModel> selectAll(){
        return customer_Repository.findAll();
    }
    public customerModel insertOne(customerModel customer_Model){
        return customer_Repository.save(customer_Model);
    }

    public customerModel findByEmail(String email) {
        return customer_Repository.findByCustMail(email);
    }

    public boolean validatelogin(String mail, String password) {
        customerModel account = findByEmail(mail);
        if (account != null && account.getCust_pswd().equals(password)) {
            return true;
        }
        return false;
    }
}


