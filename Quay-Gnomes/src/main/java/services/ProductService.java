package services;

import Managers.ProductManager;

import javax.inject.Inject;

import Entities.Product;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class ProductService {
@Inject
private ProductManager productManager;

public Product findProductById(String id){
	System.out.println("ID: " + id);
	try {
		int intId = Integer.parseInt(id);
		return findProductById(intId);
	} catch (Exception e) {
		return null;
	}

}

	public Product findProductById(int id) {
		return productManager.findById(id);

	}

	public List<Product> findAll() {
		return productManager.findAll();
	}
}
