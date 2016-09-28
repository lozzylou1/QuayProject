import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table (name = "StaffAccount")
public class StaffAccount {

	@Column (name = "username", nullable = false)
	@Null
	private String username;
	
	@Column (name = "password", nullable = false)
	@NotNull
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
