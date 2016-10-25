package com.quayproject.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name= "Supplier")
public class Supplier {
	
	@Id
	@Column (name = "supplierID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int supplierID;
	
	@Column (name = "supplierName", nullable = false)
	private String supplierName;
	
	@Column (name = "contactNumber", nullable = false)
	private String contactNumber;
	
	@Column (name = "dateOfLastOrder", nullable = false)
	private String dateOfLastOrder;
	
	/**
	 * Supplier Constructor
	 * 
	 * @param supplierID
	 * @param supplierName
	 * @param contactNumber
	 * @param dateOfLastOrder
	 */
	public Supplier(int supplierID, String supplierName, String contactNumber, String dateOfLastOrder)
	{
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.contactNumber = contactNumber;
		this.dateOfLastOrder = dateOfLastOrder;
	}
	
	/**
	 * Get supplierID
	 * @return
	 */
	public int getSupplierID() 
	{
		return supplierID;
	}
	
	/**
	 * Set supplierID
	 * @param supplierID
	 */
	public void setSupplierID(int supplierID)
	{
		this.supplierID = supplierID;
	}
	
	/**
	 * Get Supplier name
	 * @return
	 */
	public String getSupplierName()
	{
		return supplierName;
	}
	
	/**
	 * set Supplier name
	 * @return
	 */
	public void setSupplierName(String supplierName) 
	{
		this.supplierName = supplierName;
	}
	
	/**
	 * Get contact number
	 * @return
	 */
	public String getContactNumber()
	{
		return contactNumber;
	}
	
	/**
	 * set contact number
	 * @return
	 */
	public void setContactNumber(int contactNumber)
	{
		this.contactNumber = Integer.toString(contactNumber);
	}

	/**
	 * Get DateOfLastOrder
	 * @return
	 */
	public String getDateOfLastOrder() {
		return dateOfLastOrder;
	}
/**
 * set DateOfLastOrder
 * @param dateOfLastOrder
 */
	public void setDateOfLastOrder(String dateOfLastOrder) {
		this.dateOfLastOrder = dateOfLastOrder;
	}

}
