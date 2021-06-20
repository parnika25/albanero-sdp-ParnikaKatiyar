package com.example2.userapi;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer id;
	@Column(nullable = false)
	public String username;
	@Column(nullable = false)
	public String full_name;
	@Column(nullable = false)
	public String email_id;
	@Column(nullable = false)
	public String address;
	@Column(nullable = false)
	public long mobile_no;
	@Column(nullable = false)
	public String currentOrganization;
	
	public user1(String username, String full_name, String email_id, String address, long mobile_no, String currentOrganization) 
	{
		super();
		this.username = username;
		this.full_name = full_name;
		this.email_id = email_id;
		this.address = address;
		this.mobile_no = mobile_no;
		this.currentOrganization = currentOrganization;
	}
	
	public user1() 
	{
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getCurrentOrganization() {
		return currentOrganization;
	}
	public void setCurrentOrganization(String currentOrganization) {
		this.currentOrganization = currentOrganization;
	}
}

