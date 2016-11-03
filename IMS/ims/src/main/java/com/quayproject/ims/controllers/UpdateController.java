package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Alert;
import com.quayproject.ims.entities.Update;
import com.quayproject.ims.services.ImsCreateService;

@Named("updates")
@RequestScoped 
public class UpdateController implements Serializable {
	
	@Inject
	ImsCreateService imsCreateService;
	
	private DataModel<Update> dataModel = null;	

	public List<Update> update()
	{
		return imsCreateService.updateList();		
	}
	
	
	/**
	 * get data model
	 * @return dataModel
	 */
	public DataModel<Update> getDataModel() {
		dataModel = createPageDataModel();
		return dataModel;
	}
	
	private ListDataModel<Update> createPageDataModel()
	{
		dataModel = null;
		try
		{
			return new 							
					ListDataModel <Update> (update());
		}
		catch (Exception e)
		{
			return new 
					ListDataModel <Update> (update());
		}
	}
	
	/**
	 * set data model
	 * @param dataModel
	 */
		public void setDataModel(DataModel<Update> dataModel) {
			this.dataModel = dataModel;
		}
			
	
}
