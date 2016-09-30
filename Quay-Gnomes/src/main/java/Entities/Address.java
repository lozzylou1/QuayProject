package Entities;

public class Address {
	
	private String firstLine;
	private String secondLine;
	private String county;
	private String postCode;
	private int customerID;
	
	
	public Address(int a_customerID, String a_postCode, String a_county, String a_secondLine, String a_firstLine){
		
		this.firstLine = a_firstLine;
		this.secondLine = a_secondLine;
		this.county = a_county;
		this.postCode = a_postCode;
		this.customerID = a_customerID;
		
	}

	/**
	 * Getter for the first line of the address
	 * Returns the first line of the address
	 * */
	public String getFirstLine() {
		return firstLine;
	}

	/**
	 * Setter for the first line of the address
	 * */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	/**
	 * Getter for the second line of the address
	 * Returns the second line of the address
	 * */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * Setter for the second line of the address
	 * */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	/**
	 * Getter for the county of the address
	 * Returns the county
	 * */
	public String getCounty() {
		return county;
	}

	/**
	 * Setter for the county of the address
	 * */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * Getter for the postal code of the address
	 * Returns the postcode
	 * */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * Setter for the postal code of the address
	 * */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Getter for the customerID linked to the address
	 * Returns the CustomerID
	 * */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * Setter for the customerID linked to the address
	 * */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
}
