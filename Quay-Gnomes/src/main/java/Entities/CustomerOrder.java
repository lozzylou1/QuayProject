package Entities;

import javax.persistence.*;

@Entity
@Table (name = "customerOrder")

public class CustomerOrder {
	
	@Id
	@Column (name = "customerOrderId", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int customerOrderId;
	
	@Column (name = "productID", nullable = false)
	private String productID;
	
	@Column (name = "customerId", nullable = false)
	private int customerId;
	
	@Column (name = "status", nullable = false)
	private String status;
	
	/**
	 * Gets the customer order id
	 * 
	 * @return customerOrderId
	 */
	public int getCustomerOrderId() {
		return customerOrderId;
	}
	
	/**
	 * Set the customerOrderId
	 * 
	 * @param customerOrderId
	 */
	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	
	/**
	 * Get the product ID
	 * 
	 * @return productID
	 */
	public String getProductID() {
		return productID;
	}
	
	/**
	 * Sets the product ID
	 * 
	 * @param productID
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	/**
	 * Gets the customer ID
	 * 
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * Sets the customerId
	 * 
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	/**
	 * Gets the status of the customerOrder
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Set the status
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets date of arrival 
	 * 
	 * @return date of arrival
	 */
	public String getDateOfArrival() {
		return dateOfArrival;
	}
	
	/**
	 * Sets the date of arrival
	 * 
	 * @param dateOfArrival
	 */
	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	
	/**
	 * Gets the delivery address
	 * 
	 * @return deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	/**
	 * Sets the delivery address 
	 * 
	 * @param deliveryAddress
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	/**
	 * gets the quantity
	 * 
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Sets the quantity
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
	/**
	 * Checks to see if the item has
	 * porous applies
	 * 
	 * @return isPorous
	 */
	public boolean isPorous() {
		return isPorous;
	}
	
	/**
	 * 
	 * @param isPorous
	 */
	public void setPorous(boolean isPorous) {
		this.isPorous = isPorous;
	}

	@Column (name = "dateOfArrival", nullable = false)
	private String dateOfArrival;
	
	@Column (name = "deliveryAddress", nullable = false)
	private String deliveryAddress;
	
	@Column (name = "quantity", nullable = false)
	private int quantity;
	
	@Column (name = "isPorous", nullable = false)
	private boolean isPorous;
	
	
//	public CustomerOrder 
	

	
	

}
