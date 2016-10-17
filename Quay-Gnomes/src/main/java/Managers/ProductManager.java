package Managers;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public interface ProductManager {
	
	public void persistProduct(Product p);
	public void persistProducts(List<Product> p);
	
	public Product findById(Long productID);
	
	
	//read
	public ArrayList<Product> getProducts();
	
	
	//create
	public void createProduct(Product p);
	
	//update
	public void updateProduct(Product p);
	public Product findByName(String term);
	public List<Product> findAll();
	
	
	
	

}
