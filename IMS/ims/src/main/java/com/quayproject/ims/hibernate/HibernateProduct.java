package com.quayproject.ims.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.Product;


public class HibernateProduct {
	
	/**
	 * Initialising Variables
	 */
	
	public List<Product> prods;
	
	Product prod1;
	Product prod2;
	Product prod3;
	Product prod4;
	Product prod5;
	Product prod6;
	
	/**
	 * Getters and Setters
	 * @return
	 */

	public List<Product> getProds() {
		return prods;
	}
	public void setProds(List<Product> prods) {
		this.prods = prods;
	}
	
	/**
	 * Initialising Product entities and setting relevant information
	 * @return
	 */
	
	public List<Product> AddAllProducts(){
		
		/**
		 * Initialising the Product Objects and adding the relevant information to them
		 */
		
		//PRODUCT 1
		
		prod1 = new Product();
		
		prod1.setProductName("Harry Potter Gnome");
		prod1.setDimensions("10x10");
		prod1.setDiscontinued(false);
		prod1.setImage1("img/IMG_SRC.png");
		prod1.setLongDescription("Long Description");
		prod1.setPrice((float)19.99);
		prod1.setProductType("Gnome");
		prod1.setShortDescription("Short Description");
		prod1.setStockLevel(10);
		prod1.setWeight((float)1.2);
		prod1.setSupplierName("Super Gnome Supplies");
		prod1.setThreshold(2);

		//PRODUCT 2
		
		prod2 = new Product();
		
		prod2.setProductName("Zombie Gnome");
		prod2.setDimensions("10x10");
		prod2.setDiscontinued(false);
		prod2.setImage1("img/IMG_SRC.png");
		prod2.setLongDescription("Long Description");
		prod2.setPrice((float)19.99);
		prod2.setProductType("Gnome");
		prod2.setShortDescription("Short Description");
		prod2.setStockLevel(10);
		prod2.setWeight((float)1.2);
		prod2.setSupplierName("Gnomes 'R' Us");
		prod2.setThreshold(2);
		
		//PRODUCT 3
		
		prod3 = new Product();
		
		prod3.setProductName("Swimming Gnome");
		prod3.setDimensions("10x10");
		prod3.setDiscontinued(false);
		prod3.setImage1("img/IMG_SRC.png");
		prod3.setLongDescription("Long Description");
		prod3.setPrice((float)19.99);
		prod3.setProductType("Gnome");
		prod3.setShortDescription("Short Description");
		prod3.setStockLevel(10);
		prod3.setWeight((float)1.2);
		prod3.setSupplierName("Gnomes 'R' Us");
		prod3.setThreshold(2);
		
		//PRODUCT 4
		
		prod4 = new Product();
		
		prod4.setProductName("Bent Over Gnome");
		prod4.setDimensions("10x10");
		prod4.setDiscontinued(false);
		prod4.setImage1("img/IMG_SRC.png");
		prod4.setLongDescription("Long Description");
		prod4.setPrice((float)19.99);
		prod4.setProductType("Gnome");
		prod4.setShortDescription("Short Description");
		prod4.setStockLevel(10);
		prod4.setWeight((float)1.2);
		prod4.setSupplierName("Gnomes 'R' Us");
		prod4.setThreshold(2);
		
		//PRODUCT 5
		
		prod5 = new Product();
		
		prod5.setProductName("Game of Thrones Gnome");
		prod5.setDimensions("10x10");
		prod5.setDiscontinued(false);
		prod5.setImage1("img/IMG_SRC.png");
		prod5.setLongDescription("Long Description");
		prod5.setPrice((float)19.99);
		prod5.setProductType("Gnome");
		prod5.setShortDescription("Short Description");
		prod5.setStockLevel(10);
		prod5.setWeight((float)1.2);
		prod5.setSupplierName("Gnomes 'R' Us");
		prod5.setThreshold(2);
		
		//PRODUCT 6
	
		prod6 = new Product();
		
		prod6.setProductName("Star Trek Gnome");
		prod6.setDimensions("10x10");
		prod6.setDiscontinued(false);
		prod6.setImage1("img/IMG_SRC.png");
		prod6.setLongDescription("Long Description");
		prod6.setPrice((float)19.99);
		prod6.setProductType("Gnome");
		prod6.setShortDescription("Short Description");
		prod6.setStockLevel(10);
		prod6.setWeight((float)1.2);
		prod6.setSupplierName("Gnomes 'R' Us");
		prod6.setThreshold(2);
		
		
		Query productQuery = HibernateApplication.getSession().createQuery("from Product");
		prods = productQuery.list();	 
		
		
		prods.add(prod1);
		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);
		prods.add(prod5);
		prods.add(prod6);
		
		return prods;
		
	}
}
