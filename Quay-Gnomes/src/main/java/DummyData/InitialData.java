package DummyData;
import java.util.ArrayList;

import javax.inject.Singleton;

import Entities.*;

@Singleton
public class InitialData {
	
	/**Array List of Suppliers*/
	private ArrayList<Supplier> suppliers =
			new ArrayList<Supplier>();
	
	/**ArrayList of StaffAccounts*/
	private ArrayList<StaffAccount> staffAccounts =
			new ArrayList<StaffAccount>();
	
	/**Creates the initial offline data*/
	public InitialData()
	{
		suppliers.add(new Supplier("Super Gnome Supplies", "+447654893756", 1));
		suppliers.add(new Supplier("Jaccuzzi 'R' Us", "+44769435851", 2));
		
		staffAccounts.add(new StaffAccount("Al Stock", "Password"));
	}
	
	/**Returns the dummy list of suppliers */
	public ArrayList<Supplier> getSuppliers()
	{
		return suppliers;		
	}
	
	/**Returns the Dummy list of StaffAccounts*/
	public ArrayList<StaffAccount> getStaffAccounts()
	{
		return staffAccounts;
	}
	
	/**Add a supplier to the dummy list of suppliers*/
	public void addSupplier(Supplier supplier)
	{
		suppliers.add(supplier);
	}
	
	/**Add a StaffAccount to the dummy list of StaffAccounts*/
	public void addStafAccount(StaffAccount staffAccount)
	{
		staffAccounts.add(staffAccount);
	}
	
	/**Fills the dummy list of suppliers with a another list of Suppliers*/
	public void setSuppliers(ArrayList<Supplier> suppliers)
	{
		this.suppliers = suppliers;
	}
	
	/**Fills the dummy list of StaffAccounts with another list of StaffAccounts*/
	public void setStaffAccounts(ArrayList<StaffAccount> staffAccounts)
	{
		this.staffAccounts = staffAccounts;
	}

}
