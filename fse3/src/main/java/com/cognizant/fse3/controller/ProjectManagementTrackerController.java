package com.cognizant.fse3.controller;

import com.cognizant.fse3.model.Member;
import com.cognizant.fse3.service.ProjectManagementTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping(value = "/projectmgmt/api/vi/manager")
public class ProjectManagementTrackerController {

    @Autowired
    private ProjectManagementTrackerService service;

    @PostMapping(value = "/add-member")
    public Member addNewMember(@RequestBody Member member) {
        return service.addNewMember(member);
    }

    @GetMapping(value = "/list/memberDetails")
    public List<Member> fetchAllMembers() {
        return service.retrieveAllMemberDetails();
    }

    @PostMapping(value = "/assign-task")
    public void assignTaskToMembers(){
        service.assignTask();
    }

    @PutMapping(value = "/update/{id}/allocationPercentage")
    public void updateAllocation(@PathVariable int id){
        service.updateAllocationPercentage(id);
    }
}
