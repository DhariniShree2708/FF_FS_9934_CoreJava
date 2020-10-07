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
	static Connection con = null;
	static ArrayList<HclBank> bankList = new ArrayList<HclBank>();
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // For registering the driver for jdbc connectivity.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HCLBankingDetails", "student",
					"student"); // Establishing connection with the database
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
		deSerialize();
		try {
			HclBankMain bank = new HclBankMain();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to HCL Bank Portal!");
			String str = "";
			do {
				System.out.println("Enter command(add/balance/quit) : ");
				String str1 = sc.nextLine();
				switch (str1.toLowerCase()) {
				case "add":
					bank.add(sc, con);
					break;
				case "balance":
					bank.balance(sc, con);
					break;
				case "quit":
					System.out.println("Good Bye!");
					break;
				default:
					System.out.println("Sorry,but \"" + str1 + "\" is not a valid command. Please try again.");
					break;
				}
			} while (!str.equals(""));
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		serialize();
	}

	/**
	 * This method is used to deserialize the data given.
	 * 
	 * 
	 * @return void.
	 * 
	 */

	private static void deSerialize() {
		{
			HclBank hb = null;
			try {
				FileInputStream fos = new FileInputStream("E:\\Dharu\\HCL\\HclContent.txt");
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
	 * This method is used for collecting the data from user.
	 * 
	 * 
	 * @param scanner
	 *            and connection.
	 * @return void.
	 * 
	 */
	private void add(Scanner sc, Connection con) {
		try {
			System.out.println("Account Number : ");
			int accountNumber = sc.nextInt();
			System.out.println("Name : ");
			String name = sc.next();
			try {
				System.out.println("Balance ($) : ");
				double balance = sc.nextDouble();
				if (balance <= 0)
					System.out.println("Enter a valid balance amount");
			} catch (NumberFormatException e) {
				System.out.println("Invalid Balance Amount");

			}
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from HCLBank where accountNumber = " + accountNumber);
			if (!rs.isBeforeFirst()) {
				double balance = 0.0;
				bankList.add(new HclBank(accountNumber, name, balance));
				insert(new HclBank(accountNumber, name, balance), con);
			} else {
				System.out.println("Already exists");
			}
			rs.close();
			st.close();

		} catch (Exception e) {
			System.out.println("Given Input is Invalid for balance");
		}
	}

	/**
	 * This method is used for adding of information to the database.
	 * 
	 * @param object
	 *            of HclBank and connection
	 * @return void.
	 * 
	 */
	private void insert(HclBank bankDetails, Connection con) {
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
	 *            and connection.
	 * @return void.
	 * 
	 */
	private void balance(Scanner sc, Connection conn) {
		try {
			Statement stmt = conn.createStatement();
			DecimalFormat form = new DecimalFormat("###,###,##0.00");
			System.out.println("Account Number : ");
			long accountNumber = sc.nextLong();
			ResultSet rs = stmt.executeQuery("Select * from HCLBank where accountNumber = " + accountNumber);
			if (rs.next()) {
				System.out.println(rs.getString("accountNumber") + "\t" + rs.getString("name") + "\t"
						+ form.format(rs.getDouble("balance")));
			} else {
				System.out.println("No account exists for this account number");
				rs.close();
				stmt.close();
			}

		} catch (Exception e) {
			System.out.println("Please enter a valid account number");
		}
	}

	/**
	 * This method is used to serialize the data given.
	 * 
	 * 
	 * @return void.
	 * 
	 */

	private static void serialize() {
		{
			try {
				FileOutputStream fos = new FileOutputStream("E:\\Dharu\\HCL\\HclContent.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				for (HclBank hb : bankList) {
					oos.writeObject(hb);
					;
				}
				oos.close();
				fos.close();
				System.out.println("Accounts details are successfully inserted in file.");
			} catch (Exception e) {
				System.out.println("Error in writing the details into a file. " + e.getMessage());
			}
		}
	}
}

