package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Alert;
import com.quayproject.ims.services.ImsCreateService;

@SuppressWarnings("serial")
@Named("alerts")
@RequestScoped
public class AlertController implements Serializable{

	@Inject
	ImsCreateService imsCreateService;
	
	private DataModel<Alert> dataModel = null;	

	
	/**
	 * getting alert list from service layer
	 * 
	 * @return alertList
	 */
	public List<Alert> alert()
	{
		return imsCreateService.alertList();		
	}

/**
 * get data model
 * @return dataModel
 */
	public DataModel<Alert> getDataModel() {
		dataModel = createPageDataModel();
		return dataModel;
	}

	private ListDataModel<Alert> createPageDataModel()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <Alert> (alert());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Alert> (alert());
		}
	}
	
/**
 * set data model
 * @param dataModel
 */
	public void setDataModel(DataModel<Alert> dataModel) {
		this.dataModel = dataModel;
	}
	
	
}
