package com.quayproject.ims.dummydata;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import com.quayproject.ims.entities.Product;


@Startup
@Singleton
public class InitialData {
	
	private List<Product> products;		
	
	/**
	 * Creates the initial offline data
	 */
	@PostConstruct
	public void setUpData()
	{
		
		products = new ArrayList<>();
	
		
		products.add(new Product(1,   10, 2,"Harry Potter Gnome"));
		products.add(new Product(2,  10, 2, "Zombie Gnome"));
		
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
	
	
	
	
	

}
