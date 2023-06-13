package com.cognizant.fse3.service;

import com.cognizant.fse3.model.MemberResource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectManagementTrackerService {
    public Long addNewMember(MemberResource member);
    public List<MemberResource> retrieveAllMemberDetails();
    public void assignTask();
    public MemberResource updateAllocationPercentage(long memberId);
}
