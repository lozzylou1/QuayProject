package com.quayproject.ims.hibernate;

import java.util.List;

import org.hibernate.Query;

import com.quayproject.ims.entities.PurchaseOrder;

public class HibernatePurchaseOrder {
	
	/**
	 * Initialising Variables
	 */
	
	public List<PurchaseOrder> purch;
	
	PurchaseOrder purch1;
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public List<PurchaseOrder> getPurchaseOrders(){
		return purch;
	}
	
	public void setPurchaseOrders(List<PurchaseOrder> purch){
		this.purch = purch;
	}
	
	/**
	 * Initialising Purchase Order entities and setting relevant information
	 * @return
	 */
	
	public List<PurchaseOrder> AddAllPurchaseOrders(){
		
		purch1 = new PurchaseOrder(null);
		purch1.setSupplierName("Gnomes 'R' Us");
		purch1.setOrderTotal(150);
		purch1.setDateOfOrder("11/01/16");
		purch1.setDateOfDelivery("02/02/16");
		purch1.setStatus("Delivered");
		purch1.setProducts("Game of thrones gnome");
		
		Query purchaseOrderQuery = HibernateApplication.getSession().createQuery("from PurchaseOrder");
		purch = purchaseOrderQuery.list();
		
		purch.add(purch1);
		
		return purch;
	}

}
