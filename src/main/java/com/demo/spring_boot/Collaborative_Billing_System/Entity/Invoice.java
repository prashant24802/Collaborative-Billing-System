package com.demo.spring_boot.Collaborative_Billing_System.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "stakeholder_id")
    private User stakeholder;

    private double amount;
    private String status; // e.g., PAID, UNPAID, DISPUTED
    private LocalDate dueDate;
}
