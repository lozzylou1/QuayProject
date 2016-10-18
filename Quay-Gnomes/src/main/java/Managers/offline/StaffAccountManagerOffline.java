package Managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.*;
import Managers.StaffAccountManager;

@Stateless
@Default
public class StaffAccountManagerOffline implements StaffAccountManager{
	
	@Inject
	private InitialData initialData;

	@Override
	public void persistStaffAccount(StaffAccount staffAccount) {
		initialData.addStaffAccount(staffAccount);
	}

	@Override
	public void persistStaffAccounts(List<StaffAccount> staffAccounts) {
		// TODO Auto-generated method stub
		initialData.setStaffAccounts(staffAccounts);
	}

	@Override
	public StaffAccount findStaffAccountbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StaffAccount> getStaffAccount() {
		// TODO Auto-generated method stub
		return initialData.getStaffAccounts();
	}

	@Override
	public void createStaffAccount(StaffAccount staffAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStaffAccount(StaffAccount staffAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStaffAccount(StaffAccount staffAccount) {
		// TODO Auto-generated method stub
		
	}

}
