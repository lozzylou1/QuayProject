package com.quayproject.ims.entities;

import javax.persistence.Entity;

@Entity
public class Alert {

	private Product product;
	private enum AlertType {OUT_OF_STOCK, LOW_STOCK}
	private AlertType alert;
	private String message;
	private String color;
	
	public Alert(Product product){

		this.product = product;
		setMessage();
	}
	
	private void setAlertType()
	{		
		if (product.getStockLevel() <= 0)
		{
			alert = AlertType.OUT_OF_STOCK;
		}
		else if (product.getStockLevel() <= product.getThreshold()
				&& product.getStockLevel() != 0)
		{
			alert = AlertType.LOW_STOCK;
		}
	}

	public void setMessage()
	{
		setAlertType();
		switch (alert)
		{
			case OUT_OF_STOCK:
				message = (product.getProductName() + " is out of stock!!").toUpperCase();
				color = "red";
				break;
			case LOW_STOCK:
				message = product.getProductName() + " is low on stock";
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

	public void setColour(String color) {
		this.color = color;
	}
	
	
}
