package com.quayproject.ims.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.StaffAccount;


public class HibernateStaffAccount {
	
	/**
	 * Initialising Variables
	 */
	
	public List<StaffAccount> staff;
	
	StaffAccount staff1;
	StaffAccount staff2;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public List<StaffAccount> getStaff(){
		return staff;
	}
	
	public void setStaff(List<StaffAccount> staff){
		this.staff = staff;
	}
	
	/**
	 * Initialising Staff Account entities and setting relevant information
	 * @return
	 */
	
	public List<StaffAccount> AddAllStaff(){
		
		//STAFF 1
		
		StaffAccount stf1 = new StaffAccount();		
		stf1.setUserName("Admin");		
		stf1.setPassword("password");					
		
		//STAFF 2
		
		StaffAccount stf2 = new StaffAccount();		
		stf2.setUserName("standardUser");			
		stf2.setPassword("standardPassword");			
		
		Query staffQuery = HibernateApplication.getSession().createQuery("from StaffAccount");
		staff = staffQuery.list();
		
		staff.add(stf1);
		staff.add(stf2);
		
		return staff;
	}
	

}
