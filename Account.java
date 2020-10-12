package com.hcl.day28.ex;

import java.text.DecimalFormat;
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
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		//void forEach(bank -> bankLite) {
		for (MiniBank bank : miniBank) {
			if (bank.getAccountNumber() == accountNumber) {
				if (bank.getBalance() > withdrawAmt) {
					bank.setBalance(bank.getBalance() - withdrawAmt);
					System.out.println("Balance Remaining in the Account : " + formatter.format(bank.getBalance()) + " "
							+ " " + Thread.currentThread().getName());
				} else {
					System.out.println("Insufficient Balance");
				}
			}
			break;
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
		//void forEach(bank -> bankLite) {
		for (MiniBank bank : bankLite) {
			if (bank.getAccountNumber() == accountNumber) {
				bank.setBalance(bank.getBalance() + depositAmt);
				System.out.println("Balance Remaining in the Account : " + formatter.format(bank.getBalance()) + " "
						+ " " + Thread.currentThread().getName());
			} else {
				System.out.println("Account doesn't exists");
			}
			break;
		}

	}

	/*
	 * This method is used to transfer the amount from one account to another which
	 * gets collected from main method by synchrnizing it and then it calculates the
	 * total balance.
	 * 
	 * @param fromAccount
	 * @param amount
	 * @param toaccount
	 * @param bankList.
	 * 
	 * @return void.
	 */
	public synchronized void fundTransfer(int fromAccount, double amount, int toAccount, ArrayList<MiniBank> bankLite) {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		//void forEach(bank -> bankLite) {
		for (MiniBank bank : bankLite) {
			if (bank.getAccountNumber() == fromAccount) {
				bank.setBalance(bank.getBalance() - amount);
				System.out.println("Balance Remaining in from Account : " + formatter.format(bank.getBalance()) + " "
						+ " " + Thread.currentThread().getName());
			}
			if (bank.getAccountNumber() == toAccount) {
				bank.setBalance(bank.getBalance() + amount);
				System.out.println("Balance Remaining in the Account : " + formatter.format(bank.getBalance()) + " "
						+ " " + Thread.currentThread().getName());
			} else {
				System.out.println("Account doesn't exists");
			}
			break;
		}

	}
}
