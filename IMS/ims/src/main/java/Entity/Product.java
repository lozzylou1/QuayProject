package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	private int ProductID;
	private int PurchaseOrderID;
	private int InventoryID;
	private String ProductName;
	private double Price;
	private boolean Discontinued;
	private int StockLevel;
	private int ProductWeight;
	private int ProductDimentions;
	
	public Product(int productID, int purchaseOrderID, int inventoryID, String productName, double price,
			boolean discontinued, int stockLevel, int productWeight, int productDimentions) {
		super();
		ProductID = productID;
		PurchaseOrderID = purchaseOrderID;
		InventoryID = inventoryID;
		ProductName = productName;
		Price = price;
		Discontinued = discontinued;
		StockLevel = stockLevel;
		ProductWeight = productWeight;
		ProductDimentions = productDimentions;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getPurchaseOrderID() {
		return PurchaseOrderID;
	}
	public void setPurchaseOrderID(int purchaseOrderID) {
		PurchaseOrderID = purchaseOrderID;
	}
	public int getInventoryID() {
		return InventoryID;
	}
	public void setInventoryID(int inventoryID) {
		InventoryID = inventoryID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public boolean isDiscontinued() {
		return Discontinued;
	}
	public void setDiscontinued(boolean discontinued) {
		Discontinued = discontinued;
	}
	public int getStockLevel() {
		return StockLevel;
	}
	public void setStockLevel(int stockLevel) {
		StockLevel = stockLevel;
	}
	public int getProductWeight() {
		return ProductWeight;
	}
	public void setProductWeight(int productWeight) {
		ProductWeight = productWeight;
	}
	public int getProductDimentions() {
		return ProductDimentions;
	}
	public void setProductDimentions(int productDimentions) {
		ProductDimentions = productDimentions;
	}

}
