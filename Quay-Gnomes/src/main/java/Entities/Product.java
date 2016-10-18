package Entities;
import javax.persistence.*;

@Entity
@Table (name = "Product")
public class Product {
	//TODO Need to do foreign keys
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
	
	@Column (name = "shortDescription", nullable = false)
	private String shortDescription;
	
	@Column (name = "longDescription", nullable = false)
	private String longDescription;
	
	@Column (name = "image1", nullable = false)
	private String image1;
	
	public Product(int p_productID, String p_productName, float p_price, Boolean p_discontinued, int p_stockLevel, float p_weight, 
			String p_dimensions, String p_shortDescription, String p_longDescription, String p_image1){
		
		this.productID = p_productID;
		this.productName = p_productName;
		this.price = p_price;
		this.discontinued = p_discontinued;
		this.stockLevel = p_stockLevel;
		this.weight = p_weight;
		this.dimensions = p_dimensions;
		this.shortDescription = p_shortDescription;
		this.longDescription = p_longDescription;
		this.image1 = p_image1;
		
	}


	


	public String getImage1() {
		return image1;
	}





	public void setImage1(String image1) {
		this.image1 = image1;
	}





	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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
