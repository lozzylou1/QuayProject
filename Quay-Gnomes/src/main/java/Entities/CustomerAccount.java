package Entities;

import javax.persistence.*;
import javax.validation.constraints.*;

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
		
//........constructor.........................................................
		public CustomerAccount(int ca_customerID, String ca_email, String ca_password, String ca_contactNumber, String ca_deliveryAddress, String ca_billingAddress, String ca_firstName, String ca_surname){
			
			this.customerID = ca_customerID;
			this.email = ca_email;
			this.password = ca_password;
			this.contactNumber = ca_contactNumber;
			this.deliveryAddress = ca_deliveryAddress;
			this.billingAddress = ca_billingAddress;
			this.firstName = ca_firstName;
			this.surname = ca_surname;			
						
		}	
// constructor end...................................................................................................		
		
//Getters and setters ............................................................................................
		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getDeliveryAddress() {
			return deliveryAddress;
		}

		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}

		public String getBillingAddress() {
			return billingAddress;
		}

		public void setBillingAddress(String billingAddress) {
			this.billingAddress = billingAddress;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}
	
// end of getters and setters.......................................
		
}
