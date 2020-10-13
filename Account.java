package com.hcl.day28.bankportal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

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
	private int accountNumber;

	/*
	 * This method is used to get the amount to be
	 * withdrawed which gets collected from main method by
	 * synchrnizing it and then it calculates the total
	 * balance.
	 * 
	 * @param withdrawAmt
	 * @param accountNumber
	 * @param bankList.
	 * 
	 * @return void.
	 */

	public synchronized void withdraw(int accountNumber, double withdrawAmt, ArrayList<MiniBank> miniBank) {
		try {
		miniBank.stream().forEach((bank) -> {
			if (bank.getAccountNumber() == accountNumber) {
				if (bank.getBalance() > withdrawAmt) {
					bank.setBalance(bank.getBalance() - withdrawAmt);
					System.out.println("Balance Remaining in the Account(After Withdraw): "
					+ NumberFormat.getInstance().format(bank.getBalance()) + " "
							+ " " + Thread.currentThread().getName());
				}
			}
		});
		}catch(Exception e) {
					System.out.println("Insufficient Balance");
				}
			}


	/*
	 * This method is used to get the amount to be deposited which gets collected
	 * from main method by synchrnizing it and then it calculates the total balance.
	 * 
	 * @param depositAmt
	 * @param accountNumber
	 * @param bankList.
	 * 
	 * @return void.
	 */

	public synchronized void deposit(int accountNumber, double depositAmt, ArrayList<MiniBank> bankLite) {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		try {
	     bankLite.stream().forEach((bank) -> {
			if (bank.getAccountNumber() == accountNumber) {
				bank.setBalance(bank.getBalance() + depositAmt);
				System.out.println("Balance Remaining in the Account(After Deposit) : " 
				+ formatter.format(bank.getBalance()) + " "
						+ " " + Thread.currentThread().getName());
			} 
	     });
		}catch(Exception e) {
				System.out.println("Account doesn't exists");
		}
	    

	}
}

