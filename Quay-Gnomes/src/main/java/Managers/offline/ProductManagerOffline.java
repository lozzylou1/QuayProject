package Managers.offline;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.faces.model.DataModel;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.Product;
import Managers.ProductManager;


@Default
@Stateless
public class ProductManagerOffline implements ProductManager {
	

	@Inject
	private InitialData initialData;
	
	
	//create
	@Override
	public void createProduct(Product p){
		
	}
	
	//update
	@Override
	public void updateProduct(Product p){
		
	}

	@Override
	public void persistProducts(List<Product> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD:Quay-Gnomes/src/main/java/Managers/ProductManagerOffline.java
	public List<Product> getProducts(String term) {
		return initialData.getProducts(term);
=======
	public Product findById(int productID) {
		return  null;
	}

	@Override
	public ArrayList<Product> findAll() {
		return initialData.getProducts();
		
	}
	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return initialData.getProducts();
>>>>>>> e69acd9f53630f97b8161e6d0e4727a177bd8db7:Quay-Gnomes/src/main/java/Managers/offline/ProductManagerOffline.java
	}

	@Override
	public void persistProduct(Product p) {
		// TODO Auto-generated method stub		
	}

	
	public Product findByName(String term)
	{
		return initialData.getProduct(term);
	}
}