package Managers;

import Entities.CustomerAccount;

public interface LoginManager {

	/**Returns the customer account associated with the email */
	public CustomerAccount findbyEmail(String email);
	
	
}
