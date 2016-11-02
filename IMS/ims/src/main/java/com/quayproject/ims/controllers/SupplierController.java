package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Supplier;
import com.quayproject.ims.services.ImsCreateService;
import com.quayproject.ims.services.ImsService;

@SuppressWarnings("serial")
@Named("supplierControl")
@RequestScoped
public class SupplierController implements Serializable {

	@Inject
	private ImsService imsService;
	@Inject
	private ImsCreateService imsCreateService;

	private String term;
	private String error;
	private String supplierName;
	private String supplierContactNumber;

	private DataModel <Supplier> dataModel =null;

	/**
	 * provides list of suppliers containing term
	 * @return List<Suppler>
	 */
	public List<Supplier> searchByName() {

		if (term == null || term == "")
		{
			return imsService.supplier();
		}
		else
		{
			return imsService.supplier(term);
		}
	}

	/**
	 * gets the data in the dataModel
	 * @return dataModel
	 */
	public DataModel <Supplier> getDataModel()
	{
		dataModel = createPageDataModel();
		return dataModel;
	}

	/**
	 * creates dataModel
	 *  
	 * @return new dataModel containing the found suppliers
	 */
	private DataModel<Supplier> createPageDataModel()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <Supplier> (searchByName());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Supplier> (searchByName());
		}
	}

	/**
	 * submits information of new suppler
	 */
	public void submitSupplier() 
	{
		if ((supplierName != null || supplierName != "")
				&&
				(supplierContactNumber != null || supplierContactNumber != ""))
		{
			imsCreateService.validateNewSupplierDetails(supplierName, supplierContactNumber);
		}
		else if (supplierName == null || supplierName == "")
		{
			error ="Please Enter a Supplier Name";
		}
		else if (supplierContactNumber == null || supplierContactNumber == "")
		{
			error = "Please Enter the Suppliers Contact Number!";
		}
	}
	
	
	/**
	 * Sets the error message
	 * 
	 * @param error
	 * @return
	 */
	public String errorMessage()
	{
		String errorMessage = error;
		return errorMessage;
	}

	/**
	 * get supplier name
	 * @return supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * set supplierName
	 * @param supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * get supplierContactNumber
	 * @return supplierContactNumber
	 */
	public String getSupplierContactNumber() {
		return supplierContactNumber;
	}

	/**
	 * get supplierContactNumber
	 * @param supplierContactNumber
	 */
	public void setSupplierContactNumber(String supplierContactNumber) {
		this.supplierContactNumber = supplierContactNumber;
	}

	/**
	 * gets the term to search for supplier with
	 * @return
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * sets the term to search for supplier with
	 * @param term
	 */
	public void setTerm(String term) {
		this.term = term;
	}	
}
