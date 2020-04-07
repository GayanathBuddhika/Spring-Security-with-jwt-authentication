package io.javabrains.springsecurityjwt.models;



public class RegisterUser {

	private String userName;
	private String role;
	private String password;
	
	
	public RegisterUser() {
	
	}
	
	
	public RegisterUser(String userName, String role, String password) {
		super();
		this.userName = userName;
		this.role = role;
		this.password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	
}
