package com.quayproject.ims.hibernate;
import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.Supplier;

public class HibernateSupplier {
	
	public List<Supplier> supp;
	
	Supplier supp1;
	Supplier supp2;
	Supplier supp3;
	
	public List<Supplier> getSuppliers(){
		return supp;
	}
	
	public void setSuppliers(List<Supplier> supp){
		this.supp = supp;
	}
	
	public List<Supplier> AddAllSuppliers(){
		
		Supplier supp1 = new Supplier(001, "Gnomes 'R' Us", "07745487884", "11/10/16");		    
	    
		Supplier supp2 = new Supplier(002, "Tubs 4 U", "07745487884", "14/02/16");			    	
																							    
		Supplier supp3 = new Supplier(003, "Wholesale Garden Goods", "07745487884", "01/05/16");
		
		Query supplierQuery = HibernateApplication.getSession().createQuery("from Supplier");
		supp = supplierQuery.list();	
		
		supp.add(supp1);
		supp.add(supp2);
		supp.add(supp3);
		
		return supp;
	}

}
