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
					userName);
			
			accountService.setCustomerAccount(customerAccount);
			accountService.addCustomerAccount();
			
		}				
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
}
