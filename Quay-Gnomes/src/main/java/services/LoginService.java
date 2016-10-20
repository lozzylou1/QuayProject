package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.CustomerAccount;
import Managers.LoginManager;

@Stateless
public class LoginService {
	
	@Inject
	private LoginManager loginManager;
	private CustomerAccount customerAccount;
	
	public boolean loginService(String email, String password)
	{
		customerAccount = loginManager.findbyEmail(email);
		if (customerAccount != null && password.equals(customerAccount.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
