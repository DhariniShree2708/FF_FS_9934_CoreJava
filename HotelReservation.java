package com.hcl.day35;

import java.util.Date;

/**
 * 
 */

public class HotelReservation {
	private String fromDate;
	private String toDate;
	private String name;
	private String status;
	private String price;

	/**
	 * @param fromDate
	 * @param toDate
	 * @param name
	 * @param status
	 * @param price
	 */
	public HotelReservation(String fromDate, String toDate, String name, String status, String price) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.name = name;
		this.status = status;
		this.price = price;
	}

	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * @param string the fromDate to set
	 */
	public void setFromDate(String string) {
		this.fromDate = string;
	}

	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}

	/**
	 * @param string the toDate to set
	 */
	public void setToDate(String string) {
		this.toDate = string;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param string the price to set
	 */
	public void setPrice(String string) {
		this.price = string;
	}

}
