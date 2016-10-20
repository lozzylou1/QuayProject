package services;

import Managers.ProductManager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import Entities.Product;

@Stateless
public class SearchService {
	
	@Inject
	private ProductManager productManager;


	List<Product> productList;
	List<Product> resultsList;
		
	
	public List<Product> displayListTerm(String term)
	{	
		productList = productManager.findAll();
		resultsList = new ArrayList<Product>();		
		resultsList.clear();
		
		for(Product product : productList)
		{
			if (product.getProductName().contains(term))
			{
				resultsList.add(product);
			}
		}		
		return resultsList;
	}	
	
	public List<Product> displayListType(String type)
	{	
		productList = productManager.findAll();
		resultsList = new ArrayList<Product>();		
		resultsList.clear();
		
		for(Product product : productList)
		{
			if (product.getProductType().contains(type))
			{
				resultsList.add(product);
			}
		}		
		return resultsList;
	}	
	

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
