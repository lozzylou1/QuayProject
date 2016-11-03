package Managers;

import java.util.List;

import Entities.CustomerAccount;

public interface LoginManager {

	/**Returns the customer account associated with the email */
	public CustomerAccount findbyEmailOrUserName(String email);
	
	/**
	 * Return a list of the customer details
	 * @param email
	 *
	 */
	public List<CustomerAccount> getCustomer();
	
	
}
