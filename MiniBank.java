package com.hcl.day28.bankportal;

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

public class MiniBank implements Serializable , Bank {
	private static final long serialVersionUID = 1L;
	private int accountNumber;
	private String name;
	private double balance;
	private boolean inActive;

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
	public MiniBank(int accountNumber, String name, double balance,boolean inActive) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.setInActive(inActive);

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

	/**
	 * @return the inActive
	 */
	public boolean isInActive() {
		return inActive;
	}

	/**
	 * @param inActive the inActive to set
	 */
	public void setInActive(boolean inActive) {
		this.inActive = inActive;
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}
}