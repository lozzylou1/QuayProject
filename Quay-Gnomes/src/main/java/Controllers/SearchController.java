package Controllers;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import services.SearchService;
import Entities.Product;

@SuppressWarnings("serial")
@Named("search")
@SessionScoped
public class SearchController implements Serializable {

	// private static final DataModel<Product> DMProduct = null;
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	private Product product;
	private ArrayList<Product> listOfProducts;
	private List<Product> results;
	private String term;
	@Inject
	private SearchService searchService;

	@SuppressWarnings("unused")
	private DataModel<Product> dataModel = null;
	
	


	public ArrayList<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(ArrayList<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	
	/**
	 * NOT SURE IF USED
	 * 
	 * Allows the user to search by a specific ID. 
	 * 
	 * 
	 * @param id
	 * @return String "product" to redirect the user to the projects page
	 */
	public String searchById(int id) {
		product = searchService.findById(id);
		return "Product";
	}
	

	public String search() 
	{	
		return "Products";
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
