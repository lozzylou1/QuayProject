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
	
	private List<Supplier> suppliers;	
	private List<StaffAccount> staffAccounts;	
	private List<Product> products;		
	private List<CustomerAccount> customers;
	
	/**
	 * Creates the initial offline data
	 */
	@PostConstruct
	public void setUpData()
	{
		suppliers = new ArrayList<>();
		staffAccounts =	new ArrayList<>();
		products = new ArrayList<>();
		customers = new ArrayList<>();
		
		suppliers.add(new Supplier("Super Gnome Supplies", "+447654893756", 1));
		suppliers.add(new Supplier("Jaccuzzi 'R' Us", "+44769435851", 2));
		
		staffAccounts.add(new StaffAccount("Al Stock", "Password"));
		
		products.add(new Product(1, "Harry Potter Gnome", 19.99f, false, 10, 5f, "5x6x7", "Harry Potter And The Chamber Of Secrets", "Harry Potter is trying to escape the giant snake.", "Gnome", "Large","img/Gnome1m.png" ));
		products.add(new Product(2, "Zombie Gnome", 19.99f, false, 10, 5f, "5x6x7", "Zombie Is Hungry For Gnome Flesh", "This infected ornament will have your friendly garden gnomes running for cover" +
				"Made from handcrafted terracotta and weather-resistant paint, the Zombie Gnome will brave the elements to protect your back garden from intruders." +
				"Don't get too close!", "Gnome", "Large", "img/Gnome2m.png" ));
		products.add(new Product(3, "Swimming Gnome", 19.99f, false, 10, 5f, "5x6x7", "Can't get enough of the pond!", "longDesc", "Gnome", "Large", "img/Gnome3m.png" ));
		products.add(new Product(4, "Star Trek Gnome", 19.99f, false, 10, 5f, "5x6x7", "Star Trek", "Did you realize there's a whole subculture of Star Trek horticulturists? "
				+ "There are daylilies named after Trek, a handful of hostas, and even a Star Trek begonia. The perfect statuary to go with your newly-acquired Star Trek plants? "
				+ "Why, that would be the Star Trek Garden Gnomes, of course! Boldly Going Where No Gnome Has Gone Before !", "Gnome", "Large", "img/Gnome4m.png" ));
		products.add(new Product(5, "Game Of Gnomes", 15.17f, false, 20, 794f, "18.1 x 15.9 x 24.8", "Game of Gnomes Garden Gnome", "A must for any Game of Thrones fan, "
				+ "this statue of gnomed nature doth lay claim to the territory henceforth known as thy garden"
				+ "Collect them all!!", "Gnome", "Large", "img/Gnome5m.png"));
		products.add(new Product(6, "Mankini Gnome", 12.99f, false, 33, 694f, "18.1 x 15.9 x 24.8", "Mankini Gnome", "Surfer dude standing gnome wearing a mankini, and holding a life ring whilst 'posing' the peace moto! "
				+ "Very funny! Sure to raise a smile in anybody!! "
				+ "Highly detailed. Matching 'surf board' gnome also available. Excellent gift.", "Gnome",  "Large", "img/Gnome6m.png"));
		products.add(new Product(7, "Glasses Gnome", 69.69f, false, 7, 694f, "18.1 x 15.9 x 24.8", "A gnome wearing Glasses", "A gnome wearing some funky glasses!"
				+ "Very funny! Sure to raise a smile in anybody!! "
				+ "You really can't miss this amazing gnome!", "Gnome",  "Medium", "img/glassesGnome.PNG"));
		products.add(new Product(8, "Biker Gnome", 88.88f, false, 8, 888f, "10 x 10 x 10", "A gnome riding a bike", "A gnome Riding a bike!"
				+ "He can ride a bike so well!"
				+ "You really can't miss this amazing gnome!", "Gnome",  "Medium","img/bikerGnome.PNG"));
		products.add(new Product(9, "bent over gnome", 99.99f, false, 8, 999f, "99 x 99 x 99", "A gnome bent over", "A gnome bent over!"
				+ "A cheeky gnome for any occasion"
				+ "You really can't miss this amazing gnome!", "Gnome",  "Medium", "img/bentOverGnome.PNG"));
		products.add(new Product(10, "Selfie Gnomes", 10.10f, false, 8, 1010f, "1010 x 876 x 99", "2 Gnomes taking a selfie", "2 Gnomes taking a selfie! #2016"
				+ "Perfect for that hipster in your life"
				+ "You really can't miss this amazing gnome!", "Gnome", "Medium", "img/selfieGnome.PNG"));
		products.add(new Product(11, "Set of 3 solar powered Gnomes", 10.10f, false, 8, 1111f, "1111 x 11 x 1", "3 Solar Powered Gnomes", "3 Solar Powered Gnomes"
				+ "Perfect for Lighting up your garden for those late summer eves"
				+ "You really can't miss these amazing gnomes!", "Gnome", "Small","img/setOfThreeGnomes.jpg"));
		products.add(new Product(12, "It's a shovel", 789.10f, false, 3, 1111f, "5 x 41 x 3", "Shovel", "It's an amazing shovel", "Accessories", "Medium","img/shovel.jpg"));
		products.add(new Product(13, "It's a Hot tub", 999.99f, false, 12, 1111f, "18 x 12 x 69", "Hot Tub", "It's a Hot Tub!", "Hot Tub", "Large","img/hotTub.jpg"));
		customers.add(new CustomerAccount( "laura_adam@live.co.uk", "password",  "Laura", "Adam", "LAdam"));
		customers.add(new CustomerAccount("hlloyd64@hotmail.com", "password", "Hannah", "Lloyd", "HLloyd"));
		customers.add(new CustomerAccount("deanswain@hotmail.com", "password",  "Dean", "Swain", "DSwain"));		
		
	}
	
	/**
	 * Returns the dummy list of suppliers 
	 * @return Suppliers List
	 **/
	public List<Supplier> getSuppliers()
	{
		return suppliers;		
	}
	
	/**
	 * Returns the Dummy list of StaffAccounts
	 *@return Staff Accounts list
	 **/
	public List<StaffAccount> getStaffAccounts()
	{
		return staffAccounts;
	}
	
	/**
	 * Add a supplier to the dummy list of suppliers
	 *@param
	 **/
	public void addSupplier(Supplier supplier)
	{
		suppliers.add(supplier);
	}
	
	public void removeSupplier(Supplier supplier)
	{
		suppliers.remove(supplier);
	}
	/**
	 * Add a StaffAccount to the dummy list of StaffAccounts
	 * @param
	 **/
	public void addStaffAccount(StaffAccount staffAccount)
	{
		staffAccounts.add(staffAccount);
	}
	
	/**
	 * Fills the dummy list of suppliers with a another list of Suppliers
	 *@param
	 **/
	public void setSuppliers(List<Supplier> suppliers)
	{
		this.suppliers = suppliers;
	}
	
	/**
	 * Fills the dummy list of StaffAccounts with another list of StaffAccounts
	 * @param
	  */
	public void setStaffAccounts(List<StaffAccount> staffAccounts)
	{
		this.staffAccounts = staffAccounts;
	}
	
	public List<Product> findAll()
	{
		return products;
	}

	
	/**
	 * Gets the product with the specified term in the name
	 * @param term
	 * @return Product 
	 * Null
	 */
	public Product getProduct(String term)
	{
		for (Product product:products)
		{
			if (product.getProductName().equals(term))
				return product;
		}
		return null;
		
	}	

	/**
	 * Gets the supplier with the specified name
	 * @param name
	 * @return Supplier
	 * Null
	 */
	public Supplier getSupplier(String name)
	{
		for (Supplier supplier:suppliers)
		{
			if (supplier.getSupplierName().equals(name))
				return supplier;
		}
		return null;
		
	}
	
	/**
	 * Gets the supplier with the specified ID
	 * @param id
	 * @return Supplier
	 * Null
	 */
	public Supplier getSupplierByID(int id)
	{
		for (Supplier supplier:suppliers)
		{
			if (supplier.getSupplierID()==id)
				return supplier;
		}
		return null;
		
	}
	
	
	/**
	 * Get the product details using product ID
	 * @param id
	 * @return products
	 * Null
	 */
	public Product getProductById(int id)
	{
		for (Product product:products)
		{
			if(product.getProductID()==id)
				return product;
		}
		return null;
	}
	
	/**
	 * Gets the list of Customers
	 * @return Customers List
	 */
	public List<CustomerAccount> getCustomers() {
		return customers;
	}

	/**
	 * Sets the list of customers
	 * @param customers
	 */
	public void setCustomers(List<CustomerAccount> customers) {
		this.customers = customers;
	}
	

}
