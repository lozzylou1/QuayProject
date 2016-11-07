package com.quayproject.ims.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.hibernate.HibernateApplication;
import com.quayproject.ims.hibernate.HibernateSupplier;
import com.quayproject.ims.managers.SupplierManager;


@Stateless
@Default
public class SupplierManagerOnline implements SupplierManager {
	
	static org.hibernate.Session session = HibernateApplication.getSession();

	@Override
	public List<Supplier> allSuppliers() {
		return null;
		// TODO Auto-generated method stub
		
		/*
		HibernateApplication.start();
		
		try{
			HibernateSupplier supp = (HibernateSupplier) session.get(HibernateSupplier.class, new Long(200));
			System.out.println("StaffAccount get called");
			if(supp != null){
			System.out.println("Staff = "+supp.getSuppliers());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return supp.getSuppliers();
		*/
		
	}

	@Override
	public void createNewSupplier(String supplierName, String supplierContactNumber) {
		// TODO Auto-generated method stub
		
	}

}
