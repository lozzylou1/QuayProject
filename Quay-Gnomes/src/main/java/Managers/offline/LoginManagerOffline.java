package Managers.offline;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.CustomerAccount;
import Managers.LoginManager;

@Stateless
@Default
public class LoginManagerOffline implements LoginManager {

	@Inject
	private InitialData initialData;

	@Override
	public CustomerAccount findbyEmailOrUserName(String email) 
	{
		
		CustomerAccount customerAccount = null;

		for (CustomerAccount custAccount : initialData.getCustomers())
		{
			System.out.print(custAccount);
			if (custAccount.getEmail().equals(email) || custAccount.getUserName().equals(email))
			{
				customerAccount = custAccount;
			}
		} 
		return customerAccount;
	}
}