package io.javabrains.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjwt.models.LeaveType;

public interface LeaveTypeRepository  extends JpaRepository<LeaveType, String>{
	
	

}
