package org.ria.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="GreatUser")
public class UserDetails {
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Id@GeneratedValue
	//@Column(name="USER_ID")
	private int UserId;
	//@Column(name="USER_DETAILS")
	//@Transient
	private String UserDetails;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Embedded
	private Address address;
	private String description;
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserDetails() {
		return UserDetails;
	}
	public void setUserDetails(String userDetails) {
		UserDetails = userDetails;
	}

	
}
