package com.hcl.day28.ex;

import java.io.Serializable;

/**
 * 
 * 
 * This class declares the bank details like account holder name,their account
 * number and the balance in their account and this is obtained from user and
 * set it to the particular variable.
 * 
 * @author Dharini
 *
 */

public class MiniBank implements Serializable {
	private int accountNumber;
	private String name;
	private double balance;

	/**
	 * This is a parameterized constructor which is used to assign the variables
	 * with this. function.
	 * 
	 * @param accountNumber
	 * @param name
	 * @param balance
	 * @param withdrawAmt
	 * @param depositAmt
	 */
	public MiniBank(int accountNumber, String name, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	/**
	 * This method is used to return the name of the account holder in hcl bank.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set.
	 * @return void.
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method is used to return the account number of the account holder in hcl
	 * bank.
	 * 
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber - the accountNumber to set.
	 * 
	 * @return void.
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * This method is used to return the balance amount which is in the account of
	 * the account holder in hcl bank.
	 * 
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance - the balance to set.
	 * 
	 * @return void.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * This method is used to return the withdrawal amount which is in the account
	 * of the account holder in hcl bank.
	 * 
	 * @return the withdrawAmt
	 */
}