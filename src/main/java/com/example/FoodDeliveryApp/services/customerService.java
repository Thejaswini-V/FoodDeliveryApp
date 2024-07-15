package com.example.FoodDeliveryApp.services;

import com.example.FoodDeliveryApp.models.customerModel;
import com.example.FoodDeliveryApp.repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerService {
    @Autowired
    private customerRepository customerRepository;

    public Iterable<customerModel> selectAll() {
        return customerRepository.findAll();
    }

    public customerModel insertOne(customerModel customerModel) {
        return customerRepository.save(customerModel);
    }

    public customerModel findByEmail(String email) {
        return customerRepository.findByCustMail(email);
    }

    public boolean validateLogin(String mail, String password) {
        customerModel account = findByEmail(mail);
        if (account != null && account.getCustPswd().equals(password)) {
            return true;
        }
        return false;
    }
}
