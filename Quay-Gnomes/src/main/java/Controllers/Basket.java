package Controllers;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entities.Product;
import Managers.ProductManager;


@Named("basket")
@SessionScoped



public class Basket {
	
	@Inject

	private ProductManager Basket;
	private Product product;

	public String view(int id) {
		product = Basket.findById(id);
		return"product";
		}
	

	public Product getProduct() {
		return product;
		}
	
	public void setProduct(Product product){
		this.product = product;
	}

}
