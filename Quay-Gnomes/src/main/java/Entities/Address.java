package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	//TODO PLZ ANNOTATE ME
	private String firstLine;
	private String secondLine;
	private String county;
	private String postCode;
	private int customerID;
	
	/**
	 * Constructor for address
	 * 
	 * @param a_customerID
	 * @param a_postCode
	 * @param a_county
	 * @param a_secondLine
	 * @param a_firstLine
	 */
	public Address(int a_customerID, String a_postCode, String a_county, String a_secondLine, String a_firstLine){
		
		this.firstLine = a_firstLine;
		this.secondLine = a_secondLine;
		this.county = a_county;
		this.postCode = a_postCode;
		this.customerID = a_customerID;
		
	}

	/**
	 * Getter for the first line of the address
	 * @return firstLine the first line of the address
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
	 * @return secondLine Second line of the address
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
	 * @return county
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
	 * @return postCode
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
	 * @return customerID
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
