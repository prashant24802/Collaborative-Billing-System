package com.demo.spring_boot.Collaborative_Billing_System.JPARespository;

import com.demo.spring_boot.Collaborative_Billing_System.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
