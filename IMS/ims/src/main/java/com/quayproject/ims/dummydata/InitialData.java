package com.quayproject.ims.dummydata;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.entities.Supplier;


@Startup
@Singleton
public class InitialData {

	private List<Product> products;
	private List<Supplier>suppliers;
	private List<PurchaseOrder>purchaseOrders;



	/**
	 * Creates the initial offline data
	 */
	@PostConstruct
	public void setUpData()
	{
		suppliers = new ArrayList<>();
		products = new ArrayList<>();
		purchaseOrders = new ArrayList<>();

		products.add(new Product(1,   10, 2,"Harry Potter Gnome", "Super Gnome Supplies"));
		products.add(new Product(2,  10, 2, "Zombie Gnome", "Super Gnome Supplies"));
		products.add(new Product(3,   10, 2,"Swimming Gnome", "Gnome 'R' us"));
		products.add(new Product(4,  10, 2, "Bent Over Gnome", "Super Gnome Supplies"));
		products.add(new Product(5,   10, 2,"Game of Thrones Gnome", "Gnomes 'R' us"));
		products.add(new Product(6,  10, 2, "Star Trek Gnome", "Super Gnome Supplies"));

		suppliers.add(new Supplier(1,"Super Gnome Supplies", "+447654893756", "10/09/2016"));
		suppliers.add(new Supplier(2, "Gnomes 'R' Us", "+44769435851", "16/08/2016" ));

		purchaseOrders.add(new PurchaseOrder(1, "Super Gnome Supplies", 59.81, "25/10/16", "28/10/16", "Approved"));
		purchaseOrders.add(new PurchaseOrder(2, "Super Gnome Supplies", 99.99, "10/10/16", "15/10/16", "Complete"));
		purchaseOrders.add(new PurchaseOrder(3, "Gnomes R Us", 150.30, "18/09/16", "25/09/16", "Pending"));
	}

	/**
	 * return list of products
	 * 
	 * @return products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * set the list of products
	 * 
	 * @param products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}


	/**
	 * get list of suppliers
	 * 
	 * @return List<Suppliers>
	 */
	public List<Supplier> getSuppliers() {
		return suppliers;
	}



	/**
	 * Set list of suppliers
	 * @param List<Suppliers>
	 */
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	/**
	 * gets list of purchase orders
	 * 
	 * @return List<PurchaseOrders>
	 */
	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	/**
	 * sets list of purchase orders
	 * 
	 * @param purchaseOrders 
	 */
	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}



}
