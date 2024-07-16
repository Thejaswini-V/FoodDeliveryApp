package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(name = "cust_mail")
    private String custMail;


    @NotBlank(message = "mobileNumber is required")
    @Size(min = 10, max = 10)
    @Column(name = "cust_phone")
    private long custPhone;

    @Column(name = "cust_pswd")
    private String custPswd;
}
