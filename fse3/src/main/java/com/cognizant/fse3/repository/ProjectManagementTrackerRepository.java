package com.cognizant.fse3.repository;

import com.cognizant.fse3.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectManagementTrackerRepository extends JpaRepository<Member, Long> {

}
