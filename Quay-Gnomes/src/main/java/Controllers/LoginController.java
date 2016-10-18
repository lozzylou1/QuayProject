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
	@Inject
	private LoginManager loginManager;
	private CustomerAccount customerAccount;
	private String email;
	private String password;
	private boolean isLoggedIn = false;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login(String email)
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + email);
		
		customerAccount = loginManager.findbyEmail(email);
		if (customerAccount != null)
		{
			isLoggedIn = true;
		}
	}

	public String getEmail() {
		return email;
	}

	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

}
