package Managers;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.DataModel;

import Entities.Product;

public interface ProductManager {
	
	public void persistProduct(Product p);
	public void persistProducts(List<Product> p);
	
	public Product findById(int productID);
	
	
<<<<<<< HEAD
	//read
	public List<Product> getProducts(String term);
=======
	/**Returns all the products in the data store*/
	public ArrayList<Product> findAll();
>>>>>>> e69acd9f53630f97b8161e6d0e4727a177bd8db7
	
	
	/**Creates a product*/
	public void createProduct(Product p);
	
<<<<<<< HEAD

	
	//update
	public void updateProduct(Product p);
	public Product findByName(String term);
	public List<Product> findAll();

	
	
=======
	/**Updates a product in the data store*/
	public void updateProduct(Product p);

>>>>>>> e69acd9f53630f97b8161e6d0e4727a177bd8db7
	
	public Product findByName(String term);	

}
