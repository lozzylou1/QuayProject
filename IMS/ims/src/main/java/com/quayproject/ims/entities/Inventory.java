package com.quayproject.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Administrator
 *
 */

@Entity
@Table (name = "inventory")
public class Inventory {

	@Id
	@Column (name = "productID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column (name = "stockLevel", nullable = false)
	private int stockLevel;
	
	@Column (name = "threshold", nullable = false)
	private int threshold;
	
	@Column (name = "allocateStock", nullable = false)
	private boolean allocateStock;

	@Column (name = "productName", nullable = false)
	private String productName;

	
	/**
	 * Product Constructor for inventory
	 * 
	 * @param productID
	 * @param stockLevel
	 * @param threshold
	 * @param allocateStock
	 * @param productName
	 */
	
	public Inventory(){
		
	}
	public Inventory(int productID, int stockLevel, int threshold, boolean allocateStock, String productName) {
	
		this.productID = productID;
		this.stockLevel = stockLevel;
		this.threshold = threshold;
		this.allocateStock = allocateStock;
		this.productName = productName;
	}
	
	/**
	 * Returns the product ID
	 * 
	 * @return productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * set product ID
	 * 
	 * @param productID
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * Returns stock level
	 * 
	 * @return stockLevel
	 */
	public int getStockLevel() {
		return stockLevel;
	}

	/**
	 * Set stock level
	 * 
	 * @param stockLevel
	 */
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

	/**
	 * Return threshold
	 * 
	 * @return threshold
	 */
	public int getThreshold() {
		return threshold;
	}

	/**
	 * Sets threshold
	 * 
	 * @param threshold
	 */
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	/**
	 * Returns allocate stock
	 * 
	 * @return allocateStock
	 */
	public boolean isAllocateStock() {
		return allocateStock;
	}

	/**
	 * Sets allocate stock
	 * 
	 * @param allocateStock
	 */
	public void setAllocateStock(boolean allocateStock) {
		this.allocateStock = allocateStock;
	}

	/**
	 * Returns product name
	 * 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * Sets product name
	 * 
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
