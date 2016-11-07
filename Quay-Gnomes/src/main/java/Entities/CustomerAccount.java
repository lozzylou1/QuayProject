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
	
		@Column (name = "billingPostCode", nullable = false)
		private String billingPostCode;
	
		@Column (name = "billingAddress1", nullable = false)
		private String billingAddress1; 
	
		@Column (name = "firstName", nullable = false)
		private String firstName;
	
		@Column (name = "surname", nullable = false)
		private String surname;
		
		@Column (name = "userName", nullable = false)
		private String userName;
		
		@Column (name = "deliveryAddress1", nullable = false)
		private String deliveryAddress1;
		
		@Column (name = "postCode", nullable = false)
		private String postCode;

		/**
		 * CustomerAccount constructor
		 * 
		 * @param ca_customerID
		 * @param ca_email
		 * @param ca_password
		 * @param ca_contactNumber
		 * @param ca_firstName
		 * @param ca_surname
		 * @param ca_userName
		 * @param ca_deliveryAddress1
		 * @param ca_postCode
		 * @param ca_billingAddress1
		 * @param ca_billingPostCode
		 */
		public CustomerAccount(String ca_email, String ca_password, String ca_firstName, String ca_surname, String ca_userName, String ca_deliveryAddress1, String ca_postCode, String ca_billingAddress1, String ca_billingPostCode){
			
			this.email = ca_email;
			this.password = ca_password;
			this.firstName = ca_firstName;
			this.surname = ca_surname;		
			this.userName = ca_userName;
			this.deliveryAddress1 = ca_deliveryAddress1;
			this.postCode = ca_postCode;
			this.billingAddress1 = ca_billingAddress1;
			this.billingPostCode = ca_billingPostCode;
						
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
		
//		/**
//		 * Returns the customerAccount delivery address
//		 * 
//		 * @return deliveryAddress
//		 */
//		public String getDeliveryAddress1() {
//			return deliveryAddress1;
//		}
//		
//		/**
//		 * Sets the delivery address
//		 * 
//		 * @param deliveryAddress
//		 */
//		public void setDeliveryAddress1(String deliveryAddress1) {
//			this.deliveryAddress1 = deliveryAddress1;
//		}
//
		/**
		 * Returns the billing address
		 * 
		 * @return billingAddress returns billing address
		 */
		public String getBillingAddress1() {
			return billingAddress1;
		}
		
		/**
		 * Sets the billing address
		 * 
		 * @param billingAddress
		 */
		public void setBillingAddress1(String billingAddress1) {
			this.billingAddress1 = billingAddress1;
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

		/**
		 * Gets the account UserName
		 * @return userName
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * Sets the account UserName
		 * @param userName
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDeliveryAddress1() {
			return deliveryAddress1;
		}

		public void setDeliveryAddress1(String deliveryAddress1) {
			this.deliveryAddress1 = deliveryAddress1;
		}

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public String getBillingPostCode() {
			return billingPostCode;
		}

		public void setBillingPostCode(String billingPostCode) {
			this.billingPostCode = billingPostCode;
		}
		
		
		
	
		
}
