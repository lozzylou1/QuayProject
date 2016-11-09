package com.quayproject.ims.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.entities.Alert;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.entities.Update;
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

	public  void submitOrder(List<Product> orderList, double totalPrice)
	{
		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();*/
		
		purchaseOrderManager.createPurchaseOrder(totalPrice, orderList);
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

	public List<Alert> alertList() {
		
		List<Alert> alerts = new ArrayList<Alert>();
		
		for (Product product : inventoryManager.allInventory())
		{
			if (product.getStockLevel() <= product.getThreshold())
			{
				Alert alert = new Alert(product);
				alerts.add(alert);
			} 				
		}
		return alerts;
	}

	public List<Update> updateList() {

		List<Update> updates= new ArrayList<Update>();
		
		for (PurchaseOrder purchaseOrder : purchaseOrderManager.allPurchaseOrders())
		{
			if ((purchaseOrder.getStatus() == "delivered" ) ||  (purchaseOrder.getStatus() == "approved"))
			{
				Update update = new Update(purchaseOrder);
						updates.add(update);
			}
		}
		
	
		return updates;
	}
	
	
}
