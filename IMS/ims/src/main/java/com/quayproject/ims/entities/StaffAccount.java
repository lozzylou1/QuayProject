package com.quayproject.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Administrator
 *
 */
@Entity
@Table (name = "StaffAccount")
public class StaffAccount {
	@Id
	@Column (name = "staffID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int staffID;
	
	@Column (name = "userName", nullable = false)
	private String userName;
	
	@Column (name = "password", nullable = false)
	private String password;
	
	
public StaffAccount(){
		
	}

	/**
	 * Staff account constructor
	 * 
	 * @param staffID
	 * @param userName
	 * @param password
	 */
	public StaffAccount(int staffID, String userName, String password) {
		super();
		this.staffID = staffID;
		this.userName = userName;
		this.password = password;
	}
	
	
	/**
	 * Returns staff ID
	 * 
	 * @return staffID
	 */
	public int getStaffID() {
		return staffID;
	}
	/**
	 * Set staff ID
	 * 
	 * @param staffID
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	/**
	 * Returns user name
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Set user name
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * Return password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Set password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	



}
