package com.quayproject.ims.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.quayproject.ims.entities.Product;
import com.quayproject.ims.interfaces.Searchable;
import com.quayproject.ims.services.ImsService;

@Named("inventory")
@SessionScoped

public class InventoryController implements Serializable{

	@Inject
	private ImsService imsService;
	private String term;
	
	public List<Product> searchByName() {
		
		return imsService.inventory(term);
	}

	public Product searchById() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product searchByTerm() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
