package com.hcl.day28.bankportal;

import java.util.ArrayList;

/**
 * This class implements the thread concepts by including an interface. this
 * consists of a method which starts execting after the start of thread
 * operations.This is used for depositing some amount in our account.
 *
 * @author Dharini.
 * 
 * 
 */

public class DepositThread implements Runnable {
	private Account obj;
	private double depositAmt;
	private int accountNumber;

	/*
	 * This is a parameterized constructor which is created for the class. This
	 * consists of fields like object which is created for the synchronized class
	 * and the money to be give for deposition and arraylist.
	 * 
	 * @param obj
	 * @param depositAmt
	 * @param accountNumber
	 * @param bankList.
	 */
	ArrayList<MiniBank> bankLite;

	public DepositThread(Account obj, int accountNumber,double depositAmt, ArrayList<MiniBank> bankList) {
		super();
		this.obj = obj;
		this.depositAmt = depositAmt;
		this.accountNumber = accountNumber;
		bankLite = bankList;
	}

	/*
	 * This is the overrriden method from the thread class which is used for
	 * execution of small process in a single process.
	 *
	 * @return void.
	 */

	@Override
	public void run() {
		obj.deposit(accountNumber, depositAmt, bankLite);
	}

}
