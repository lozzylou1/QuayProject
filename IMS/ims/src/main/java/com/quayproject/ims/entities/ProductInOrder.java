package com.quayproject.ims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ProductInOrder")
public class ProductInOrder {
	
	@Id
	@Column (name = "productID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column (name = "numberOfItems", nullable = false)
	private int numberOfItems;
	
	
	public ProductInOrder(int productID, int numberOfItems){
		this.numberOfItems = numberOfItems;
		this.productID = productID;
		
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public int getNumberOfItems() {
		return numberOfItems;
	}


	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
	
	
	

}
