package com.demo.spring_boot.Collaborative_Billing_System.Entity;

import jakarta.persistence.Entity;
import jdk.jfr.DataAmount;


@Entity
@DataAmount

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // e.g., ADMIN, STAKEHOLDER
    private String email;
}
