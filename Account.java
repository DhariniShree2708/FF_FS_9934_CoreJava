package com.hcl.day28.ex;

/**
 * This class is used for defining the synchronized methods which can be used
 * for finding the money to be withdrawn from the bankaccount and also the money
 * which is deposited into the bank account and the total balance amount is then
 * calculated.
 * 
 * @author Dharini
 *
 */

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	/*
	 * This method is used to get the amount to be withdrawed which gets collected
	 * from main method by synchrnizing it and then it calculates the total balance.
	 * 
	 * @param amount.
	 * 
	 * @return void.
	 */

	public synchronized void withdraw(double amount) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("Exception occured :" + e.getMessage());
		}
		balance = balance - amount;
		System.out.println(
				"Balance Remaining in the Account : " + balance + " " + " " + Thread.currentThread().getName());
	}

	/*
	 * This method is used to get the amount to be deposited which gets collected
	 * from main method by synchrnizing it and then it calculates the total balance.
	 * 
	 * @param amount.
	 * 
	 * @return void.
	 */

	public synchronized void deposit(double amount) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("Exception occured :" + e.getMessage());
		}
		balance = balance + amount;
		System.out.println(
				"Balance Remaining in the Account : " + balance + " " + " " + Thread.currentThread().getName());
	}

}
