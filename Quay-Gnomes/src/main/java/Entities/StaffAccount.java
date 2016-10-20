package Entities;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table (name = "StaffAccount")
@NamedQueries ({
	@NamedQuery(name = StaffAccount.FIND_STAFF_ACCOUNT,
			query = "SELECT username, password "
					+ "FROM StaffAccount "
					+ "WHERE username = :username")
})
public class StaffAccount {

	/**Named Query to find the Staff Account */
	public static final String FIND_STAFF_ACCOUNT = "StaffAccount.findStaffAccount";

	@Column (name = "username", nullable = false)
	@Null
	private String userName;

	@Column (name = "password", nullable = false)
	@NotNull
	private String password;

	/**
	 * StaffAccount constructor
	 * 
	 * @param userName
	 * @param Password
	 */
	public StaffAccount(String userName, String Password) {
		this.userName = userName;
		this.password = Password;
	}

	/**
	 * Return staffAccount userName
	 * 
	 * @return userName
	 */
	public String getUsername() 
	{
		return userName;
	}

	/**
	 * Set the user name
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	/**
	 * Set the password on the staff account
	 * 
	 * @return password
	 */
	public String getPassword() 
	{
		return password;
	}

	/**
	 * Set the password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
