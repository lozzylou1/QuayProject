package com.quayproject.ims.managers;

import java.util.Date;
import java.util.List;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;

public interface PurchaseOrderManager {
	
	/**
	 * returns all inventory items
	 * 
	 * @return
	 */
	public List<PurchaseOrder> allPurchaseOrders();
	
	/**
	 * Creates the purchase order with the list of products
	 * 
	 * @param orderList
	 */
	public void createPurchaseOrder(List<Product> orderList, double totalPrice, String orderDate);

}
