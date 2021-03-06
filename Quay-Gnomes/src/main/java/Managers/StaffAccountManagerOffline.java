package Managers;

import java.util.ArrayList;

import javax.inject.Inject;

import DummyData.InitialData;
import Entities.*;


public class StaffAccountManagerOffline implements StaffAccountManager{
	
	@Inject
	private InitialData initialData;

	@Override
	public void persistStaffAccount(StaffAccount staffAccount) {
		initialData.addStafAccount(staffAccount);
	}

	@Override
	public void persistStaffAccounts(ArrayList<StaffAccount> staffAccounts) {
		// TODO Auto-generated method stub
		initialData.setStaffAccounts(staffAccounts);
	}

	@Override
	public StaffAccount findStaffAccountbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<StaffAccount> getStaffAccount() {
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
