package Managers;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.DataModel;

import Entities.Product;

public interface ProductManager {
	
	public void persistProduct(Product p);
	public void persistProducts(List<Product> p);
	
	public Product findById(Long productID);
	
	
	//read
	public List<Product> getProducts(String term);
	
	
	//create
	public void createProduct(Product p);
	

	
	//update
	public void updateProduct(Product p);
	public Product findByName(String term);
	public List<Product> findAll();

	
	
	

}
