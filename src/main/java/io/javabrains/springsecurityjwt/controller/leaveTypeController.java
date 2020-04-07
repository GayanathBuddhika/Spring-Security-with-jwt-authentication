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

import io.javabrains.springsecurityjwt.models.LeaveType;
import io.javabrains.springsecurityjwt.models.User;
import io.javabrains.springsecurityjwt.repository.LeaveTypeRepository;



@Controller
@RequestMapping("/leaveType")
public class leaveTypeController {
	@Autowired
	LeaveTypeRepository leaveTypeReposotory;
	
	
	@GetMapping("/findAll")
	public ResponseEntity<List<LeaveType>> findAllLeaveType(){
		
	
		return new ResponseEntity<List<LeaveType>>(leaveTypeReposotory.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addLeaveType")
	public ResponseEntity<Map<String, Object>> addLeaveType(@RequestBody LeaveType leaveType){
		Map<String, Object> map = new HashMap<>();
	
			leaveTypeReposotory.save(leaveType);
			map.put("action", new String("saved"));
			map.put("leaveType", leaveType);		
			
			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);		
		
	
}
	
	@PostMapping("/delete")
	public ResponseEntity<Map<String, Object>> deleteLeaveType(@RequestBody String userId){
		Map<String, Object> map = new HashMap<>();	
		
		     leaveTypeReposotory.deleteById(userId);
			map.put("action", new String("deleted"));
		
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
       }
}
