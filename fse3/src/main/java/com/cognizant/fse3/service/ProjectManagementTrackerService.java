package com.cognizant.fse3.service;

import com.cognizant.fse3.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectManagementTrackerService {
    public Member addNewMember(Member member);
    public List<Member> retrieveAllMemberDetails();
    public void assignTask();
    public void updateAllocationPercentage(int memberId);
}
