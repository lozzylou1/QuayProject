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
	public void createPurchaseOrder(List<Product> orderList, double totalPrice, String orderDate) {
		// TODO Auto-generated method stub
		initialData.getPurchaseOrders().add(new PurchaseOrder(orderList));
	}

}
