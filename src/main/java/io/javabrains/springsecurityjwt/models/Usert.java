package io.javabrains.springsecurityjwt.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Usert {
	
	@Id
    private String id = UUID.randomUUID().toString();
	private String email;
	private String role;
	private String password;
	private String name;
	
	public Usert() {

	}
	
	public Usert(String id, String email, String role, String password, String name) {
	
		this.id = id;
		this.email = email;
		this.role = role;
		this.password = password;
		this.name = name;
	
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}
