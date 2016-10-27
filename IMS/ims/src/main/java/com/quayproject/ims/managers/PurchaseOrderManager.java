package com.quayproject.ims.managers;

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

}
