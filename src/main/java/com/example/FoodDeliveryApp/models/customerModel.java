package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "customer")
@Entity
public class customerModel {
    @Id

    @Column(name = "cust_id")
    private int cust_id;
    @Column(name = "cust_name")
    private String cust_name;
    @Column(name = "cust_address")
    private String cust_address;
    @Column(name = "cust_mail")
    private String cust_mail;
    @Column(name = "cust_phone")
    private int cust_phone;
    @Column(name = "cust_pswd")
    private String cust_pswd;
}

