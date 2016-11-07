package com.quayproject.ims.entities;

import javax.persistence.Entity;

@Entity
public class Update {


	private PurchaseOrder purchaseOrder;
	private enum UpdateType {ORDER_APPROVED, DELIVERED}
	private UpdateType update;
	private String message;
	private String color;
	
	
	public Update(PurchaseOrder purchaseOrder){
		
		this.purchaseOrder = purchaseOrder;
		setMessage();
	}

	private void setUpdateType()
	{
		if (purchaseOrder.getStatus() == "approved" && purchaseOrder.getStatus() !=" ")
		{
			update = UpdateType.ORDER_APPROVED;
		}
		else if (purchaseOrder.getStatus() == "delivered" && purchaseOrder.getStatus() !=" ")
		{
			update = UpdateType.DELIVERED;
		}
		
	}
	
	public void setMessage()
	{
		setUpdateType();
		switch(update)
		{
		case ORDER_APPROVED:
			message = (purchaseOrder.getSupplierName() + " purchase order has been approved");
			color = "green";
			break;
		case DELIVERED:
			message = (purchaseOrder.getSupplierName() + " purchase order has been delivered");
			color = "blue";
			break;
		}
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
