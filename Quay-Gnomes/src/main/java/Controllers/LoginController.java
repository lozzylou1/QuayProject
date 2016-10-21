package Controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Entities.CustomerAccount;
import services.LoginService;

@Named("login")
@SessionScoped
public class LoginController implements Serializable{

	private String email;
	private String password;
	private boolean isLoggedIn = false;
	private String userName;
	private CustomerAccount customerAccount;
	
	@Inject
	private LoginService loginService;
	
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

	
	/**
	 * Logs in the user with the specified email
	 */
	public void login()
	{	
		isLoggedIn = loginService.loginService(email, password);		
		password = "";
		System.out.println(">>>>>>>>>>>> " + isLoggedIn);
	}	
	
	
	/**
	 * Logs the currently logged in user out
	 */
	public void logOut()
	{
		isLoggedIn = false;
		password = "";
		System.out.println(">>>>>>>>>>>> " + isLoggedIn);
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
