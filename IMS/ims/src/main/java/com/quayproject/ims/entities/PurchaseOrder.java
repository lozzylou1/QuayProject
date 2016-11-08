package com.quayproject.ims.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {
	
	List<Product> order = new ArrayList<Product>();
	
	@Id
	@Column (name = "purchaseOrderID", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int purchaseOrderID;
	
	//Foreign key
	@Column (name = "supplierID", nullable = false)
	private int supplierID;
	
	@Column (name = "supplierName", nullable = false)
	private String supplierName;
	
	@Column (name = "staffID", nullable = false)
	private int staffID;
	
	@Column (name = "products", nullable = false)
	private String products;
	
	@Column (name = "orderTotal", nullable = false)
	private double orderTotal;
	
	@Column (name = "productID", nullable = false)
	private int productID;
	
	@Column (name = "dateOfOrder",nullable = false)
	private String dateOfOrder;
	
	@Column (name = "dateOfDelivery",nullable = false)
	private String dateOfDelivery;
	
	@Column (name = "status", nullable = false)
	private String status;
	
		
/**
 * update constructor
 * 
 * @param purcahseOrderID
 * @param status
 */
	public PurchaseOrder(int purchaseOrderID, String status){
		
	this.purchaseOrderID = purchaseOrderID;
	this.status = status;
	}

	/**
	 * PurchaseOrder Constructor
	 * 
	 * @param supplierID
	 * @param supplierName
	 * @param orderTotal
	 * @param dateOfOrder
	 * @param dateOfDelivery
	 */
	public PurchaseOrder( int purchaseOrderID, String  supplierName, double orderTotal, String dateOfOrder, String dateOfDelivery, String status) {
				
		this.purchaseOrderID = purchaseOrderID;
		this.supplierName = supplierName;
		this.orderTotal = orderTotal;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.status = status;			
		}
	
	/**
	 * Constructor for Creating a Purchase order
	 * 
	 * @param purchaseOrderID
	 * @param supplierName
	 * @param orderTotal
	 * @param dateOfOrder
	 * @param dateOfDelivery
	 */
	public PurchaseOrder( int purchaseOrderID, String  supplierName, double orderTotal, String dateOfOrder) {
		
		this.purchaseOrderID = purchaseOrderID;
		this.supplierName = supplierName;
		this.orderTotal = orderTotal;
		this.dateOfOrder = dateOfOrder;
		this.status = "Pending Approval";
		}
	
	/**
	 * Constructor to create a PurchaseOrder
	 * 
	 * @param orderList
	 */
	public PurchaseOrder(List<Product> orderList)
	{
		this.order = orderList;
	}
	
	
	public List<Product> getOrder() {
		return order;
	}

	public void setOrder(List<Product> order) {
		this.order = order;
	}

	public int getPurchaseOrderID()
	{
		return purchaseOrderID;
	}
	
	public void setPurchaseOrderID(int purchaseOrderID) 
	{
		this.purchaseOrderID = purchaseOrderID;
	}
	
	public int getSupplierID()
	{
		return supplierID;
	}
	
	public void setSupplierID(int supplierID)
	{
		this.supplierID = supplierID;
	}
	
	public int getStaffID() 
	{
		return staffID;
	}
	
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) 
	{
		this.products = products;
	}
	
	public double getOrderTotal() 
	{
		return orderTotal;
	}
	
	public void setOrderTotale(double totalPrice)
	{
		this.orderTotal = totalPrice;
	}
	
	public String getSupplierName() 
	{
		return supplierName;
	}
	
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	
}
