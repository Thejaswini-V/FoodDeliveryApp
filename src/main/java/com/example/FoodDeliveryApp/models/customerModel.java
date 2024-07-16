package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "customer")
@Entity
public class customerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_address")
    private String custAddress;

    @Column(name = "cust_mail")
    private String custMail;

    @Column(name = "cust_phone")
    private long custPhone;

    @Column(name = "cust_pswd")
    private String custPswd;
}
