package com.demo.spring_boot.Collaborative_Billing_System.Service;

@Service
public class BillingService {
    @Autowired
    private StakeholderProjectRepository stakeholderProjectRepository;

    public void allocateCosts(Long projectId, Map<Long, Double> stakeholderAllocations) {
        stakeholderAllocations.forEach((stakeholderId, percentage) -> {
            StakeholderProject allocation = new StakeholderProject();
            allocation.setProject(projectRepository.findById(projectId).orElseThrow());
            allocation.setStakeholder(userRepository.findById(stakeholderId).orElseThrow());
            allocation.setCostAllocationPercentage(percentage);
            stakeholderProjectRepository.save(allocation);
        });
    }
}