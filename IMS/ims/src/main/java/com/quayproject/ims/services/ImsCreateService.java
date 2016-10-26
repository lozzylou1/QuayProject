package com.quayproject.ims.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.managers.SupplierManager;

@Stateless
public class ImsCreateService {
	
	@Inject
	private SupplierManager supplierManager;
	
	
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
	
	
}
