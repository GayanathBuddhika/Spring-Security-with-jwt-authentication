package io.javabrains.springsecurityjwt.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class LeaveType {
	@Id
    private String id = UUID.randomUUID().toString();
	private String type;
	private int leaveDays;
	
	
	@Transient
	private Boolean edit;
	

	public LeaveType() {
	
	}
	
	
	
	public LeaveType(String id, String type, int leaveDays,Boolean edit) {
		super();
		this.id = id;
		this.type = type;
		this.leaveDays = leaveDays;
		this.edit = edit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}
	
	
}
