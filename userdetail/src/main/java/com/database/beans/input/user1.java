package com.database.beans.input;


import org.springframework.data.annotation.Id;
public class user1 
{
	@Id
	private int id;
	private String username;
	public String full_name;
	private String email_id;
	private String address;
	private long mobile_no;
	private String currentOrganization;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

