package com.quayproject.ims.managers;

import java.util.List;
import com.quayproject.ims.entities.Product;

public interface  InventoryManager {

	
	/**
	 * returns all inventory items
	 * 
	 * @return
	 */
	public List<Product> allInventory();
	
	
	
	
}
