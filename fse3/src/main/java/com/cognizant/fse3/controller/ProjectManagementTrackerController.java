package com.cognizant.fse3.controller;

import com.cognizant.fse3.model.MemberResource;
import com.cognizant.fse3.service.ProjectManagementTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/projectmgmt/api/vi/manager")
public class ProjectManagementTrackerController {

    @Autowired
    private ProjectManagementTrackerService service;

    @PostMapping(value = "/add-member")
    public Long addNewMember(@Valid @RequestBody MemberResource member) {
        return service.addNewMember(member);
    }

    @GetMapping(value = "/list/memberDetails")
    public List<MemberResource> fetchAllMembers() {
        return service.retrieveAllMemberDetails();
    }

    @PostMapping(value = "/assign-task")
    public void assignTaskToMembers(){
        service.assignTask();
    }

    @PutMapping(value = "/update/{id}/allocationPercentage")
    public MemberResource updateAllocation(@PathVariable long id){
       return service.updateAllocationPercentage(id);
    }
}
