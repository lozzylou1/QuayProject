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
import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.services.ImsService;

@SuppressWarnings("serial")
@Named("purchaseOrderController")
@RequestScoped
public class PurchaseOrderController implements Serializable {

	@Inject
	private ImsService imsService;
	private String term;		
	
	private DataModel <PurchaseOrder> dataModel = null;	
	
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
		dataModel = createPageDataModel();
		return dataModel;
	}
	
	/**
	 * creates dataModel
	 *  
	 * @return new dataModel containing the found suppliers
	 */
	private DataModel<PurchaseOrder> createPageDataModel()
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
}
