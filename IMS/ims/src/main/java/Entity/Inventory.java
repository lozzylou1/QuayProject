package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Inventory {

	private int ProductID;
	private int StockLevel;
	private int Threshold;
	private boolean AllocateStock;
	private String ProductName;
	
	public Inventory(int productID, int stockLevel, int threshold, boolean allocateStock, String productName) {
		super();
		ProductID = productID;
		StockLevel = stockLevel;
		Threshold = threshold;
		AllocateStock = allocateStock;
		ProductName = productName;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public int getStockLevel() {
		return StockLevel;
	}
	public void setStockLevel(int stockLevel) {
		StockLevel = stockLevel;
	}
	public int getThreshold() {
		return Threshold;
	}
	public void setThreshold(int threshold) {
		Threshold = threshold;
	}
	public boolean isAllocateStock() {
		return AllocateStock;
	}
	public void setAllocateStock(boolean allocateStock) {
		AllocateStock = allocateStock;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
}
