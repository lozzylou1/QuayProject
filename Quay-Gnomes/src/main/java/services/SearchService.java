package services;

import Managers.ProductManager;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Entities.Product;

@Stateless
public class SearchService {
	@Inject
	private ProductManager productManager;
	
	/**
	 * 
	 * @param String name
	 * @return null || List of products
	 */
	public List<Product> findByName(String name) {

		if (name == null) {
			/**
			 * returning null for now, as unsure what we wish to display at this
			 * point
			 */
			return null;
		}

		/**
		 * Checks to see if the string contains any special characters
		 */
		if (name.contains("^[^<>%$]*$")) {
			return null;
		}

		return productManager.getProducts(name.toLowerCase());
	}

	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
