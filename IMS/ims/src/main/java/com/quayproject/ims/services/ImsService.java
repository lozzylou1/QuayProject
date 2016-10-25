package com.quayproject.ims.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.managers.InventoryManager;
import com.quayproject.ims.managers.SupplierManager;

@Stateless
public class ImsService {

	@Inject
	private InventoryManager inventoryManager;
	@Inject
	private SupplierManager supplierManager;
	
	/**
	 * Filtering for products containing term
	 * @param term
	 * @return resultsList
	 */
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
	
	/**
	 * returning all products 
	 * @return resultsList
	 */
	public List<Product> inventory()
	{
		List<Product> resultsList = inventoryManager.allInventory();	
		
		return resultsList;
	}
	
	
	/**
	 * Filtering for Suppliers containing term
	 * @param term
	 * @return supplierList
	 */
	public List<Supplier> supplier(String term)
	{
		List<Supplier> supplierList = new ArrayList<Supplier>();
		
		for (Supplier supplier : supplierManager.allSuppliers())
		{ 
			if (supplier.getSupplierName().toLowerCase().contains(term.toLowerCase()) || 
					Integer.toString(supplier.getSupplierID()).toLowerCase().contains(term.toLowerCase()))
			{
				supplierList.add(supplier);
			}
		}
		
		return supplierList;
	}	
	
	/**
	 * returning all suppliers
	 * @return supplierList
	 */
	public List<Supplier> supplier()
	{
		List<Supplier> supplierList = supplierManager.allSuppliers();		
		
		return supplierList;
	}
}
