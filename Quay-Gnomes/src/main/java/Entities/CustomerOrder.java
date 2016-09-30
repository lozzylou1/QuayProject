import javax.persistence.*;

@Entity
@Table (name = "customerOrder")

public class CustomerOrder {
	
	@Id
	@Column (name = "customerOrderId", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int customerOrderId;
	
	@Column (name = "productID", nullable = false)
	private String productID;
	
	@Column (name = "customerId", nullable = false)
	private int customerId;
	
	@Column (name = "status", nullable = false)
	private String status;
	
	@Column (name = "dateOfArrival", nullable = false)
	private String dateOfArrival;
	
	@Column (name = "deliveryAddress", nullable = false)
	private String deliveryAddress;
	
	@Column (name = "quantity", nullable = false)
	private int quantity;
	
	@Column (name = "isPorous", nullable = false)
	private boolean isPorous;
	
	
//	public CustomerOrder 
	

	
	

}
