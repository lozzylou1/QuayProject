package Entities;
import javax.persistence.*;

@Entity
@Table (name = "Products")

public class Products {
	
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
	
	
	public Products(int p_productID, String p_productName, float p_price, Boolean p_discontinued, int p_stockLevel, float p_weight, String p_dimensions){
		
		this.productID = p_productID;
		this.productName = p_productName;
		this.price = p_price;
		this.discontinued = p_discontinued;
		this.stockLevel = p_stockLevel;
		this.weight = p_weight;
		this.dimensions = p_dimensions;
		
		
	}	
	

}
