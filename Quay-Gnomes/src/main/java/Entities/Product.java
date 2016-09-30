package Entities;
import javax.persistence.*;

@Entity
@Table (name = "Product")


//Need to do foreign keys
public class Product {
	
	@Id
	@Column (name = "productID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column (name = "productName", nullable = false)
	private String productName;
	
	
	@Column (name = "price", nullable = false)
	private float price;
	
	
	@Column (name = "discontinued", nullable = false)
	private Boolean discontinued;
	
	

	@Column (name = "stockLevel", nullable = false)
	private int stockLevel;
	
	

	@Column (name = "productWeight", nullable = false)
	private float weight;
	
	
	
	@Column (name = "productDimensions", nullable = false)
	private String dimensions;
	
	
	public Product(int p_productID, String p_productName, float p_price, Boolean p_discontinued, int p_stockLevel, float p_weight, String p_dimensions){
		
		this.productID = p_productID;
		this.productName = p_productName;
		this.price = p_price;
		this.discontinued = p_discontinued;
		this.stockLevel = p_stockLevel;
		this.weight = p_weight;
		this.dimensions = p_dimensions;
		
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Boolean getDiscontinued() {
		return discontinued;
	}


	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}


	public int getStockLevel() {
		return stockLevel;
	}


	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public String getDimensions() {
		return dimensions;
	}


	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}	
	

}
