package Managers;

import Entities.Product;



//import Entities.Product;

public interface BasketManager {
	
	/**
	 * Allows the product to persist to the database
	 * @param Product p 
	 */
	public void persistProduct(Product p);
	
	/**
	 * Add product to the basket
	 * 
	 * @param Product p
	 */
	public void addProductToBasket(Product p);
	
	/**
	 * Remove an item from the basket
	 */
	public void removeItemFromBasket();
	
	/**
	 * Checkout basket. Ie; go to payment
	 */
	public void checkoutbasket();
	
	/**
	 * Update basket. Ie; change quantity of item etc
	 */
	public void updateBasket();
	
	
	
}
