package Entities;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table (name = "Supplier")

@NamedQueries ({
	@NamedQuery(name = Supplier.FIND_SUPPLIER_BY_NAME,
			query = "SELECT supplierName, contactNumber, supplierID "
					+ "FROM Supplier "
					+ "WHERE supplierName = :supplierName"),
	@NamedQuery(name = Supplier.FIND_SUPPLIER_BY_ID,
			query = "SELECT supplierName, contactNumber, supplierID "
					+ "FROM Supplier "
					+ "WHERE supplierID = :supplierID")
})

public class Supplier {

	/** Named Query to find the Supplier */
	public static final String FIND_SUPPLIER_BY_NAME = "Supplier.findSupplierByName";
	
	/** Named Query to find the Supplier By ID */
	public static final String FIND_SUPPLIER_BY_ID = "Supplier.findSupplierByID";
	
	/** Setting Column Details */
	@Column (name = "supplierName", nullable = false)
	@NotNull
	private String supplierName;

	@Column (name = "contactNumber", nullable = false)
	@NotNull
	private String contactNumber;

	@Id
	@Column (name = "supplierID", nullable = false)
	@NotNull
	private int supplierID;

	/** Configuring Supplier Entity */
	public Supplier(String supplierName, String contactNumber, int supplierID) 
	{
		this.supplierName = supplierName;
		this.contactNumber = contactNumber;
		this.supplierID = supplierID;
	}

	/** Returns the Supplier name for the Supplier */
	public String getSupplierName() 
	{
		return supplierName;
	}

	/** Sets the Name for the Supplier */
	public void setSupplierName(String supplierName) 
	{
		this.supplierName = supplierName;
	}

	/** Returns the Contact Number for the Supplier */
	public String getContactNumber() 
	{
		return contactNumber;
	}

	/** Sets the Contact Number for the Supplier */
	public void setContactNumber(String contactNumber) 
	{
		this.contactNumber = contactNumber;
	}

	/** Returns the ID for the Supplier */
	public int getSupplierID() 
	{
		return supplierID;
	}
	
	/**Returns the supplier with the specified ID*/
	public Supplier findByID(int id)
	{
		return null;	
	}

	/** Sets the ID for the Supplier*/
	public void setSupplierID(int supplierID) 
	{
		this.supplierID = supplierID;
	}
}
