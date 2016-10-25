package com.quayproject.ims.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class PurchaseOrder {
	
	@Id
	@GeneratedValue
	private int PurchaseOrderID;
	private int SupplierID;
	private String StaffID;
	private String Products;
	private double TotalPrice;
	private String SupplierName;
	
	
	public int getPurchaseOrderID()
	{
		return PurchaseOrderID;
	}
	
	public void setPurchaseOrderID(int purchaseOrderID) 
	{
		PurchaseOrderID = purchaseOrderID;
	}
	
	public int getSupplierID()
	{
		return SupplierID;
	}
	
	public void setSupplierID(int supplierID)
	{
		SupplierID = supplierID;
	}
	
	public String getStaffID() 
	{
		return StaffID;
	}
	
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getProducts() {
		return Products;
	}
	public void setProducts(String products) 
	{
		Products = products;
	}
	
	public double getTotalPrice() 
	{
		return TotalPrice;
	}
	
	public void setTotalPrice(double totalPrice)
	{
		TotalPrice = totalPrice;
	}
	
	public String getSupplierName() 
	{
		return SupplierName;
	}
	
	public void setSupplierName(String supplierName)
	{
		SupplierName = supplierName;
	}
}
