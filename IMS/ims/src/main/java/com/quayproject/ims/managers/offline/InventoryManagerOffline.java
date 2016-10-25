package com.quayproject.ims.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.quayproject.ims.dummydata.InitialData;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.managers.InventoryManager;

@Stateless
@Default
public class InventoryManagerOffline implements InventoryManager {

	@Inject
	public InitialData initialData;


	@Override
	public List<Product> allInventory() {
		return initialData.getProducts();
	}



}
