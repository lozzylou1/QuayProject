package com.quayproject.ims.managers.online;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.mail.Session;

import org.hibernate.Query;

import com.quayproject.ims.dummydata.InitialData;
import com.quayproject.ims.entities.Product;
import com.quayproject.ims.managers.InventoryManager;
import com.quayproject.ims.hibernate.HibernateApplication;
import com.quayproject.ims.hibernate.HibernateStaffAccount;

@Stateless
@Default
public class InventoryManagerOnline implements InventoryManager {

	@Inject
	public InitialData initialData;
	static org.hibernate.Session session = HibernateApplication.getSession();

	/**
	 * Implementation of interface method
	 */
	@Override
	public List<Product> allInventory() {
		
		HibernateApplication.start();
		Query query = session.createQuery("from product"); 
		 List<Product> list = query.list(); 
		System.out.println(list.toString());
		HibernateApplication.getSession().close();
		
		return list;
		
	}
	

	/**
	 * Implementation of create inventory from interface method
	 * 
	 * @param productName
	 * @param stockLevel
	 * @param threshold
	 */

	@Override
	public void createNewInventoryItem(String productName, int stockLevel, int threshold) {
		
		
		
		Product inventoryItem = new Product (productName, stockLevel, threshold);

		int listLength = initialData.getProducts().size();
		Product lastProducts = initialData.getProducts().get(listLength - 1);

		int newProductID = lastProducts.getProductID() + 1;
		inventoryItem.setProductID(newProductID);

		initialData.getProducts().add(inventoryItem);
		
		
		
		
		/*HibernateApplication.start();
		
		try{
			HibernateStaffAccount st = (HibernateStaffAccount) session.get(HibernateStaffAccount.class, new Long(200));
			System.out.println("StaffAccount get called");
			if(st != null){
			System.out.println("Staff = "+st.getStaff());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		/*
		Product inventoryItem = new Product (productName, stockLevel, threshold);

		int listLength = initialData.getProducts().size();
		Product lastProducts = initialData.getProducts().get(listLength - 1);

		int newProductID = lastProducts.getProductID() + 1;
		inventoryItem.setProductID(newProductID);

		initialData.getProducts().add(inventoryItem);*/

	}

}
