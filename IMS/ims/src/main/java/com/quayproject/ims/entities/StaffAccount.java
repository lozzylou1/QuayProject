package com.quayproject.ims.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class StaffAccount {
	
	private String UserName;
	private String Password;
	
	public StaffAccount(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
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
