package io.javabrains.springsecurityjwt.models;

import java.util.Arrays;
import java.util.Collection;

import javax.swing.UIDefaults.ActiveValue;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class myUserDetail implements UserDetails {
	
	private String userName;
	private String role;
	private String password;
	private String email;
	
	public myUserDetail() {
		
	
	}

	public myUserDetail(Usert user) {
		super();
		this.userName = user.getName();
		this.role = user.getRole();
		this.password = user.getPassword();
		this.email = user.getEmail();
	} 

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
