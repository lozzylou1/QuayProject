package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Inventory")
public class Inventory {
//................................................................Declaration of Variables	
  
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
	private int dimensions;
	
	@Column (name = "threshold", nullable = false)
	private int threshold;
	
	@Column (name = "allocatedStock", nullable = false)
	private int allocatedStock;


	/**
	 * Gets the stock level
	 * 
	 * @return
	 */
	public int getstockLevel()
	{		
		return stockLevel;
	}
	
	/**
	 * Sets the stocklevel
	 * 
	 * @param stockLevel
	 */
	public void setstockLevel(int stockLevel) 
	{
		this.stockLevel = stockLevel;
	}
	
	/**
	 * Returns the threshold
	 * 
	 * @return threshold
	 */
	public int getThreshold()
	{
		return threshold;
	}
	
	/**
	 * Sets the threshold
	 * 
	 * @param threshold
	 */
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
	
	/**
	 * Returns the allocatedStock
	 * 
	 * @return allocatedStock
	 */
	public int getallocatedStock() 
	{
		return allocatedStock;
	}
	
	/**
	 * Sets allocated stock
	 * 
	 * @param allocatedStock
	 */
	public void setallocatedStock(int allocatedStock)
	{
		this.allocatedStock = allocatedStock;
	}
	
	/**
	 * Returns the productName
	 * 
	 * @return productName
	 */
	public String getproductName() 
	{
		return productName;
	}
	/**
	 * Sets the product name
	 *  
	 * @param productName
	 */
	public void setproductName(String productName)
	{
		this.productName = productName;
	}
	
	/**
	 * returns productID
	 * 
	 * @return productID
	 */
	public int getproductId() 
	{
		return productID;
	}
	
	/**
	 * Sets the productID
	 * 
	 * @param productId
	 */
	public void setproductId(int productId) 
	{
		this.productID = productId;
	}

}

