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
return findProductById(Long.parseLong(id));
}

public Product findProductById(long id){
return productManager.findById(id);

}
public List<Product> findAll() {
return productManager.findAll();
}
}

