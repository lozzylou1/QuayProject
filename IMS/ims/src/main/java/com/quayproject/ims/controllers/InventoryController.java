package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.services.ImsService;

@SuppressWarnings("serial")
@Named("inventory")
@RequestScoped
public class InventoryController implements Serializable {

	@Inject
	private ImsService imsService;
	private String term;		

	private DataModel <Product> dataModel = null;	


	public List<Product> searchByName() {

		if (term == null || term == "")
		{
			return imsService.inventory();
		}
		else
		{
			return imsService.inventory(term);
		}
	}

	public DataModel <Product> getDataModel()
	{
		dataModel = createPageDataModel();
		return dataModel;
	}


	private DataModel<Product> createPageDataModel()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <Product> (searchByName());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Product> (searchByName());
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