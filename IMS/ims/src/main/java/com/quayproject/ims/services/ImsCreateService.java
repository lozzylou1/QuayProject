package com.quayproject.ims.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.managers.InventoryManager;
import com.quayproject.ims.managers.PurchaseOrderManager;
import com.quayproject.ims.managers.SupplierManager;

@Stateless
public class ImsCreateService {

	@Inject
	private SupplierManager supplierManager;
	@Inject
	private InventoryManager inventoryManager;
	@Inject 
	private PurchaseOrderManager purchaseOrderManager;

	private List<Product> orderList;

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

	public  void submitOrder(double totalPrice)
	{
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();*/
		String s = "27/10/2016";
		purchaseOrderManager.createPurchaseOrder(orderList, totalPrice, s);
	}

	/**
	 * Get the OrderList
	 * 
	 * @return the orderList
	 */
	public List<Product> getOrderList() {
		return orderList;
	}

	/**
	 * Set the orderList
	 * 
	 * @param orderList the orderList to set
	 */
	public void setOrderList(List<Product> orderList) {
		this.orderList = orderList;
	}
}
