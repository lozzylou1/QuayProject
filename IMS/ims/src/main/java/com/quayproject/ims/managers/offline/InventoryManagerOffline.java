package com.quayproject.ims.managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.quayproject.ims.dummydata.InitialData;
import com.quayproject.ims.entities.Inventory;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.Supplier;
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
	
	@Override
	public void createNewInventoryItem(String productName, int stockLevel, int threshold) {

		Product inventoryItem = new Product (productName, stockLevel, threshold);
		
		int listLength = initialData.getProducts().size();
		Product lastProducts = initialData.getProducts().get(listLength - 1);
		
		int newProductID = lastProducts.getProductID() + 1;
		inventoryItem.setProductID(newProductID);
		
		initialData.getProducts().add(inventoryItem);
				
	}

	}
