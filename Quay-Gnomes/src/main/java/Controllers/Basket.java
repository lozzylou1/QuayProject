package Controllers;
import javax.enterprise.context.SessionScoped;


@Named("basket")
@SessionScoped


public class Basket {
	
	@Inject

	private Basket basketManager;
	private Product product;

	public String view(int id) {
		product = basketManager.findById(id);
		return"product";
		}
	

	public Product getProduct() {
		return product;
		}
	
	public void setProduct(Product product){
		this.product = product;
	}

}
