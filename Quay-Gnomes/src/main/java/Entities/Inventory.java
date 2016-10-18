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

//.................................................................Constructor
	
	

//................................................................ Getters and Setters 	
	/** Returns the Stock Level */
	public int getstockLevel()
	{		
		return stockLevel;
	}
	
	/** Sets Stock Level */
	public void setstockLevel(int stockLevel) 
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
	public int getallocatedStock() 
	{
		return allocatedStock;
	}
	
	/** Sets allocated stock */
	public void setallocatedStock(int allocatedStock)
	{
		this.allocatedStock = allocatedStock;
	}
	
	/** Get Product name */
	public String getproductName() 
	{
		return productName;
	}
	/** Sets Product name */
	public void setproductName(String productName)
	{
		this.productName = productName;
	}
	
	/** Get Product ID */
	public int getproductId() 
	{
		return productID;
	}
	
	/** Set Product ID */
	public void setproductId(int productId) 
	{
		this.productID = productId;
	}

}

