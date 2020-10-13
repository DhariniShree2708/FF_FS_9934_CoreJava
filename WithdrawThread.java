package com.hcl.day28.bankportal;

import java.util.ArrayList;

/**
 * This class implements the thread concepts by including an interface. this
 * consists of a method which starts execting after the start of thread
 * operations.This is used for withdrawing of cash from the account.
 *
 * @author Dharini.
 * 
 * 
 */

public class WithdrawThread implements Runnable {
	private Account obj;
	private double withdrawAmt;
	private int accountNumber;

	/*
	 * This is a parameterized constructor which is created for the class. This
	 * consists of fields like object which is created for the synchronized class
	 * and the money to to given.
	 * 
	 * @param obj
	 * @param withdrawAmt
	 * @param accountNumber
	 * @param bankList.
	 */
	ArrayList<MiniBank> miniBank;
	public WithdrawThread(Account obj, int accountNumber, double withdrawAmt, ArrayList<MiniBank> bankList) {
		super();
		this.obj = obj;
		this.withdrawAmt= withdrawAmt;
		this.accountNumber = accountNumber ;
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
		obj.withdraw(accountNumber,withdrawAmt, miniBank);
	}

}