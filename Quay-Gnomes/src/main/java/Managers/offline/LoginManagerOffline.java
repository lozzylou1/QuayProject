package Managers.offline;

import javax.inject.Inject;

import DummyData.InitialData;
import Entities.CustomerAccount;
import Managers.LoginManager;


public class LoginManagerOffline implements LoginManager {

	@Inject
	private InitialData initialData;

	@Override
	public CustomerAccount findbyEmail(String email) 
	{
		CustomerAccount customerAccount = null;

		for (CustomerAccount custAccount: initialData.getCustomers())
		{
			if (custAccount.getEmail().equals(email))
			{
				customerAccount = custAccount;
			}
		} 
		return customerAccount;
	}

}
