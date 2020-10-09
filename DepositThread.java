package com.hcl.day28.ex;

/**
 * This class implements the thread concepts by including an interface. this
 * consists of a method which starts execting after the start of thread
 * operations.This is used for crediting of cash.
 *
 * @author Dharini.
 * 
 * 
 */

public class DepositThread implements Runnable {
	private Account obj;
	private double amount;

	/*
	 * This is a parameterized constructor which is created for the class. This
	 * consists of fields like object which is created for the synchronized class
	 * and the money to to given.
	 * 
	 * @param amt,amount.
	 */

	public DepositThread(Account amt, double amount) {
		super();
		this.obj = amt;
		this.amount = amount;
	}

	/*
	 * This is the overrriden method from the thread class which is used for
	 * execution of small process in a single process.
	 *
	 * @return void.
	 */

	@Override
	public void run() {
		obj.deposit(this.amount);
	}

}
