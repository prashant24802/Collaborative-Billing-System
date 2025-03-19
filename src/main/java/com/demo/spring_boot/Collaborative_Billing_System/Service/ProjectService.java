package com.demo.spring_boot.Collaborative_Billing_System.Service;

import com.demo.spring_boot.Collaborative_Billing_System.Entity.Project;
import com.demo.spring_boot.Collaborative_Billing_System.JPARespository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
}