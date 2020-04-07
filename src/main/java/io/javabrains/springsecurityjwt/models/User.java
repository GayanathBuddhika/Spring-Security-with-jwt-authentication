package io.javabrains.springsecurityjwt.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class User {
	
	@Id
    private String id = UUID.randomUUID().toString();
	private String employeeId;
	private String name;
	private String phoneNo;
	private String address;
	private String email;
	private String role;
	private String password;
	
	@Transient
	private Boolean edit;
	
	public User() {

	}
	
	
	public User(String id, String employeeId, String name, String phoneNo, String address, String email, String role,
			String password, Boolean edit) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.email = email;
		this.role = role;
		this.password = password;
		this.edit = edit;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}



	
}
