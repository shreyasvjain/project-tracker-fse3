package com.cognizant.fse3.service;

import com.cognizant.fse3.model.Member;
import com.cognizant.fse3.model.MemberResource;
import com.cognizant.fse3.repository.ProjectManagementTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProjectManagementTrackerServiceImpl implements ProjectManagementTrackerService {

    @Autowired
    private ProjectManagementTrackerRepository projectManagementTrackerRepository;
    @Override
    public Long addNewMember(MemberResource member) {
        if(member.getYearsOfExperiance() > 4 && member.getSkillSet().size() >= 3){
            Member newMember = new Member();
            newMember.setName(member.getName());
            newMember.setYearsOfExperiance(member.getYearsOfExperiance());
            newMember.setSkillSet(member.getSkillSet().stream().map(String::valueOf).collect(Collectors.joining(",")));
            newMember.setAdditionalDescription(member.getAdditionalDescription());
            newMember.setProjectStartDt(member.getProjectStartDt());
            newMember.setProjectEndDt(member.getProjectEndDt());
            newMember.setAllocationPercentage(member.getAllocationPercentage());
            if(member.getProjectEndDt().isBefore(member.getProjectStartDt())){
                throw new IllegalArgumentException();
            }
            Member addedMember = projectManagementTrackerRepository.save(newMember);
            return addedMember.getId();
        }
        return 0L;
    }

    @Override
    public List<MemberResource> retrieveAllMemberDetails(){
        List<MemberResource> memberDetails = new ArrayList<>();
        for(Member member : projectManagementTrackerRepository.findAll()){
            MemberResource memberResource = new MemberResource();
            memberResource.setId(member.getId());
            memberResource.setName(member.getName());
            memberResource.setYearsOfExperiance(member.getYearsOfExperiance());
            memberResource.setSkillSet(Arrays.asList(member.getSkillSet().split(",")));
            memberResource.setAdditionalDescription(member.getAdditionalDescription());
            memberResource.setProjectStartDt(member.getProjectStartDt());
            memberResource.setProjectEndDt(member.getProjectEndDt());
            memberResource.setAllocationPercentage(member.getAllocationPercentage());
            memberDetails.add(memberResource);
        }
        return memberDetails.stream()
                .sorted(Comparator.comparingInt(MemberResource::getYearsOfExperiance).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public void assignTask() {

    }

    @Override
    public MemberResource updateAllocationPercentage(long memberId){

       Member member =  projectManagementTrackerRepository.findById(memberId)
               .orElseThrow(() -> new IllegalArgumentException("Member not found"));
       MemberResource updatedMemberDetail= new MemberResource();
       updatedMemberDetail.setId(member.getId());
        updatedMemberDetail.setName(member.getName());
        updatedMemberDetail.setYearsOfExperiance(member.getYearsOfExperiance());
        updatedMemberDetail.setSkillSet(Arrays.asList(member.getSkillSet().split(",")));
        updatedMemberDetail.setAdditionalDescription(member.getAdditionalDescription());
        updatedMemberDetail.setProjectStartDt(member.getProjectStartDt());
        updatedMemberDetail.setProjectEndDt(member.getProjectEndDt());
        updatedMemberDetail.setAllocationPercentage(member.getProjectEndDt().isBefore(LocalDate.now()) ? 0 : 100);
       return updatedMemberDetail;
    }
}
