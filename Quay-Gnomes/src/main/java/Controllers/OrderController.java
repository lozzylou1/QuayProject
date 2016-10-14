package Controllers;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Managers.CustomerAccountManager;


@Named("products")
@SessionScoped

public class OrderController {

	@Inject

	private CustomerAccountManager caManager;
	private Order order;

	public String view(int id) {
		//product = caManager.findById(id);
		return "order";
		}
	

	public Order getProduct() {
		return order;
		}
	
	public void setProduct(Order order){
		this.order = order;
	}
	
}
