package DummyData;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import Entities.*;

@Startup
@Singleton
public class InitialData {
	
	/**Array List of Suppliers*/
	private ArrayList<Supplier> suppliers;
	
	/**ArrayList of StaffAccounts*/
	private ArrayList<StaffAccount> staffAccounts;
	
	/**ArrayList of Products*/
	private ArrayList<Product> products;
	
	/**ArrayList of Customer Details*/
	private ArrayList<CustomerAccount> customers;
	
	public InitialData() {}
	
	/**Creates the initial offline data*/
	@PostConstruct
	public void setUpData()
	{
		suppliers = new ArrayList<Supplier>();
		staffAccounts =	new ArrayList<StaffAccount>();
		products = new ArrayList<Product>();
		customers = new ArrayList<CustomerAccount>();
		
		suppliers.add(new Supplier("Super Gnome Supplies", "+447654893756", 1));
		suppliers.add(new Supplier("Jaccuzzi 'R' Us", "+44769435851", 2));
		
		staffAccounts.add(new StaffAccount("Al Stock", "Password"));
		
		products.add(new Product(1, "Harry Potter Gnome", 19.99f, false, 10, 5f, "5x6x7", "Harry Potter And The Chamber Of Secrets", "Harry Potter is trying to escape the giant snake.", "img/harrypotter.jpg" ));
		products.add(new Product(2, "Zombie Gnome", 19.99f, false, 10, 5f, "5x6x7", "shortDesc", "longDesc", "img/zombie.jpg" ));
		products.add(new Product(3, "Swimming Gnome", 19.99f, false, 10, 5f, "5x6x7", "shortDesc", "longDesc", "img/swimming.jpg" ));
		products.add(new Product(4, "Star Trek Gnome", 19.99f, false, 10, 5f, "5x6x7", "shortDesc", "longDesc", "img/starTrek.jpg" ));

		customers.add(new CustomerAccount(1, "laura_adam@live.co.uk", "password", "01142251456", "614 the exchange, 8 elmira way, salford quays, m5 3nq", "12 buckingham road, conisborugh, DN3 4HS", "Laura", "Adam"));
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
	public void addStaffAccount(StaffAccount staffAccount)
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

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Product getProduct(String term)
	{
		for (Product product:products)
		{
			if (product.getProductName().equals(term))
				return product;
		}
		return null;
		
	}

}
