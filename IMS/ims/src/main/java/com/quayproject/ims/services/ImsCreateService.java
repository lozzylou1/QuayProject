package com.quayproject.ims.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.managers.InventoryManager;
import com.quayproject.ims.managers.SupplierManager;

@Stateless
public class ImsCreateService {

	@Inject
	private SupplierManager supplierManager;
	@Inject
	private InventoryManager inventoryManager;


	/**
	 * validate new supplier details
	 * 
	 * @param supplierName
	 * @param supplierContactNumber
	 */
	public boolean validateNewSupplierDetails(String supplierName, String supplierContactNumber)
	{
		try
		{
			int supplierNumber = new Integer(supplierContactNumber); 
			supplierContactNumber = String.valueOf(supplierNumber);
			supplierManager.createNewSupplier(supplierName, supplierContactNumber);
			return true;
		} 
		catch (NumberFormatException e)
		{
			return false;
		}
	}


	/**
	 * 
	 * Add new inventory item
	 * Call inventory manager
	 * 
	 * @param productName
	 * @param stockLevel
	 * @param threshold
	 */
	public void addNewInventoryItem (String productName, int stockLevel, int threshold)
	{

		inventoryManager.createNewInventoryItem(productName, stockLevel, threshold);

	}


}
