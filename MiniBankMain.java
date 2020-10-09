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
 * elements irrespective of size. By using this this class is used to store the
 * banking data's of an individual.
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
		bank.deSerialize();
		// Account acc = new Account();
		System.out.println("Welcome to HCL Bank Portal!");
		try {

			String str = "";
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
					System.out.println("Account Number:");
					int accountNumber = sc.nextInt();
					System.out.println("Withdrawal Amount:");
					double withdrawAmt = sc.nextDouble();
					double balanceAmt = bank.balance(sc);
					Account acc = new Account(balanceAmt);

					// double amount = 0;
					WithdrawThread wThread = new WithdrawThread(acc, withdrawAmt);
					Thread thread = new Thread(wThread, "atm");
					thread.start();
					System.out.println("Your Withdrawal is Successfull");
					bank.balance(sc);
					break;
				// bank.withdraw(sc);
				case "deposit":
					System.out.println("Account Number:");
					int accountNo = sc.nextInt();
					double balAmt = bank.balance(sc);

					System.out.println("Deposit Amount:");
					double depoAmt = sc.nextDouble();
					Account acc1 = new Account(balAmt);
					// double amount1 = 0;
					DepositThread dThread = new DepositThread(acc1, depoAmt);
					Thread thread1 = new Thread(dThread, "atm");
					thread1.start();
					System.out.println("Your Deposit is Successfull");
					bank.balance(sc);
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
			} while (!str.equals(""));

			sc.close();
			bank.serialize();
		} catch (Exception e) {
			System.out.println("Exception Occured : " + e.getMessage());
		}

	}

	/**
	 * This method is used to deserialize the data given.It is used to read the file
	 * which is in particular location.
	 * 
	 * 
	 * @return void.
	 * 
	 */

	public void deSerialize() {
		{
			MiniBank hb = null;
			try {
				FileInputStream fos = new FileInputStream("hclbank.txt");
				@SuppressWarnings("resource")
				ObjectInputStream oos = new ObjectInputStream(fos);
				hb = (MiniBank) oos.readObject();
				while (hb != null) {
					bankList.add(hb);
					System.out.print(hb.getAccountNumber() + "\t");
					System.out.print(hb.getName() + "\t");
					System.out.println(hb.getBalance());
					hb = (MiniBank) oos.readObject();
				}
			} catch (Exception e) {
				System.out.println("Error in reading the file." + e.getMessage());
			}
		}
	}

	/**
	 * This method is used to serialize the data given.It is used to write the file
	 * with the data's that is fetch from user.
	 * 
	 * 
	 * @return void.
	 * 
	 */

	public void serialize() {
		{
			try {
				FileOutputStream fos = new FileOutputStream("hclbank.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				// for(HclBank hb : bankList) {
				oos.writeObject(bankList);
				oos.close();
				fos.close();
				System.out.println("Accounts details are successfully inserted in file.");
			} catch (Exception e) {
				System.out.println("Error in writing the details into a file. " + e.getMessage());
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
		for (MiniBank mbank : bankList) {

			bankList.add(new MiniBank(accountNumber, name, balance));
			// insert(new MiniBank(accountNumber, name, balance));
		}

	}

	/**
	 * This method is used for updating the collected bank details like account
	 * number,balance and the account holder name from the user and stores it in
	 * arraylist.
	 * 
	 * 
	 * @param scanner.
	 * @return void.
	 * 
	 */

	public void update(Scanner sc) {
		int accountNumber = 0;
		String name = null;
		double balance = 0;

		bankList.set(2, new MiniBank(accountNumber, name, balance));
		bankList.set(3, new MiniBank(accountNumber, name, balance));
	}

	/**
	 * This method is used for adding of information to the database.
	 * 
	 * @param object of HclBank
	 * @return void.
	 * 
	 */
	/*
	 * public void insert(MiniBank bankDetails) { try { //Statement stmt =
	 * con.createStatement();
	 * bankList.add(bankDetails.getAccountNumber(),bankDetails.getName(),bankDetails
	 * .getBalance()); System.out.println("Inserted Successfully!"); // print(stmt);
	 * } catch (Exception e) { System.out.println("Not Inserted Successfully"
	 * +e.getMessage());
	 * 
	 * } }
	 */

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
			//// Statement stmt = con.createStatement();
			DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
			System.out.println("Account Number : ");
			int accountNumber = sc.nextInt();
			// ResultSet rs = stmt.executeQuery("Select * from HCLBank where accountNumber =
			// " + accountNumber);
			for (MiniBank bank : bankList) {
				if (bank.getAccountNumber() == accountNumber) {
					// while (rs.next()) {
					System.out.println(bank.getAccountNumber() + "\t" + bank.getName() + "\t"
							+ formatter.format(bank.getBalance()));
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
		int accountNo = sc.nextInt();
		System.out.println("To Account:");
		int accountNumber = sc.nextInt();
		System.out.println("Amount to be transferred:");
		int amount = sc.nextInt();
		double balance = balance(sc);
		try {
			if (amount >= balance) {
				System.out.println("Amount is transferred");
				balance = balance - amount;
				System.out.println("Balance Remaining is:" + balance);
			} else {
				System.out.println("Insufficient balance!!!");
			}
		} catch (Exception e) {
			System.out.println("Enter a valid amount");
		}
	}

}
