package Entities;

	import javax.persistence.*;

	/**
	 * @author Administrator
	 *
	 */
	@Entity
	@Table (name = "ItemInBasket")
	public class ItemInBasket {

		@Id
		@Column (name = "productID", nullable = false)
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int productID;
		
		@Column (name = "quantity", nullable = false)
		private int quantity;

		
		/**
		 * No Args constructor 
		 */
		public ItemInBasket(int productID, int quantity) 
		{
			this.productID = productID;
			this.quantity = quantity;
		}


		public int getProductID() {
			return productID;
		}


		public void setProductID(int productID) {
			this.productID = productID;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		


}

