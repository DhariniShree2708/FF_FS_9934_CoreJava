package com.hcl.day28.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Day # : 28
 * 
 * Topic : Core Java.
 * 
 * This class declare's the ArrayList which is used for storing the array of
 * elements irrespective of size. By using this class we can store the banking
 * data's of an individual.
 * 
 * 
 * @author Dharini.
 * 
 * 
 * 
 */

public class MiniBankMain {

	ArrayList<MiniBank> bankList = new ArrayList<MiniBank>();

	/**
	 * The main method consists of banking operations like viewing of
	 * balance,withdrawal of amount,deposit of amount and transfer of amount from
	 * one account to another.These tasks are performed based on the user's
	 * input.This uses the threading concept in which the operations occur
	 * simultaneously.
	 * 
	 * 
	 * @param args - command Line Argument.
	 * @return void.
	 * 
	 */

	public static void main(String[] args) {

		MiniBankMain bank = new MiniBankMain();
		Scanner sc = new Scanner(System.in);

		// Deserialize of data.The data's are read from the file.

		try {
			FileInputStream fos = new FileInputStream("D:\\hclbank.txt");
			ObjectInputStream oos = new ObjectInputStream(fos);
			bank.bankList = (ArrayList) oos.readObject();
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Error in reading the file." + e.getMessage());
		}

		System.out.println("Welcome to Mini Bank Portal!");
		String str = "quit";
		do {
			System.out.println("Enter command(add/balance/Withdraw/Deposit/Fund Transfer/quit) : ");
			str = sc.next();
			switch (str.toLowerCase()) {
			case "add":
				bank.add(sc);
				break;
			case "balance":
				bank.balance(sc);
				break;
			case "withdraw":
				bank.withdraw(sc);
				break;
			case "deposit":
				bank.deposit(sc);
				break;
			case "fundtransfer":
				bank.fundTransfer(sc);
				break;
			case "quit":
				System.out.println("Good Bye!");
				break;
			default:
				System.out.println("Sorry,but \"" + str + "\" is not a valid command. Please try again.");
				break;
			}
		} while (!str.equals("quit"));

		sc.close();

		// Serialize of data.The data's are written into the file.
		try {
			FileOutputStream fos = new FileOutputStream("D:\\hclbank.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bank.bankList);
			oos.close();
			fos.close();
			System.out.println("Accounts details are successfully inserted in file.");
		} catch (Exception e) {
			System.out.println("Error in writing the details into a file. " + e.getMessage());
		}
	}

	/**
	 * This method is used for deposition of amount which is obtained from user
	 * which is added into the account.
	 * 
	 * 
	 * @param scanner.
	 * @return void.
	 * 
	 */

	public void deposit(Scanner sc) {
		System.out.println("Account Number:");
		int accountNumber = sc.nextInt();
		for (MiniBank bank : bankList) {
			if (bank.getAccountNumber() == accountNumber) {
				System.out.println("Deposit Amount:");
				double depositAmt = sc.nextDouble();
				Account obj = new Account();
				DepositThread dThread = new DepositThread(obj, depositAmt, accountNumber, bankList);
				Thread thread = new Thread(dThread, "Atm");
				thread.start();
				System.out.println("Your Deposit is Successfull");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Exception occured :" + e.getMessage());
				}
			} else {
				System.out.println("Not Successfull");
			}
		}

	}

	/**
	 * This method is used for withdrawal of amount which is obtained from user
	 * which is taken from the account.
	 * 
	 * 
	 * @param scanner.
	 * @return void.
	 * 
	 */

	public void withdraw(Scanner sc) {
		System.out.println("Account Number:");
		int accountNumber = sc.nextInt();
		for (MiniBank bank : bankList) {
			if (bank.getAccountNumber() == accountNumber) {
				System.out.println("Withdrawal Amount:");
				double withdrawAmt = sc.nextDouble();
				Account obj = new Account();
				WithdrawThread wThread = new WithdrawThread(obj, withdrawAmt, accountNumber, bankList);
				Thread thread = new Thread(wThread, "Atm");
				thread.start();
				System.out.println("Your Withdrawal is Successfull");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Exception occured :" + e.getMessage());
				}
			} else {
				System.out.println("Not Successfull");
			}
		}
	}

	/**
	 * This method is used for collecting the bank details like account
	 * number,balance and the account holder name from the user and stores it in
	 * arraylist.
	 * 
	 * 
	 * @param scanner.
	 * @return void.
	 * 
	 */
	public void add(Scanner sc) {

		System.out.println("Account Number : ");
		int accountNumber = sc.nextInt();
		System.out.println("Name : ");
		String name = sc.next();
		double balance = 0.0;
		try {
			System.out.println("Balance ($) : ");
			balance = sc.nextDouble();
			if (balance <= 0)
				System.out.println("Enter a valid balance amount");
		} catch (NumberFormatException e) {
			System.out.println("Invalid Balance Amount");
		}

		bankList.add(new MiniBank(accountNumber, name, balance));

	}

	/**
	 * This method is used for finding the balance amount in the account of the
	 * account holder.
	 * 
	 * @param scanner
	 * 
	 * @return double
	 * 
	 */

	public double balance(Scanner sc) {
		try {
			DecimalFormat formatter = new DecimalFormat("#,###.00");
			System.out.println("Account Number : ");
			int accountNumber = sc.nextInt();
			for (MiniBank bank : bankList) {
				if (bank.getAccountNumber() == accountNumber) {
					System.out.println("Account Number:" + bank.getAccountNumber() + "\nName:" + bank.getName()
							+ "\nBalance Amount:" + formatter.format(bank.getBalance()));
				}

			}
		} catch (Exception e) {
			System.out.println("Please enter a valid account number" + e.getMessage());
		}
		return 0;
	}

	/**
	 * This method is used for Transferring of amount from one account to another
	 * account. This is done based on the balance amount in sender's account.
	 * 
	 * 
	 * @param scanner.
	 * @return void.
	 * 
	 */

	public void fundTransfer(Scanner sc) {
		System.out.println("From Account:");
		int fromAccount = sc.nextInt();
		for (MiniBank bank : bankList) {
			if (bank.getAccountNumber() == fromAccount && bank.getBalance() > 0) {
				System.out.println("To Account:");
				int toAccount = sc.nextInt();
				for (MiniBank mBank : bankList) {
					if (mBank.getAccountNumber() == toAccount && mBank.getBalance() > 0) {
						System.out.println("Amount to be transferred:");
						int amount = sc.nextInt();
						Account acc = new Account();
						TransferThread tThread = new TransferThread(acc, fromAccount, amount, toAccount, bankList);
						Thread thread1 = new Thread(tThread, "Atm");
						thread1.start();
						System.out.println("Your Fund Transaction is Successfull");
					}
				}

			}
		}

	}
}
