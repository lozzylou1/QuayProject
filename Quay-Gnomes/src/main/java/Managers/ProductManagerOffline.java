package Managers;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import DummyData.InitialData;
import Entities.Product;


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
	public Product findById(int productID) {
		return  null;
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

	@Override
	public List<Product> findByName(String term) {
		List<Product> results = new ArrayList<>();
		
		for(Product p : initialData.getProducts())
			if (p.getProductName().equalsIgnoreCase(term))
				results.add(p);
		
//		initialData.getProducts().forEach((Product p)->{
//			if(p.getProductName().endsWith(term))
//				results.add(p);
//		});
		return results;
	}
}