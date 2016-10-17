package Managers;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public interface ProductManager {
	
	public void persistProduct(Product p);
	public void persistProducts(List<Product> p);
	
	public Product findById(int productID);
	
	
	/**Returns all the products in the data store*/
	public ArrayList<Product> findAll();
	
	
	/**Creates a product*/
	public void createProduct(Product p);
	
	/**Updates a product in the data store*/
	public void updateProduct(Product p);

	
	public Product findByName(String term);	

}
