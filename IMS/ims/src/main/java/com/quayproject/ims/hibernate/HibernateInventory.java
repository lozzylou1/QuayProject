package com.quayproject.ims.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.Inventory;

public class HibernateInventory {
	
	/**
	 * Initialising Variables
	 */
	
	public List<Inventory> inv;
	
	Inventory inventory;
	
	/**
	 * Getters and Setters
	 * @return
	 */

	public List<Inventory> getInventory(){
		return inv;
	}
	
	public void setInventory(List<Inventory> inv){
		
	}

	/**
	 * Initialising Inventory entities and setting relevant information
	 * @return
	 */
	
	
	public List<Inventory> AddAllInventory(){
		
		
		Inventory inventory = new Inventory();
		
		inventory.setProductName("Harry Potter Gnome");
		inventory.setStockLevel(150);
		inventory.setAllocateStock(false);
		inventory.setThreshold(10);
		
		Query inventoryQuery = HibernateApplication.getSession().createQuery("from Inventory");
		inv = inventoryQuery.list();
		
		inv.add(inventory);
		
		return inv;
	}

}
