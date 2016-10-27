package com.quayproject.ims.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.StaffAccount;


public class HibernateStaffAccount {
	
	public List<StaffAccount> staff;
	
	StaffAccount staff1;
	StaffAccount staff2;
	
	public List<StaffAccount> getStaff(){
		return staff;
	}
	
	public void setStaff(List<StaffAccount> staff){
		this.staff = staff;
	}
	
	public List<StaffAccount> AddAllStaff(){
	
		StaffAccount stf1 = new StaffAccount();		
		stf1.setUserName("Admin");		
		stf1.setPassword("password");					
		
		StaffAccount stf2 = new StaffAccount();		
		stf2.setUserName("standardUser");			
		stf2.setPassword("standardPassword");			
		
		Query staffQuery = HibernateApplication.getSession().createQuery("from StaffAccount");
		staff = staffQuery.list();
		
		staff.add(staff1);
		staff.add(staff2);
		
		return staff;
	}
	

}
