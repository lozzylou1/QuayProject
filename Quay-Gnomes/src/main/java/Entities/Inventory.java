package Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Inventory {
	

	@Id
	@Column (name = "productID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column (name = "productName", nullable = false)
	private String productName;
	
	
	@Column (name = "price", nullable = false)
	private float price;
	

	@Column (name = "stockLevel", nullable = false)
	private int stockLevel;
	
	

	@Column (name = "productWeight", nullable = false)
	private float weight;
	
	
	@Column (name = "productDimensions", nullable = false)
	private String dimensions;
	

	
	
	
	
	/** Returns the Stock Level */
	public int getStockLevel()
	{
		
			return stockLevel;
	}
	
	/** Sets Stock Level */
	public void setStockLevel(int stockLevel) 
	{
		this.stockLevel = stockLevel;
	}
	
	/** Gets the Threshold */
	public int getThreshold()
	{
		return threshold;
	}
	
	/** Set the Threshold */
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
	
	/** Gets allocated stock */
	public int getAllocatedStock() 
	{
		return allocatedStock;
	}
	
	/** Sets allocated stock */
	public void setAllocatedStock(int allocatedStock)
	{
		this.allocatedStock = allocatedStock;
	}
	
	/** Get Product name */
	public String getProductName() 
	{
		return productName;
	}
	
	/** Sets Product name */
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	/** Get Product ID */
	public int getProductId() 
	{
		return productId;
	}
	
	/** Set Product ID */
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}

	private int stockLevel;
	private int threshold;
	private int allocatedStock;
	private String productName;
	private int productId;


}

