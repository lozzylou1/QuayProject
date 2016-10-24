package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.CustomerAccount;
import Managers.CustomerAccountManager;

@Stateless
public class AccountService {
	
	@Inject
	private CustomerAccountManager accountManager;
	private CustomerAccount customerAccount;
		
	/**
	 * Checks to see if the data provided is valid
	 * 
	 * @return boolean
	 */
	public boolean validation(String initialTerm, String comparisonTerm)
	{
		if (initialTerm.equals(comparisonTerm))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public void addCustomerAccount()
	{		
		accountManager.addCustomerAccount(customerAccount);
	}
	
	/**
	 * Returns the Customer Account
	 * 
	 * @return customerAccount
	 */
	public CustomerAccount getCustomerAccount()
	{
		return customerAccount;
	}
	
	
	/**
	 * Sets the Customer Account
	 * 
	 * @param customerAccount
	 */
	public void setCustomerAccount(CustomerAccount customerAccount)
	{
		this.customerAccount = customerAccount;
	}
	
	

}
