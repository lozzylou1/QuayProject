package com.quayproject.ims.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.quayproject.ims.dummydata.InitialData;
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

}
