package com.hcl.day31;

import java.util.Date;

/**
 * 
 * This class is used to store the datas and this consists of
 * constructors,getters and setters.
 * 
 * 
 * @author Dharini
 *
 */

public class HotelReservation {
	private Date fromDate;
	private Date toDate;
	private String name;
	private String status;
	private double price;

	/**
	 * 
	 * This is a parameterized constructor.
	 * 
	 * @param price
	 * @param status
	 * @param name
	 * @param toDate
	 * @param fromDate
	 */
	public HotelReservation(Date fromDate, Date toDate, String name, String status, double price) {
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
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate2 the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate2 the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
