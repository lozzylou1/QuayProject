package Entities;
import javax.persistence.*;

/**
 * @author Administrator
 *
 */
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
	
	@Column (name = "type", nullable = false)
	private String type;
	
	@Column (name = "size", nullable = false)
	private String size;
	
	@Column (name = "image1", nullable = false)
	private String image1;
	
	/**
	 * Product Constructor
	 * 
	 * @param p_productID
	 * @param p_productName
	 * @param p_price
	 * @param p_discontinued
	 * @param p_stockLevel
	 * @param p_weight
	 * @param p_dimensions
	 * @param p_shortDescription
	 * @param p_longDescription
	 * @param p_image1
	 */

	public Product(int p_productID, String p_productName, float p_price, Boolean p_discontinued, int p_stockLevel, float p_weight, 
			String p_dimensions, String p_shortDescription, String p_longDescription, String p_type, String p_size, String p_image1){
		
		this.productID = p_productID;
		this.productName = p_productName;
		this.price = p_price;
		this.discontinued = p_discontinued;
		this.stockLevel = p_stockLevel;
		this.weight = p_weight;
		this.dimensions = p_dimensions;
		this.shortDescription = p_shortDescription;
		this.longDescription = p_longDescription;
		this.type = p_type;
		this.size = p_size;
		this.image1 = p_image1;
	}

	/**
	 * Returns the first image
	 * 
	 * @return image1
	 */

	public String getImage1() {
		return image1;
	}


	/**
	 * Set image1
	 * 
	 * @param image1
	 */

	public void setImage1(String image1) {
		this.image1 = image1;
	}


	/**
	 * Get short description
	 * 
	 * @return shortDescription
	 */


	public String getShortDescription() {
		return shortDescription;
	}

	
	/**
	 * Set the short description
	 * 
	 * @param shortDescription
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	
	/**
	 * Get the long description for product
	 * 
	 * @return longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}

	
	/**
	 * Set the long description
	 * 
	 * @param longDescription
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	/**
	 * Return the product ID
	 * 
	 * @return productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * Set the product ID
	 * 
	 * @param productID
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * return the product name
	 * 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Set the product name
	 * 
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Get the price of the product
	 * 
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * Set the price as a float
	 * 
	 * @param float price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * Return if item is discontinued
	 * 
	 * @return boolean discontinued
	 */
	public Boolean getDiscontinued() {
		return discontinued;
	}

	/**
	 * Set product to be discontinued
	 * 
	 * @param boolean discontinued
	 */
	public void setDiscontinued(Boolean discontinued) {
		this.discontinued = discontinued;
	}

	/**
	 * Return the stock level
	 * 
	 * @return stockLevel
	 */
	public int getStockLevel() {
		return stockLevel;
	}

	/**
	 * Set the stock level
	 * 
	 * @param stockLevel
	 */
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

	/**
	 * Return the weight (float)
	 * 
	 * @return float weight
	 */
	public float getWeight() {
		return weight;
	}
	
	/**
	 * Set the weight of the product (float)
	 * 
	 * @param float weight
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * Return product dimensions (string)
	 * 
	 * @return String dimensions
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * Set the dimensions of the product
	 * 
	 * @param String dimensions
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	
	/**
	 * Gets the product type
	 * 
	 * @return Product type
	 */
	public String getProductType() {
		return type;
	}
	
	/**
	 * Sets the product type 
	 * 
	 * @param String type 
	 */
	public void setProductType(String type) {
		this.type = type;	
	}	
	
	/**
	 * Gets the product size
	 * 
	 * @return Product size
	 */
	public String getProductSize() {
		return size;
	}
	
	/**
	 * Sets the product size 
	 * 
	 * @param String size 
	 */
	public void setProductSize(String size) {
		this.size = size;
		
	}	
	
}
