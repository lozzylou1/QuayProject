package Entities;

public class PurchaseOrder {


	private int purchaseOrderID;
	private int supplierID;
	private String supplierName;
	private double totalPrice;
	private int productID;
	private int staffID;

	/**returns purchase order ID */
	public int getPurchaseOrderID() {
		return purchaseOrderID;
	}
	public void setPurchaseOrderID(int purchaseOrderID) {
		this.purchaseOrderID = purchaseOrderID;
	}
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
}
