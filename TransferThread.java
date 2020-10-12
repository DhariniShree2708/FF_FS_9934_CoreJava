package com.hcl.day28.ex;

import java.util.ArrayList;

/**
 * This class implements the thread concepts by including an interface. this
 * consists of a method which starts execting after the start of thread
 * operations.This is used for transferring of cash from one account to another
 * account.
 *
 * @author Dharini.
 * 
 * 
 */

public class TransferThread implements Runnable {
	private Account obj;
	private int fromAccount;
	private double amount;
	private int toAccount;

	/*
	 * This is a parameterized constructor which is created for the class. This
	 * consists of fields like object which is created for the synchronized class
	 * and the account number of sender and receiver and the arraylist.
	 * 
	 * @param amt,amount.
	 */
	ArrayList<MiniBank> miniBank;

	public TransferThread(Account obj, int fromAccount, double amount, int toAccount, ArrayList<MiniBank> bankList) {
		super();
		this.obj = obj;
		this.fromAccount = fromAccount;
		this.amount = amount;
		this.toAccount = toAccount;
		miniBank = bankList;
	}

	/*
	 * This is the overrriden method from the thread class which is used for
	 * execution of small process in a single process.
	 *
	 * @return void.
	 */

	@Override
	public void run() {
		obj.fundTransfer(fromAccount, amount, toAccount, miniBank);
	}

}
