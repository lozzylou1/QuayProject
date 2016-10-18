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
	
	private ArrayList<Product> listOfProducts;
	
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

		customers.add(new CustomerAccount(1, "laura_adam@live.co.uk", "password", "01142251456", "614 the exchange, 8 elmira way, salford quays, M5 3NQ", "12 buckingham road, conisborugh, DN3 4HS", "Laura", "Adam"));
		customers.add(new CustomerAccount(2, "hlloyd64@hotmail.com", "password", "01142564785", "84 grove house, 35 skirten road, old trafford, M16 0TU", "45 Wales road, Swansea, Wales W3 5SE", "Hannah", "Lloyd"));
		customers.add(new CustomerAccount(3, "deanswain@hotmail.com", "password", "01142687745", "33 the lowery, lowery road, salford quays, M2 6HS", "22 Nottingham road, nottingham, N5 4AM", "Dean", "Swain"));		
		
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
	
	public void removeSupplier(Supplier supplier)
	{
		suppliers.remove(supplier);
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
	
	public ArrayList<Product> findAll()
	{
		return products;
	}


	public ArrayList<Product> getProducts(String term) {
		for (Product product:products)
		{
			if (product.getProductName().equals(term))
				
				listOfProducts.add(product);
		}
		return listOfProducts;

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

	public Supplier getSupplier(String name)
	{
		for (Supplier supplier:suppliers)
		{
			if (supplier.getSupplierName().equals(name))
				return supplier;
		}
		return null;
		
	}
	
	public Supplier getSupplierByID(int id)
	{
		for (Supplier supplier:suppliers)
		{
			if (supplier.getSupplierID()==id)
				return supplier;
		}
		return null;
		
	}

	public ArrayList<CustomerAccount> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<CustomerAccount> customers) {
		this.customers = customers;
	}
	

}
