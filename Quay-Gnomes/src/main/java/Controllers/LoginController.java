package Controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entities.CustomerAccount;
import Managers.LoginManager;

@Named("login")
@SessionScoped
public class LoginController implements Serializable{

	private String email;
	private String password;
	private boolean isLoggedIn = false;
	private String uname;
	
	@Inject
	private LoginManager loginManager;
	private CustomerAccount customerAccount;
	
	/**
	 * Gets the password
	 * 
	 * @return  String password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password 
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

/*	public void login(String email)
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + email);
		
		customerAccount = loginManager.findbyEmail(email);
		if (customerAccount != null)
		{
			isLoggedIn = true;
		}
	}*/
	
	
	
	/**
	 * Checks to see if an email is present
	 * TODO - Implement more functionality 
	 */
	public void login()
	{
		if(email.equals(null)){
			System.out.println(">>>>>>>>>>>>>>>>>>>>>> sorry");
		} else {
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + email);
		}
		
		
	
	}
	
	
	
	
	/**
	 * Gets the email
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Returns the customer account
	 * 
	 * @return customerAccount 
	 */
	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}
	
	/**
	 * Sets the customer account
	 * 
	 * @param customerAccount
	 */
	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	
	/**
	 * Sets the email
	 * 
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * returns a boolean value of loggedIn
	 * 
	 * @return bool isLoggedIn
	 */
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	
	/**
	 * Can set isLoggedIn to a boolean value
	 * 
	 * @param isLoggedIn
	 */
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

}
