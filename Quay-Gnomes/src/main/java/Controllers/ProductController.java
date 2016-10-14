package Controllers;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.ProductManager;
import Entities.Product;

@Named("products")
@SessionScoped

public class ProductController {

	@Inject

	private ProductManager prodManager;
	private Product product;

	public String view(int id) {
		product= prodManager.findById(id);
		return "product";
		}
	

	public Product getProduct() {
		return product;
		}
	
	public void setProduct(Product product){
		this.product= product;
	}
	
}
