package com.demo.spring_boot.Collaborative_Billing_System.Controller;

import com.demo.spring_boot.Collaborative_Billing_System.Service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/billing")
public class BillingController {
    @Autowired
    private BillingService billingService;

    @PostMapping("/allocate-costs")
    public ResponseEntity<String> allocateCosts(@RequestParam Long projectId, @RequestBody Map<Long, Double> stakeholderAllocations) {
        billingService.allocateCosts(projectId, stakeholderAllocations);
        return ResponseEntity.ok("Costs allocated successfully");
    }
}
