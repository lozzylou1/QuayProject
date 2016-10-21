package Managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.CustomerAccount;
import Managers.CustomerAccountManager;

@Stateless
@Default
public class CustomerAccountManagerOffline implements CustomerAccountManager {

	@Inject
	private InitialData initialData;
	
	private List<CustomerAccount> newCustomerList;
	
	@Override
	public void addCustomerAccount(CustomerAccount customerAccount) {
		newCustomerList = initialData.getCustomers();	
		newCustomerList.add(customerAccount);
		initialData.setCustomers(newCustomerList);
		System.out.println(">>>>>>>>>>>>> CUSTOMER ADDED: " + customerAccount.getFirstName() + " " + customerAccount.getSurname());
	}
}
