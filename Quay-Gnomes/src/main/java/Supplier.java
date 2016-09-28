import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table (name = "Supplier")
public class Supplier {
		
		@Column (name = "supplierName", nullable = false)
		@NotNull
		private String supplierName;
		
		@Column (name = "contactNumber", nullable = false)
		@NotNull
		private String contactNumber;
		
		@Id
		@Column (name = "supplierID", nullable = false)
		@NotNull
		private int supplierID;
		
		public String getSupplierName() {
			return supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public int getSupplierID() {
			return supplierID;
		}
		public void setSupplierID(int supplierID) {
			this.supplierID = supplierID;
		}
}
