package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
@Table(name = "Restaurant")
public class restaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restId;

    @Column(name = "rest_name", nullable = false)
    private String restName;

    @Column(name = "rest_address", nullable = false)
    private String restAddress;


    @NotBlank(message = "mobileNumber is required")
    @Size(min = 10, max = 10)
    @Column(name = "rest_phone", nullable = false, unique = true)
    private int restPhone;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(name = "rest_mail")
    private String restMail;

    @Column(name = "rest_pswd")
    private String restPswd;
}
