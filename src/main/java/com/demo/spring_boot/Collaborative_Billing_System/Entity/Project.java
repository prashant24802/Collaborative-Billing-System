package com.demo.spring_boot.Collaborative_Billing_System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}