package Managers;

import java.util.List;

import Entities.Supplier;



public interface SupplierManager {
	
	/**Save a single Supplier*/
	public void persistSupplier(Supplier supplier);
	
	/**Save a list of Supplier*/
	public void persistSuppliers(List<Supplier> supplier);
	
	/**Find a Supplier using the user name*/
	public Supplier findByName(String name);
	
	/**Find a Supplier using the ID*/
	public Supplier findByID(int id);
	
	/**Returns an ArrayList of Suppliers*/
	public List<Supplier> getSuppliers();
	
	/**Create a Suppliers*/
	public void createSupplier(Supplier supplier);
	
	/**Updates the Supplier*/
	public void updateSupplier (Supplier supplier);
	
	/**Marks the Supplier as inactive*/
	public void removeSupplier(Supplier supplier);

}
