package io.javabrains.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjwt.models.LeaveType;

@Repository
public interface LeaveTypeRepository  extends JpaRepository<LeaveType, String>{
	
	

}
