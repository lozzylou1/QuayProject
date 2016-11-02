package com.quayproject.ims.hibernate;

import java.util.List;
import org.hibernate.Query;
import com.quayproject.ims.entities.Supplier;

public class HibernateSupplier {
	
	/**
	 * Initialising Variables
	 */
	
	public List<Supplier> supp;
	
	Supplier supp1;
	Supplier supp2;
	Supplier supp3;
	Supplier supp4;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public List<Supplier> getSuppliers(){
		return supp;
	}
	
	public void setSuppliers(List<Supplier> supp){
		this.supp = supp;
	}
	
	/**
	 * Initialising Supplier entities and setting relevant information
	 * @return
	 */
	
	public List<Supplier> AddAllSuppliers(){
		
		supp1 = new Supplier();
		supp2 = new Supplier();
		supp3 = new Supplier();
		supp4 = new Supplier();
		
		//SUPPLIER 1
		
		supp1.setSupplierName("Gnomes 'R' Us");
		supp1.setContactNumber("07784598554");
		supp1.setDateOfLastOrder("11/02/16");
		
		//SUPPLIER 2
		
		supp2.setSupplierName("Wholesale Garden Goods");
		supp2.setContactNumber("07784756558");
		supp2.setDateOfLastOrder("05/11/16");
		
		//SUPPLIER 3
		
		supp3.setSupplierName("Tubs 4 U");
		supp3.setContactNumber("01154488565");
		supp3.setDateOfLastOrder("14/01/15");
		
		//SUPPLIER 4
		
		supp4.setSupplierName("Super Gnome Supplies");
		supp4.setContactNumber("01154488565");
		supp4.setDateOfLastOrder("14/01/15");
		
		Query supplierQuery = HibernateApplication.getSession().createQuery("from Supplier");
		supp = supplierQuery.list();	
		
		supp.add(supp1);
		supp.add(supp2);
		supp.add(supp3);
		supp.add(supp4);
		
		return supp;
	}

}
