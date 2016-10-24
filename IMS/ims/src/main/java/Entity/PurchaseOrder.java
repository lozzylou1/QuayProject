package Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class PurchaseOrder {
	
	private int PurchaseOrderID;
	private int SupplierID;
	private String StaffID;
	private String Products;
	private double TotalPrice;
	private String SupplierName;
	
	public PurchaseOrder(int purchaseOrderID, int supplierID, String staffID, String products, double totalPrice,
			String supplierName) {
		super();
		PurchaseOrderID = purchaseOrderID;
		SupplierID = supplierID;
		StaffID = staffID;
		Products = products;
		TotalPrice = totalPrice;
		SupplierName = supplierName;
	}
	public int getPurchaseOrderID() {
		return PurchaseOrderID;
	}
	public void setPurchaseOrderID(int purchaseOrderID) {
		PurchaseOrderID = purchaseOrderID;
	}
	public int getSupplierID() {
		return SupplierID;
	}
	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getProducts() {
		return Products;
	}
	public void setProducts(String products) {
		Products = products;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

}
