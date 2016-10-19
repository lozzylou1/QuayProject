package services;

import Managers.ProductManager;
import Managers.offline.ProductManagerOffline;

import java.util.ArrayList;
import java.util.Collection;
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
	//private DataModel data;
	
	List<Product> productList;
	List<Product> resultsList;
	
	/*
	@SuppressWarnings({ "null", "unchecked" })
	public List<Product> findByName(String name) {
		System.out.println(">>>>>>>>>>>>>>>>>>>" + name);
		List<Product> pList = null;
		
		/*
		 * if (name == null) {
		 *//**
			 * returning null for now, as unsure what we wish to display at this
			 * point
			 */
		/*
		 * //return null; }
		 * 
		 *//**
			 * Checks to see if the string contains any special characters
			 *//*
			 * if(name.contains("^[^<>%$]*$")) { return null; }
			 */
	/*	try{
			
			if (name != null) {
				System.out.println(">>>>>>>>>>>>>>>> name check is done");
				for (Product product : productManager.getProducts()) {
					System.out.println(">>>>>>>>>>>>>>>> in the loop");
					if (product.getProductName().equals(name)) {

						System.out.println("TERM IN INTIAL DATA" + name);
						System.out.println("PRODUCT IN INITAL DATA" + product);

						pList.add(product);
					}else{
						System.out.println(">>>>>>>>>>>>>>> This didnt work");
					}
				}
				return (DataModel<Product>) pList;
			} 
	
		}catch(NullPointerException npw){
			return null;
		}
		
		System.out.println("name" + name);
		return null;*/

		// System.out.println(productManager.getProducts(name));
		
		
		
		
		/*for (Product product: productManager.getProducts()){
			
			if (product.getProductName().equals(name)){
				System.out.println(">>>>>>>>>>>>>>> Product Added");
			
				
			}
			
			System.out.println("LIST!!!!" + product.getProductName());
		}*/
		
		
		/*
		
		for(int i = 0; i < productManager.getProducts().size() - 1; i++){
			
			if(productManager.getProducts().get(i).getProductName().equals(name)){
				System.out.println(productManager.getProducts().get(i).getProductName());
				
				System.out.println(">>>>>>>>>>>>>>> Product Added");
				pList.add(productManager.getProducts().get(i));
			}
			
		}
		
		
		
		return pList;
	}*/
	
	
	
	public List<Product> displayList(String term)
	{	
		productList = productManager.findAll();
		resultsList = new ArrayList<Product>();		
		resultsList.clear();
		
		for(Product product : productList)
		{
			System.out.println(">>>>>>SEARCH TERM = " + term);
			System.out.println(">>>>>>>>>>>" + product.getProductName() + " = Search Result");
			if (product.getProductName().contains(term))
			{
				resultsList.add(product);
				System.out.println(">>>>>>>>>>>" + product.getProductName() + " ADDED!!!!!!!");
			}
		}		
		return resultsList;
	}
	

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
