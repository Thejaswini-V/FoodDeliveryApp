package com.example.FoodDeliveryApp.controllers;

import com.example.FoodDeliveryApp.models.customerModel;
import com.example.FoodDeliveryApp.services.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController {
    @Autowired
    customerService customer_Service;
    @GetMapping("/home")
    public String homepage(){
        return "HI SPRINGBOOT WORKS";
    }
    @GetMapping("/selectAll")
    public Iterable<customerModel> selectAll(){return customer_Service.selectAll();}
    @PostMapping("/insertOne")
    public customerModel insertOne(@RequestBody customerModel customer_Model){
        return customer_Service.insertOne(customer_Model);
    }
    @PostMapping("/login")
    public boolean validatelogin(@RequestBody String mail,String password){
        return customer_Service.validatelogin(mail,password);
    }
}