package Entities;


public class Inventory {

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

