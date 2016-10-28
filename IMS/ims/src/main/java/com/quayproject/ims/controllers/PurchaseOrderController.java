package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.ArrayList;
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

	
	private String term;		
	private int productID;
	private double totalPrice;

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
	 * gets the data in the dataModel
	 * @return dataModel
	 */
	public DataModel <PurchaseOrder> getDataModel()
	{ 
		dataModel = createPageDataModelPreviousOrders();		
		return dataModel;
	}
	
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
	 * creates dataModel for viewing the order being created
	 * 
	 * @return
	 */
	private DataModel<Product> createPageDataModelCurrentOrder()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <Product> (imsCreateService.getOrderList());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Product> (imsCreateService.getOrderList());
		}
	}	

	public void addToOrder() 
	{
		Product product = imsService.findProductByID(productID);
		if (product != null)
		{
			imsCreateService.getOrderList().add(product);
			totalPrice += product.getPrice();
			System.out.println(totalPrice);
		}
	}
	
	public void removeFromOrder()
	{
		//TODO
	}

	public void submitOrder()
	{
		imsCreateService.submitOrder(totalPrice);
	}
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * Gets the term to search with
	 * @return
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * sets the term to search with
	 * @param term
	 */
	public void setTerm(String term) {
		this.term = term;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
