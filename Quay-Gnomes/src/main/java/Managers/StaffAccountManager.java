package Managers;

import java.util.List;

import Entities.*;

public interface StaffAccountManager {
	
	/**Save a single StaffAccount*/
	public void persistStaffAccount(StaffAccount staffAccount);
	
	/**Save a list of StaffAccounts*/
	public void persistStaffAccounts(List<StaffAccount> staffAccount);
	
	/**Find a StaffAccount using the user name*/
	public StaffAccount findStaffAccountbyName(String name);
	
	/**Returns an ArrayList of StaffAccounts*/
	public List<StaffAccount> getStaffAccount();
	
	/**Create a Staff Account*/
	public void createStaffAccount(StaffAccount staffAccount);
	
	/**Updates the StaffAccount*/
	public void updateStaffAccount(StaffAccount staffAccount);
	
	/**Marks the StaffAccount as inactive*/
	public void removeStaffAccount(StaffAccount staffAccount);

	
}
