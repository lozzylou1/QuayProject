package Entities;

import javax.persistence.*;

@Entity
@Table (name = "CustomerAccount")
public class CustomerAccount {
		@Id
		@Column (name = "customerID", nullable = false)
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int customerID;

		@Column (name = "email", nullable = false)	
		private String email;
	
		@Column (name = "password", nullable = false)
		private String password;
	
		@Column (name = "contactNumber", nullable = false)
		private String contactNumber;
	
		@Column (name = "deliveryAddress", nullable = false)
		private String deliveryAddress;
	
		@Column (name = "billingAddress", nullable = false)
		private String billingAddress;
	
		@Column (name = "firstName", nullable = false)
		private String firstName;
	
		@Column (name = "surname", nullable = false)
		private String surname;

		/**
		 * CustomerAccount constructor
		 * 
		 * @param ca_customerID
		 * @param ca_email
		 * @param ca_password
		 * @param ca_contactNumber
		 * @param ca_deliveryAddress
		 * @param ca_billingAddress
		 * @param ca_firstName
		 * @param ca_surname
		 */
		public CustomerAccount(String ca_email, String ca_password, String ca_firstName, String ca_surname){
			
			this.email = ca_email;
			this.password = ca_password;
			this.firstName = ca_firstName;
			this.surname = ca_surname;			
						
		}	
		
		/**
		 * 
		 * @return customerID the customer id
		 */
		public int getCustomerID() {
			return customerID;
		}
		
		/**
		 * Sets the customerID
		 * 
		 * @param customerID
		 */
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		
		/**
		 * Gets the customer Email
		 * 
		 * @return email return the users email
		 */
		public String getEmail() {
			return email;
		}
		
		/**
		 * Sets the email
		 * 
		 * @param email
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		
		/**
		 * Gets the password
		 * 
		 * @return password
		 */
		public String getPassword() {
			return password;
		}
		
		/**
		 * Sets the password on the customer account
		 * @param password
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		
		/**
		 * Returns the contact number
		 * 
		 * @return contactNumber
		 */
		public String getContactNumber() {
			return contactNumber;
		}
		
		/**
		 * Sets the contact number
		 * 
		 * @param contactNumber
		 */
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		
		/**
		 * Returns the customerAccount delivery address
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
		 * Returns the billing address
		 * 
		 * @return billingAddress returns billing address
		 */
		public String getBillingAddress() {
			return billingAddress;
		}
		
		/**
		 * Sets the billing address
		 * 
		 * @param billingAddress
		 */
		public void setBillingAddress(String billingAddress) {
			this.billingAddress = billingAddress;
		}
		
		/**
		 * Gets the first name
		 * 
		 * @return firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * Sets the first name
		 * 
		 * @param firstName
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		/**
		 * Gets the surname
		 * 
		 * @return surname
		 */
		public String getSurname() {
			return surname;
		}
		
		/**
		 * Sets the surname
		 * 
		 * @param surname
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}
	
		
}
