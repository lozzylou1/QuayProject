package Controllers;

import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import Entities.Product;

@Named("products")
@SessionScoped

public class Search {

	@Inject
	
	private ProductManager prodManager;
	private Product product;
	
	public String view (int id){
		product = prodManager.findById(id);
		return "Products";
	}
	
}
