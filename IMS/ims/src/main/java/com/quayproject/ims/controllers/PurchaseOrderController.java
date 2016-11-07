package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.entities.PurchaseOrder;
import com.quayproject.ims.services.ImsCreateService;
import com.quayproject.ims.services.ImsService;

@SuppressWarnings("serial")
@Named("purchaseOrderController")
@RequestScoped
public class PurchaseOrderController implements Serializable {

	@Inject
	private ImsService imsService;
	@Inject
	private ImsCreateService imsCreateService;
	@Inject
	private Basket basket;


	private String term;	
	private int productID;
	private int numberOfItems;

	private DataModel <PurchaseOrder> dataModel = null;	
	private DataModel <Product> dataModelProduct = null;

	public List<PurchaseOrder> searchByID(){

		if (term == null || term == "")
		{
			return imsService.purchaseOrder();
		}
		else
		{
			return imsService.purchaseOrder(term);
		}
	}

	/**
	 * Gets the data in the dataModel for viewing orders placed
	 * 
	 * @return dataModel
	 */
	public DataModel <PurchaseOrder> getDataModel()
	{ 
		dataModel = createPageDataModelPreviousOrders();		
		return dataModel;
	}

	/**
	 * Gets the data in the dataModel for viewing the order being created
	 * 
	 * @return dataModel
	 */
	public DataModel <Product> getDataModelProduct()
	{ 
		dataModelProduct = createPageDataModelCurrentOrder();	
		return dataModelProduct;
	}


	/**
	 * creates dataModel for viewing orders
	 *  
	 * @return new dataModel containing the found suppliers
	 */
	private DataModel<PurchaseOrder> createPageDataModelPreviousOrders()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <PurchaseOrder> (searchByID());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <PurchaseOrder> (searchByID());
		}
	}	

	/**
	 * Creates dataModel for viewing the order being created
	 * 
	 * @return
	 */
	private DataModel<Product> createPageDataModelCurrentOrder()
	{
		dataModelProduct = null;
		try
		{
			return new							
					ListDataModel <Product> (basket.getBasketList());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Product> (basket.getBasketList());
		}
	}	

	/**
	 * Adds a product to the basket
	 * 
	 */
	public void addToOrder() 
	{
		Product product = imsService.findProductByID(productID);
		if (product != null)
		{
			basket.add(product, numberOfItems);
		}
	}

	/**
	 * removes a item from the basket
	 * 
	 */
	public void removeFromBasket()
	{
		Product product = imsService.findProductByID(productID);
		if (product != null)
		{
			basket.remove(product);
		}
	}

	/**
	 * Submits the order to the data store
	 * 
	 */
	public void submitOrder()
	{
		//TODO
		//imsCreateService.submitOrder(basket.getOrderList(), getTotalPrice());
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID)
	{
		this.productID = productID;
	}

	/**
	 * Gets the term to search with
	 * 
	 * @return
	 */
	public String getTerm() 
	{
		return term;
	}

	/**
	 * sets the term to search with
	 * 
	 * @param term
	 */
	public void setTerm(String term) 
	{
		this.term = term;
	}

	/**
	 * Gets the total price of the basket from the basket controller
	 * 
	 * @return
	 */
	public double getTotalPrice()
	{
		return basket.getTotalPrice();
	}

	/**
	 * Gets the number of items the  user wants
	 * 
	 * @return the numberOfItems
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * Sets the number of items
	 * 
	 * @param numberOfItems the numberOfItems to set
	 */
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
}
