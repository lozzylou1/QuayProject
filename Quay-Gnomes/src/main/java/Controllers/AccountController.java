package Controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entities.CustomerAccount;
import services.AccountService;


@SuppressWarnings("serial")
@Named("register")
@SessionScoped
public class AccountController implements Serializable {
	
	@Inject
	private AccountService accountService;
	private CustomerAccount customerAccount;
	
	private String initialEmail;	

	private String confirmationEmail;
	
	private String initialPassword;
	private String confirmationPassword;
	
	private String firstName;	

	private String surname;
	
	private String userName = "";
	
	private String deliveryAddress1;
	
	private String postCode;
	
	private String billingAddress1;
	
	private String billingPostCode;

	
	/**
	 * Creates the customer account 
	 * 
	 */
	public void createAccount()
	{
		if (accountService.validation(initialEmail, confirmationEmail) && 
				accountService.validation(initialPassword, confirmationPassword))
		{
			customerAccount = new CustomerAccount(	initialEmail, 
					initialPassword, 
					firstName, 
					surname,
					userName,
					deliveryAddress1,
					postCode,
					billingAddress1,
					billingPostCode);
			
			accountService.setCustomerAccount(customerAccount);
			accountService.addCustomerAccount();
			
		}				
	}
	
	public void addBillingAddress() {
	
	this.billingAddress1 = getDeliveryAddress1();
	this.billingPostCode = getPostCode();
	
	}
	
	/**
	 * Gets the initial email
	 * @return initial email
	 */
	public String getInitialEmail() {
		return initialEmail;
	}
		
	/**
	 * Sets the first email ready for comparison
	 * @param initialEmail
	 */
	public void setInitialEmail(String initialEmail) {
		this.initialEmail = initialEmail;
	}
	
	/**
	 * Gets the confirmation email for validation
	 * @return confirmation email
	 */
	public String getConfirmationEmail() {
		return confirmationEmail;
	}

	/**
	 * Sets the confirmation email to compare to the initial email
	 * @param confirmationEmail
	 */
	public void setConfirmationEmail(String confirmationEmail) {
		this.confirmationEmail = confirmationEmail;
	}
	
	/**
	 * Gets the initial password
	 * @return initial password
	 */
	public String getInitialPassword() {
		return initialPassword;
	}

	/**
	 * Sets the initial password ready for comparison
	 * @param initialPassword
	 */
	public void setInitialPassword(String initialPassword) {
		this.initialPassword = initialPassword;
	}
	
	/**
	 * Gets the confirmation password for validation
	 * @return confirmation password
	 */
	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	/**
	 * Sets the confirmation password to compare to the initial password
	 * @param confirmationPassword
	 */
	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}
	
	/**
	 * Gets the firstName
	 * @return First name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the surname
	 * @return
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the surname
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getBillingAddress1() {
		return billingAddress1;
	}

	public void setBillingAddress1(String billingAddress1) {
		this.billingAddress1 = billingAddress1;
		
	}

	public String getBillingPostCode() {
		return billingPostCode;
	}

	public void setBillingPostCode(String billingPostCode) {
		this.billingPostCode = billingPostCode;
	}
	
	
	
	
}
