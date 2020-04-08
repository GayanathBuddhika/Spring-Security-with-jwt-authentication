package io.javabrains.springsecurityjwt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.springsecurityjwt.models.LeaveRequest;
import io.javabrains.springsecurityjwt.models.User;
import io.javabrains.springsecurityjwt.repository.LevaRequestRepository;


@Controller
@RequestMapping("/leaveRequest")
public class leaveRequestController { 
	
	@Autowired
	LevaRequestRepository levaRequestRepository;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<LeaveRequest>> findAllRequest(){
		
	
		return new ResponseEntity<List<LeaveRequest>>(levaRequestRepository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/findAllByUserId")
	public ResponseEntity<List<LeaveRequest>> findAllRequestByUserId(@RequestBody String usertId){
		
	
		return new ResponseEntity<List<LeaveRequest>>(levaRequestRepository.findByUser_id(usertId), HttpStatus.OK);
	}
	
	@PostMapping("/approve")
	public ResponseEntity<Map<String, Object>> approveRequest(@RequestBody String requestId){
		   Map<String, Object> map = new HashMap<>();	
		
		   LeaveRequest leaveRequest = levaRequestRepository.findById(requestId).get();
		   leaveRequest.setApprove(true);
		   levaRequestRepository.save(leaveRequest);
			map.put("action", new String("approved"));
		
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
       }
	
	@PostMapping("/addRequest")
	public ResponseEntity<Map<String, Object>> addUser(@RequestBody LeaveRequest request){
		Map<String, Object> map = new HashMap<>();
		if(request.getEdit()) {

//			User editUser = userService.findById(user.getId());
			levaRequestRepository.save(request);
			map.put("action", new String("saved"));
			map.put("request", request);		
			
			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);		
		}else{
			
			levaRequestRepository.save(request);
			map.put("action", new String("saved"));
			map.put("request", request);	
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		}
     }
	
	@PostMapping("/delete")
	public ResponseEntity<Map<String, Object>> deleteUser(@RequestBody String requestId){
		Map<String, Object> map = new HashMap<>();	
		
		    levaRequestRepository.deleteById(requestId);
			map.put("action", new String("deleted"));
		
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
       }
}
