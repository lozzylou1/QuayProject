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


	public StaffAccount(String userName, String Password) {
		this.userName = userName;
		this.password = Password;
	}

	/**Returns the User name for a StaffAccount*/
	public String getUsername() 
	{
		return userName;
	}

	/**Sets the User name for the StaffAccount*/
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	/**Returns the Password for a StaffAccount*/
	public String getPassword() 
	{
		return password;
	}

	/**Sets the Password for the StaffAccount*/
	public void setPassword(String password) {
		this.password = password;
	}


}
