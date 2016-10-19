package Managers.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
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


	public Product findById(int productID) {
		return  null;
	}

	@Override
	public List<Product> findAll() {
		return initialData.findAll();		
	}	


	@Override
	public void persistProduct(Product p) {
		// TODO Auto-generated method stub		
	}

	
	public Product findByName(String term)
	{
		//return initialData.getProduct(term);
		return null;
	}
}