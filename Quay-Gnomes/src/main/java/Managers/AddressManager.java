package Managers;

import java.util.List;

import Entities.Address;

public interface AddressManager {
	
	public void persistAddress(Address a);
	public void persistAddresses(List<Address> a);
	
	/**
	 * 
	 * Gets the addresses
	 */
	public List<Address> getAddresses();
	
	
	/**
	 * Create Address Entity
	 * 
	 * @param Address a
	 */
	public void createAddress(Address a);
	
	/**
	 * Update the address entity
	 * 
	 * @param Address a
	 */
	public void updateAddress(Address a);
	
	/**
	 * 
	 * List all the addresses
	 * 
	 */
	public List<Address> findAll();
	
	
	
	

}
