package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.CustomerAccount;
import Managers.LoginManager;

@Stateless
public class LoginService {
	
	@Inject
	private LoginManager loginManager;
	private CustomerAccount customerAccount;
	private List<CustomerAccount> listOfCustomer;
	private CustomerAccount customer;
	
	public boolean loginService(String email, String password)
	{
		customerAccount = loginManager.findbyEmailOrUserName(email);
		if (customerAccount != null && password.equals(customerAccount.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public CustomerAccount getCustomer(String email){
		
		listOfCustomer = loginManager.getCustomer();
		//customer = new ArrayList<CustomerAccount>();
		//customer.clear();
		
		for(CustomerAccount account : listOfCustomer)
		{
			if(account.getEmail().contains(email))
			{
				//customer.add(account);
				customer = account;
			}
		}
		
		return customer;
	}

}
