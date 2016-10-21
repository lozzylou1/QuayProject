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
		
	/**
	 * Display list of terms
	 * 
	 * @param String term
	 * @return String of product term
	 */
	
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
	
	/**
	 * Display list of type
	 * 
	 * @param String type
	 * @return String of product type
	 */
	
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
	
	/**
	 * Display list of sizes
	 * 
	 * @param String size
	 * @return String of product size
	 */
	
	public List<Product> displayListSize(String size)
	{	
		productList = productManager.findAll();
		resultsList = new ArrayList<Product>();		
		resultsList.clear();
		
		for(Product product : productList)
		{
			if (product.getProductSize().contains(size))
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
