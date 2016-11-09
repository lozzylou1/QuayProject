package com.quayproject.ims.managers.offline;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.quayproject.ims.dummydata.InitialData;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.managers.PurchaseOrderManager;

@Stateless
@Default
public class PurchaseOrderManagerOffline implements PurchaseOrderManager {
	
	@Inject
	public InitialData initialData;
	
	@Override
	public List<PurchaseOrder> allPurchaseOrders() {
		return initialData.getPurchaseOrders();
	}

	
	
	
	@Override
	public void createPurchaseOrder(double orderTotal, List<Product> orderList) {
		
		int listLength = initialData.getPurchaseOrders().size();
		PurchaseOrder lastProducts = initialData.getPurchaseOrders().get(listLength - 1);
		
		int newOrderID = lastProducts.getPurchaseOrderID() + 1;
		
		String dateOfOrder = "09/11/2016";
		
		String supplierName = "Supplier";
		
		double orderTotalRound = Math.round(orderTotal * 100.0) / 100.0;
		
		
		initialData.getPurchaseOrders().add(new PurchaseOrder(newOrderID, supplierName, orderTotalRound, dateOfOrder, orderList));
	}

	
	
	@Override
	public void saveOrder(List<Product> orderList) {
		System.out.println(">>>>>" + orderList);
		initialData.getPurchaseOrders().add(new PurchaseOrder(orderList));
		//orderList.clear();
		
	}

}
