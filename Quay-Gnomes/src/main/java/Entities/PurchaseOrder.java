package Entities;

import javax.persistence.*;

/**
 * 
 * @author Administrator
 *
 */
@Entity
@Table (name = "purchaseOrder")
public class PurchaseOrder {

	@Id
	@Column (name = "purchaseOrder", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private int purchaseOrderID;
	
	@Column (name = "supplierID", nullable = false)
	private int supplierID;
	
	@Column (name = "supplierName", nullable = false)
	private String supplierName;
	
	@Column (name = "totalPrice", nullable = false)
	private double totalPrice;
	
	@Column (name = "productID", nullable = false)
	private int productID;
	
	@Column (name = "staffID", nullable = false)
	private int staffID;

	/**Gets purchase order id
	 * 
	 *  @return purchase order ID 
	 */
	public int getPurchaseOrderID() {
		return purchaseOrderID;
	}
	
	/**set purchase order id
	 * 
	 *  @param purchaseOrderID 
	 */
	public void setPurchaseOrderID(int purchaseOrderID) {
		this.purchaseOrderID = purchaseOrderID;
	}
	
	/**Gets supplier id
	 * 
	 *  @return supplierID 
	 */
	public int getSupplierID() {
		return supplierID;
	}
	
	/**set supplier id
	 * 
	 *  @param supplierID 
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	
	/**Gets supplier name
	 * 
	 *  @return supplierName 
	 */
	public String getSupplierName() {
		return supplierName;
	}
	
	/**set supplier name
	 * 
	 *  @param supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	/**Gets TotalPrice
	 * 
	 *  @return totalPrice 
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	
	/**set total price
	 * 
	 *  @param totalPrice 
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	/**Gets product id
	 * 
	 *  @return productID 
	 */
	public int getProductID() {
		return productID;
	}
	
	/**set product id
	 * 
	 *  @param productID 
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	/**Gets staff id
	 * 
	 *  @return staffID 
	 */
	public int getStaffID() {
		return staffID;
	}
	
	/**set staff id
	 * 
	 *  @param staffID 
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
}
