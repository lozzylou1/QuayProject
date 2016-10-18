package DummyData;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import Entities.*;

@Startup
@Singleton
public class InitialData {
	
	/**Array List of Suppliers*/
	private List<Supplier> suppliers;
	
	/**List of StaffAccounts*/
	private List<StaffAccount> staffAccounts;
	
	/**List of Products*/
	private List<Product> products;
	
	private List<Product> listOfProducts;
	
	/**List of Customer Details*/
	private List<CustomerAccount> customers;
	
	public InitialData() {}
	
	/**Creates the initial offline data*/
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
		
		products.add(new Product(1, "Harry Potter Gnome", 19.99f, false, 10, 5f, "5x6x7", "Harry Potter And The Chamber Of Secrets", "Harry Potter is trying to escape the giant snake.", "img/harrypotter.jpg" ));
		products.add(new Product(2, "Zombie Gnome", 19.99f, false, 10, 5f, "5x6x7", "Zombie Is Hungry For Gnome Flesh", "This infected ornament will have your friendly garden gnomes running for cover" +
				"Made from handcrafted terracotta and weather-resistant paint, the Zombie Gnome will brave the elements to protect your back garden from intruders." +
				"Don't get too close!", "img/zombie.jpg" ));
		products.add(new Product(3, "Swimming Gnome", 19.99f, false, 10, 5f, "5x6x7", "Can't get enough of the pond!", "longDesc", "img/swimming.jpg" ));
		products.add(new Product(4, "Star Trek Gnome", 19.99f, false, 10, 5f, "5x6x7", "Star Trek", "Did you realize there's a whole subculture of Star Trek horticulturists? "
				+ "There are daylilies named after Trek, a handful of hostas, and even a Star Trek begonia. The perfect statuary to go with your newly-acquired Star Trek plants? "
				+ "Why, that would be the Star Trek Garden Gnomes, of course! Boldly Going Where No Gnome Has Gone Before !", "img/starTrek.jpg" ));
		products.add(new Product(5, "Game Of Gnomes", 15.17f, false, 20, 794f, "18.1 x 15.9 x 24.8", "Game of Gnomes Garden Gnome", "A must for any Game of Thrones fan, "
				+ "this statue of gnomed nature doth lay claim to the territory henceforth known as thy garden"
				+ "Collect them all!!", "img/gotgnome.jpg"));
		products.add(new Product(6, "Mankini Gnome", 12.99f, false, 33, 694f, "18.1 x 15.9 x 24.8", "Mankini Gnome", "Surfer dude standing gnome wearing a mankini, and holding a life ring whilst 'posing' the peace moto! "
				+ "Very funny! Sure to raise a smile in anybody!! "
				+ "Highly detailed. Matching 'surf board' gnome also available. Excellent gift.", "img/mankinignome.jpg"));
		products.add(new Product(7, "Glasses Gnome", 69.69f, false, 7, 694f, "18.1 x 15.9 x 24.8", "A gnome wearing Glasses", "A gnome wearing some funky glasses!"
				+ "Very funny! Sure to raise a smile in anybody!! "
				+ "You really can't miss this amazing gnome!", "img/glassesGnome.PNG"));
		products.add(new Product(8, "Biker Gnome", 88.88f, false, 8, 888f, "10 x 10 x 10", "A gnome riding a bike", "A gnome Riding a bike!"
				+ "He can ride a bike so well!"
				+ "You really can't miss this amazing gnome!", "img/bikerGnome.PNG"));
		products.add(new Product(9, "bent over gnome", 99.99f, false, 8, 999f, "99 x 99 x 99", "A gnome bent over", "A gnome bent over!"
				+ "A cheeky gnome for any occasion"
				+ "You really can't miss this amazing gnome!", "img/bentOverGnome.PNG"));
		products.add(new Product(10, "Selfie Gnomes", 10.10f, false, 8, 1010f, "1010 x 876 x 99", "2 Gnomes taking a selfie", "2 Gnomes taking a selfie! #2016"
				+ "Perfect for that hipster in your life"
				+ "You really can't miss this amazing gnome!", "img/selfieGnome.PNG"));
		products.add(new Product(11, "Set of 3 solar powered Gnomes", 10.10f, false, 8, 1111f, "1111 x 11 x 1", "3 Solar Powered Gnomes", "3 Solar Powered Gnomes"
				+ "Perfect for Lighting up your garden for those late summer eves"
				+ "You really can't miss these amazing gnomes!", "img/setOfThreeGnomes.jpg"));
		products.add(new Product(12, "Gun Gnome", 12.12f, false, 12, 1212f, "1212 x 12 x 12", "Gnome holding a gun", "Get this great gnome holding a gun to scare off neighbors!"
				+ "Perfect for keeping those pesky kids off your lawn"
				+ "You really can't miss these amazing gnomes!", "img/gunGnome.jpg"));
		
		
		

		customers.add(new CustomerAccount(1, "laura_adam@live.co.uk", "password", "01142251456", "614 the exchange, 8 elmira way, salford quays, M5 3NQ", "12 buckingham road, conisborugh, DN3 4HS", "Laura", "Adam"));
		customers.add(new CustomerAccount(2, "hlloyd64@hotmail.com", "password", "01142564785", "84 grove house, 35 skirten road, old trafford, M16 0TU", "45 Wales road, Swansea, Wales W3 5SE", "Hannah", "Lloyd"));
		customers.add(new CustomerAccount(3, "deanswain@hotmail.com", "password", "01142687745", "33 the lowery, lowery road, salford quays, M2 6HS", "22 Nottingham road, nottingham, N5 4AM", "Dean", "Swain"));		
		
	}
	
	/**Returns the dummy list of suppliers */
	public List<Supplier> getSuppliers()
	{
		return suppliers;		
	}
	
	/**Returns the Dummy list of StaffAccounts*/
	public List<StaffAccount> getStaffAccounts()
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
	public void setSuppliers(List<Supplier> suppliers)
	{
		this.suppliers = suppliers;
	}
	
	/**Fills the dummy list of StaffAccounts with another list of StaffAccounts*/
	public void setStaffAccounts(List<StaffAccount> staffAccounts)
	{
		this.staffAccounts = staffAccounts;
	}
	
	public List<Product> findAll()
	{
		return products;
	}


	public List<Product> getProducts(String term) {
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

	public List<CustomerAccount> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerAccount> customers) {
		this.customers = customers;
	}
	

}
