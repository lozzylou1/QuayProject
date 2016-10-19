package Managers;

import java.util.List;

import Entities.Address;

public interface AddressManager {
	
	public void persistAddress(Address a);
	public void persistAddresses(List<Address> a);
	
	//read
	public List<Address> getAddresses();
	
	
	//create
	public void createAddress(Address a);
	
	//update
	public void updateAddress(Address a);

	public List<Address> findAll();
	
	
	
	

}
