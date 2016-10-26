package com.quayproject.ims.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.managers.InventoryManager;
import com.quayproject.ims.managers.PurchaseOrderManager;
import com.quayproject.ims.managers.SupplierManager;

@Stateless
public class ImsService {

	@Inject
	private InventoryManager inventoryManager;
	@Inject
	private SupplierManager supplierManager;
	@Inject
	private PurchaseOrderManager purchaseOrderManager;

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

	/**
	 * Filtering for purchase orders containing term
	 * @param term
	 * @return purchaseOrderList
	 */
	public List<PurchaseOrder> purchaseOrder(String term)
	{
		List<PurchaseOrder> purchaseOrderList = new ArrayList<PurchaseOrder>();
		
		for (PurchaseOrder purchaseOrder : purchaseOrderManager.allPurchaseOrders())
		{ 
				if ( purchaseOrder.getSupplierName().toLowerCase().contains(term.toLowerCase())	|| Integer.toString(purchaseOrder.getPurchaseOrderID()).contains(term))
				{
					purchaseOrderList.add(purchaseOrder);
				}
				else if (purchaseOrder.getDateOfOrder().equals(term.replace(".", "/")) || purchaseOrder.getDateOfOrder().equals(term.replace("-", "/")))
				{
					purchaseOrderList.add(purchaseOrder);
				}
				else if (purchaseOrder.getStatus().toLowerCase().equals(term.toLowerCase()))
				{
					purchaseOrderList.add(purchaseOrder);
				}
		}

		return purchaseOrderList;
	}	

	/**
	 * returning all purchase orders
	 * @return purchaseOrderList
	 */
	public List<PurchaseOrder> purchaseOrder()
	{
		List<PurchaseOrder> purchaseOrderList = purchaseOrderManager.allPurchaseOrders();		

		return purchaseOrderList;
	}
}
