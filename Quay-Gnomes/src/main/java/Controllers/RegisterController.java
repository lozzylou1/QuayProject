package Controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("register")
@RequestScoped

	public class RegisterController {
	
	
	/**
	 * Checks to see the first name is not null.
	 * If null, return "createAccount" to redirect
	 * the user to the createAccount page
	 * 
	 * @param firstName
	 * @return createAccount
	 */
	public String checkFirstName(String firstName) {

		if (firstName == null) {
			return "createAccount";
		}
		return "";

	}
	
	/**
	 * Checks the surname is not null. 
	 * If null, return "createAccount" to redirect
	 * the user to the createAccount page
	 * 
	 * @param surname
	 * @return createAccount
	 */
	public String checkSurname(String surname) {
		if (surname == null) {
			return "createAccount";
		}
		return "";
	}
	
	/**
	 * Checks to see the email is not null
	 * If null, return "createAccount" to redirect
	 * the user to the home page
	 * 
	 * @param email
	 * @return createAccount
	 */
	public String checkEmailAddress(String email) {
		if (email == null) {
			return "createAccount";
		}
		return"";
	}
	
	/**
	 * Checks to see the confirmEmail is not null
	 * If null, return "createAccount" to redirect
	 * the user to the home page
	 * 
	 * @param confirmEmail
	 * @return createAccount
	 */
	public String checkConfirmEmailAddress(String confirmEmail) {
		if (confirmEmail == null) {
			return "createAccount";
		}
		return "";
	}
	
	/**
	 * Checks to see the password is not null
	 * If null, return "createAccount" to redirect
	 * the user to the home page
	 * 
	 * @param password
	 * @return createAccount
	 */
	public String checkPassword(String password) {
		if (password == null) {
			return "createAccount";
		}
		return "";
	}
	
	/**
	 * Checks to see the password is not null
	 * If null, return "createAccount" to redirect
	 * the user to the home page
	 * 
	 * @param confirmPassword
	 * @return createAccount
	 */
	public String checkConfirmPassword(String confirmPassword) {
		if (confirmPassword == null) {
			return "createAccount";
		}
		return "";
	}
	
	

}
