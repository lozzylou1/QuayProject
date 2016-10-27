package com.quayproject.ims.managers;

import java.util.List;

import com.quayproject.ims.entities.Supplier;

public interface SupplierManager {

	/**
	 * returns all Suppliers
	 * 
	 * @return allSuppliers
	 */
	public List<Supplier> allSuppliers();
	
	
	/**
	 * create new supplier
	 * 
	 * @param supplierName
	 * @param supplierContactNumber
	 */
	public void createNewSupplier(String supplierName, String supplierContactNumber);
	

	
}
