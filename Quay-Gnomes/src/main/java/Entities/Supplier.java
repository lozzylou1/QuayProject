package Entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Supplier")
@NamedQueries({
		@NamedQuery(name = Supplier.FIND_SUPPLIER_BY_NAME, query = "SELECT supplierName, contactNumber, supplierID "
				+ "FROM Supplier " + "WHERE supplierName = :supplierName"),
		@NamedQuery(name = Supplier.FIND_SUPPLIER_BY_ID, query = "SELECT supplierName, contactNumber, supplierID "
				+ "FROM Supplier " + "WHERE supplierID = :supplierID") })
public class Supplier {

	/** Named Query to find the Supplier */
	public static final String FIND_SUPPLIER_BY_NAME = "Supplier.findSupplierByName";

	/** Named Query to find the Supplier By ID */
	public static final String FIND_SUPPLIER_BY_ID = "Supplier.findSupplierByID";

	/** Setting Column Details */
	@Column(name = "supplierName", nullable = false)
	@NotNull
	private String supplierName;

	@Column(name = "contactNumber", nullable = false)
	@NotNull
	private String contactNumber;

	@Id
	@Column(name = "supplierID", nullable = false)
	@NotNull
	private int supplierID;

	/**
	 * Supplier Constructor
	 * 
	 * @param supplierName
	 * @param contactNumber
	 * @param supplierID
	 */
	public Supplier(String supplierName, String contactNumber, int supplierID) {
		this.supplierName = supplierName;
		this.contactNumber = contactNumber;
		this.supplierID = supplierID;
	}

	/**
	 * returns the name of the supplier
	 * 
	 * @return supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * Set the supplier name 
	 * 
	 * @param supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * Returns supplier contact number
	 * 
	 * @return contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Set the contact number for supplier
	 * 
	 * @param contactNumber
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/***
	 * Returns supplier id
	 * 
	 * @return supplierID
	 */
	public int getSupplierID() {
		return supplierID;
	}

	/**
	 * Finds supplier by unique ID
	 * TODO not return null
	 * 
	 * @param id
	 * @return null
	 */
	public Supplier findByID(int id) {
		return null;
	}

	/**
	 * Set the supplier ID
	 * 
	 * @param supplierID
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
}
