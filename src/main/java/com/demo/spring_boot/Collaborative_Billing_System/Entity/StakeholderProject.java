package com.demo.spring_boot.Collaborative_Billing_System.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class StakeholderProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stakeholder_id")
    private User stakeholder;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private double costAllocationPercentage;
}