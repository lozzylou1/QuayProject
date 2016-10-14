package Managers;

import Entities.Product;

//import Entities.Product;

public interface BasketManager {

	public void persistProduct(Product p);
	
	public void addProductToBasket(Product p);
	
	public void removeItemFromBasket();
	
	public void checkoutbasket();
	
	public void updateBasket();
	
	
	
}
