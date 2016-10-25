package com.quayproject.ims.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.managers.InventoryManager;

@Stateless
public class ImsService {

	@Inject
	private InventoryManager inventoryManager;
	
	public List<Product> inventory(String term)
	{
		List<Product> resultsList = new ArrayList<Product>();
		
		for (Product product : inventoryManager.allInventory())
		{ 
			if (product.getProductName().toLowerCase().contains(term.toLowerCase()) || 
					Integer.toString(product.getProductID()).toLowerCase().contains(term.toLowerCase()))
			{
				resultsList.add(product);
			}
		}
		
		return resultsList;
	}
	
}
