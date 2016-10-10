package Managers;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import DummyData.InitialData;
import Entities.Product;

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
	public Product findById(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persistProduct(Product p) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
