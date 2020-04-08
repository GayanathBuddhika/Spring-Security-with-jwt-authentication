package io.javabrains.springsecurityjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.springsecurityjwt.models.LeaveRequest;

@Repository
public interface LevaRequestRepository extends JpaRepository<LeaveRequest, String> {

	List<LeaveRequest> findByUser_id(String id);
	
	

}
