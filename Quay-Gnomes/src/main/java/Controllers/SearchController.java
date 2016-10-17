package Controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import Entities.Product;

@Named("search")
@SessionScoped
public class SearchController implements Serializable{

	@Inject
	private ProductManager prodManager;
	private Product product;
	private List<Product> results;
	private String term;
	
	public String searchById (int id){
		product = prodManager.findById((long) id);
		return "Product";
	}
	
	
	public String search() {
		product = prodManager.findByName(term);
		return "ProductDet";
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public List<Product> getResults() {
		return results;
	}


	public void setResults(List<Product> results) {
		this.results = results;
	}


	public String getTerm() {
		return term;
	}


	public void setTerm(String term) {
		this.term = term;
	}
}
