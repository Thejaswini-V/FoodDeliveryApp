package com.example.FoodDeliveryApp.controllers;

import com.example.FoodDeliveryApp.models.customerModel;
import com.example.FoodDeliveryApp.services.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class customerController {
    @Autowired
    private customerService customerService;

    @GetMapping("/home")
    public String homepage() {
        return "HI SPRINGBOseeOT WORKS";
    }

    @GetMapping("/selectAll")
    public Iterable<customerModel> selectAll() {
        return customerService.selectAll();
    }

    @PostMapping("/insertOne")
    public customerModel insertOne(@RequestBody customerModel customerModel) {
        return customerService.insertOne(customerModel);
    }

    @PostMapping("/login")
    public boolean validateLogin(@RequestBody LoginRequest loginRequest) {
        return customerService.validateLogin(loginRequest.getMail(), loginRequest.getPassword());
    }
}

class LoginRequest {
    private String mail;
    private String password;

    // Getters and Setters

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
