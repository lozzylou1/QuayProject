package Managers;

import java.util.List;

import Entities.Product;

public interface ProductManager {
	
	/**
	 * Persist the product to the db
	 * 
	 * @param product p
	 */
	public void persistProduct(Product p);
	
	/**
	 * Persist a list of products to the db
	 * 
	 * @param List<Product> p 
	 */
	public void persistProducts(List<Product> p);
	
	/**
	 * Find a product by ID
	 * 
	 * @param productID
	 * @return
	 */
	public Product findById(int productID);
	
	
	/**
	 * Returns a list of products 
	 * based on the search term
	 * 
	 * @param term
	 * @return
	 */
	public List<Product> getProducts(String term);
	
	/**
	 * find all products
	 */
	public List<Product> findAll();
	
	
	/**
	 * Create a product
	 * 
	 * @param Product p
	 */
	public void createProduct(Product p);
	
	/**
	 * Update product
	 * 
	 * @param Product p
	 */
	public void updateProduct(Product p);
	
	/**
	 * Find a product by name
	 * 
	 * @param termterm
	 */
	public Product findByName(String term);	

}
