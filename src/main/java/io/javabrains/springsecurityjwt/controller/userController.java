package io.javabrains.springsecurityjwt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.springsecurityjwt.models.User;
import io.javabrains.springsecurityjwt.repository.UserRepository;



@Controller
@RequestMapping("/user")
public class userController {

	@Autowired
    UserRepository userRepository;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<User>> findAllUser(){
		
	
		return new ResponseEntity<List<User>>(userRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Map<String, Object>> addUser(@RequestBody User user){
		Map<String, Object> map = new HashMap<>();
		if(user.getEdit()) {

//			User editUser = userService.findById(user.getId());
		
			map.put("action", new String("saved"));
			map.put("user", user);		
			userRepository.save(user);
			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);		
		}else{
			
			map.put("action", new String("saved"));
			map.put("user", user);
			userRepository.save(user); 
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		}
}
	
	@PostMapping("/delete")
	public ResponseEntity<Map<String, Object>> deleteUser(@RequestBody String userId){
		Map<String, Object> map = new HashMap<>();	
		
		    userRepository.deleteById(userId);
			map.put("action", new String("deleted"));
		
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
       }
		
}
