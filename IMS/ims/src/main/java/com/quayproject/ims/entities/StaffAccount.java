package com.quayproject.ims.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class StaffAccount {
	@Id
	@GeneratedValue
	private int StaffID;
	private String UserName;
	private String Password;
	
	/**
	 * GETTERS AND SETTERS
	 */
	
	public int getStaffID() {
		return StaffID;
	}
	public void setStaffID(int staffID) {
		StaffID = staffID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


}
