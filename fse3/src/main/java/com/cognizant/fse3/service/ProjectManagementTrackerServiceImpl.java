package com.cognizant.fse3.service;

import com.cognizant.fse3.model.Member;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProjectManagementTrackerServiceImpl implements ProjectManagementTrackerService {

    @Override
    public Member  addNewMember(Member member) {
        if(member.getYearsOfExperiance() > 4 && member.getSkillSet().size() > 3){
            return new Member();
        }
        return null;
    }

    @Override
    public List<Member> retrieveAllMemberDetails(){
        return Arrays.asList(new Member());
       /* return Collections.sort(list,
                Comparator.comparingInt(Member::getYearsOfExperiance).reversed());*/
    }

    @Override
    public void assignTask() {

    }

    @Override
    public void updateAllocationPercentage(int memberId){

    }

}
