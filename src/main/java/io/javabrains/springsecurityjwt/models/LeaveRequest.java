package io.javabrains.springsecurityjwt.models;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LeaveRequest {
	
	@Id
    private String id = UUID.randomUUID().toString();
	private String description ;	
	private String approve;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="leaving_type")
	private LeaveType leaveType;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public LeaveRequest() {
		
	}
	
	
	public LeaveRequest(String id, String description, String approve, Date startDate, Date endDate,
			LeaveType leaveType,
			User user) {
		super();
		this.id = id;
		this.description = description;
		this.approve = approve;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
}
