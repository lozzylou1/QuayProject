package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import Entities.Product;

@Named("search")
@SessionScoped

public class Search {

	@Inject
	private ProductManager prodManager;
	private Product product;
	private List<Product> results;
	private String term;
	
	public String searchById (int id){
		product = prodManager.findById(id);
		return "Product";
	}
	
	
	public String search(String term) {
		results = prodManager.findByName(term);
		return "ProductDet";
	}
}
