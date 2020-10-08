package com.hcl.day25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.hcl.day25.HclBank.Account;

import java.text.DecimalFormat;

/**
 * Day # : 25.
 * 
 * Topic : Core Java.
 * 
 * 
 * This class is used for inserting the data into the HCLBankingDetails database
 * in which the data is obtained from user by using the ArrayList collection
 * class.
 * 
 * 
 * 
 * @author Dharini
 *
 */
public class HclBankMain implements Serializable {
	private static final long serialVersionUID = 1L;
	static Connection con = null;
	static ArrayList<HclBank> bankList = new ArrayList<HclBank>();
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // For registering the driver for jdbc connectivity.
			// Establishing connection with the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HCLBankingDetails", "student", "student"); 
		} catch (Exception e) {
			System.out.println("Connection has not done properly");
		}
	}

	/**
	 * The main method is used for creating an object for the main class and by
	 * using this we can get the data's from user and insert the added values into
	 * database and displays it.
	 * 
	 * @param args
	 *            - command Line Argument.
	 * @return void.
	 * 
	 */

	public static void main(String[] args) {
		// deSerialize() ;
		try {
			/*
			 * Class.forName("com.mysql.jdbc.Driver"); // For registering the driver for
			 * jdbc connectivity. con =
			 * DriverManager.getConnection("jdbc:mysql://localhost:3306/HCLBankingDetails",
			 * "student", "student"); // Establishing connection with the database
			 */

			HclBankMain bank = new HclBankMain();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to HCL Bank Portal!");
			bank.deSerialize();
			String str = "";
			do {
				System.out.println("Enter command(add/balance/Withdraw/Deposit/quit) : ");
				String str1 = sc.next();
				switch (str1.toLowerCase()) {
				case "add":
					bank.add(sc);
					break;
				case "balance":
					HclBankMain.balance(sc);
					break;
				case "withdraw":
					System.out.println("Account Number:");
					int accountNumber = sc.nextInt();
					double balanceamt = balance(sc);
					Account accta = new Account(balanceamt);
					System.out.println("Withdrawal Amount:");
					double withdrawAmt = sc.nextDouble();
					// double amount = 0;
					WithdrawThread wThread = new WithdrawThread(accta, withdrawAmt);
					Thread thread = new Thread(wThread, "atm");
					thread.start();
					System.out.println("Your Withdrawal is Successfull");
					balance(sc);
					break;
				// bank.withdraw(sc);
				case "deposit":
					System.out.println("Account Number:");
					int accountNo = sc.nextInt();
					double balance1 = balance(sc);
					Account acctb = new Account(balance1);
					System.out.println("Deposited Amount:");
					double depoAmt = sc.nextDouble();
					// double amount1 = 0;
					WithdrawThread dThread = new WithdrawThread(acctb, depoAmt);
					Thread thread1 = new Thread(dThread, "atm");
					thread1.start();
					System.out.println("Your Deposit is Successfull");
					balance(sc);

					break;
				// bank.deposit(sc);
				case "quit":
					System.out.println("Good Bye!");
					break;
				default:
					System.out.println("Sorry,but \"" + str1 + "\" is not a valid command. Please try again.");
					break;
				}
			} while (!str.equals(""));
			bank.serialize();
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * This method is used to deserialize the data given.
	 * 
	 * 
	 * @return void.
	 * 
	 */

	public void deSerialize() {
		{
			HclBank hb = null;
			try {
				FileInputStream fos = new FileInputStream("hclbank.txt");
				@SuppressWarnings("resource")
				ObjectInputStream oos = new ObjectInputStream(fos);
				hb = (HclBank) oos.readObject();
				while (hb != null) {
					bankList.add(hb);
					System.out.print(hb.getAccountNumber() + "\t");
					System.out.print(hb.getName() + "\t");
					System.out.println(hb.getBalance());
					hb = (HclBank) oos.readObject();
				}
			} catch (Exception e) {
				System.out.println("Error in reading the file." + e.getMessage());
			}
		}
	}

	/**
	 * This method is used to serialize the data given.
	 * C:\\Users\\WINDOWS\\eclipse-workspace\\hclBankDetails\\
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
	 * number,balance and the account holder name from the user.
	 * 
	 * 
	 * @param scanner
	 *            and connection.
	 * @return void.
	 * 
	 */
	public void add(Scanner sc) {
		try {

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
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from HCLBank where accountNumber = " + accountNumber);
			if (!rs.isBeforeFirst()) {
				// double balance = 0.0;
				bankList.add(new HclBank(accountNumber, name, balance));
				insert(new HclBank(accountNumber, name, balance));
			} else {
				System.out.println("Already exists");
			}
			rs.close();
			st.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Given Input is Invalid for balance");
		}
	}

	/**
	 * This method is used for adding of information to the database.
	 * 
	 * @param object of HclBank
	 * @return void.
	 * 
	 */
	public void insert(HclBank bankDetails) {
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into HCLBank values" + "('" + bankDetails.getAccountNumber() + "','"
					+ bankDetails.getName() + "','" + bankDetails.getBalance() + "')");
			System.out.println("Inserted Successfully!");
			// print(stmt);
		} catch (Exception e) {
			System.out.println("Not Inserted Successfully");

		}
	}

	/**
	 * This method is used for getting the balance amount in the particular account
	 * given.
	 * 
	 * @param scanner
	 *            
	 * @return
	 * 
	 */
	public static double balance(Scanner sc) {
		try {
			Statement stmt = con.createStatement();
			DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
			System.out.println("Account Number : ");
			int accountNumber = sc.nextInt();
			ResultSet rs = stmt.executeQuery("Select * from HCLBank where accountNumber = " + accountNumber);
			// for(HclBank bank1:bankList) {
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + formatter.format(rs.getDouble(3)));
				}
			} else {
				System.out.println("No account exists for this account number");
				rs.close();
				stmt.close();
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid account number");
		}
		return 0;
	}

	public class WithdrawThread implements Runnable {
		private Account obj;
		private double amount;

		/**
		 * @param obj
		 */
		public WithdrawThread(Account amt, double amount) {
			super();
			obj = amt;
		}

		@Override
		public void run() {
			obj.withdraw(this.amount);
			obj.deposit(this.amount);

		}

	}
	/*
	 * public static class DeposiThread implements Runnable{ private Account obj;
	 * private double amount;
	 * 
	 * /**
	 * 
	 * @param obj
	 * 
	 * @return
	 */

	/*
	 * public DeposiThread(Account amt,double amount) { super(); obj = amt; }
	 * 
	 * @Override public void run() { // obj.withdraw(100); obj.deposit(this.amount);
	 * 
	 * }
	 */

	/**
	 * @param obj
	 */

}

