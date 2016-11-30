package org.ria.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.cfg.Configuration;

@Entity(name="GreatUser")
public class UserDetails {
	
	@Id@GeneratedValue
	//@Column(name="USER_ID")
	private int UserId;
	//@Column(name="USER_DETAILS")
	//@Transient
	private String UserDetails;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
				joinColumns=@JoinColumn(name="USER_ID"))
	//private Set<Address> listOfAddresses=new HashSet<Address>();
	@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	@CollectionId(columns = { @Column(name="ADDRESS_ID")}, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddresses=new ArrayList<Address>();
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	private String description;
	
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
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
