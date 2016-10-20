package Managers;

import java.util.List;

import Entities.*;

public interface StaffAccountManager {
	
	/**
	 * Persist a staff account to the db
	 * 
	 * @param StaffAccount staffAccount 
	 */
	public void persistStaffAccount(StaffAccount staffAccount);
	
	/**
	 * Persist a list of staff accounts to the db
	 * 
	 * @param List<StaffAccount> staffAccount
s	 */
	public void persistStaffAccounts(List<StaffAccount> staffAccount);
	
	/**
	 * Find staff account by name
	 * 
	 * @param name
	 */
	public StaffAccount findStaffAccountbyName(String name);
	
	/**
	 * Return a list of staff accounts
	 * 
	 */
	public List<StaffAccount> getStaffAccount();
	
	/**
	 * Create a staff account
	 * 
	 * @param StaffAccount staffAccount
	 */
	public void createStaffAccount(StaffAccount staffAccount);
	
	/**
	 * Update a staff account
	 * 
	 * @param StaffAccount staffAccount
	 */
	public void updateStaffAccount(StaffAccount staffAccount);
	
	/**
	 * Marks a staff account as inactive in Db
	 * 
	 * @param StaffAccount staffAccount
	 */
	public void removeStaffAccount(StaffAccount staffAccount);

	
}
