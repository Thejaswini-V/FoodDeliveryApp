package com.example.FoodDeliveryApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "Delivery_partner")
public class deliverypartnerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryId;

    @NotBlank(message = "mobileNumber is required")
    @Size(min = 10, max = 10)
    @Column(name = "delivery_phn")
    private long deliveryPhn;

    @Column(name = "order_id")
    private int orderId;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(name = "dp_mail")
    private String dpMail;

    @Column(name = "dp_pswd")
    private String dpPswd;
}
