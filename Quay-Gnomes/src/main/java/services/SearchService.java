package services;

import Managers.ProductManager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.Product;

@Stateless
public class SearchService {

	@Inject
	private ProductManager productManager;

	private List<Product> productList;
	private List<Product> resultsList;		

	public List<Product> displayListTerm(String term)
	{	
		productList = productManager.findAll();
		resultsList = new ArrayList<Product>();		
		resultsList.clear();

		for(Product product : productList)
		{
			if (product.getProductName().toLowerCase().contains(term.toLowerCase()) ||
					product.getLongDescription().toLowerCase().contains(term.toLowerCase()) ||
					product.getShortDescription().toLowerCase().contains(term.toLowerCase()))
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
			if (product.getProductType().toLowerCase().contains(type.toLowerCase()))
			{
				resultsList.add(product);
			}
		}		
		return productList;
	}	


	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
