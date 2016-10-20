package Managers;

import java.util.List;

import Entities.Supplier;



public interface SupplierManager {
	
	/**
	 * Persists a supplier to the db 
	 * 
	 * @param Supplier supplier
	 */
	public void persistSupplier(Supplier supplier);
	
	/**
	 * Persists a List of suppliers to the db 
	 * 
	 * @param List<Supplier> supplier
	 */
	public void persistSuppliers(List<Supplier> supplier);
	
	/**
	 * Find supplier by name
	 * 
	 * @param String name
	 * @return
	 */
	public Supplier findByName(String name);
	
	/**
	 * Find supplier by ID
	 * 
	 * @param id
	 * @return
	 */
	public Supplier findByID(int id);
	
	/**
	 * Returns a list of suppliers
	 * 
	 * @return List<Supplier> 
	 */
	public List<Supplier> getSuppliers();
	
	/**
	 * Create a supplier
	 * 
	 * @param Supplier supplier
	 */
	public void createSupplier(Supplier supplier);
	
	/**
	 * Update the supplier
	 * 
	 * @param Supplier supplier
	 */
	public void updateSupplier (Supplier supplier);
	
	/**
	 * Marks the supplier as inactive in the db 
	 * 
	 * @param Supplier supplier
	 */
	public void removeSupplier(Supplier supplier);

}
