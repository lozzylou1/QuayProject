package com.quayproject.ims.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
	
	private int SupplierID;
	private String SupplierName;
	private int ContactNumber;
	
	public Supplier(int supplierID, String supplierName, int contactNumber) {
		super();
		SupplierID = supplierID;
		SupplierName = supplierName;
		ContactNumber = contactNumber;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public int getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}

}
