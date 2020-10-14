package com.hcl.day31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Day # : 31.
 * 
 * Topic : core java.
 * 
 * 
 * This main class is used as hotel room reservation system which is used to get
 * the details and save it in the list and displays and updates it whenever
 * required.
 * 
 * 
 * @author Dharini
 *
 */
public class HotelReservationMain {
	ArrayList<HotelReservation> hotelDetails = new ArrayList<HotelReservation>();
	HotelReservation hr = new HotelReservation(null, null, null, null, 0);

	/**
	 * This main method consists of three methods for saving the datas and reading
	 * it whenever required and updating the details.
	 * 
	 * @param args
	 * @return void.
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		HotelReservationMain hoteldet = new HotelReservationMain();
		Scanner sc = new Scanner(System.in);
		hoteldet.add(sc);
		hoteldet.read(sc);
		hoteldet.update(sc);

	}

	/**
	 * This method is used to update the details in the saved data.
	 * 
	 * @param sc
	 * @return void.
	 */

	public void update(Scanner sc) {
		System.out.println("Enter from date:");
		String fromDate = sc.next();
		System.out.println("Enter to date:");
		String toDate = sc.next();
		System.out.println("Enter status:");
		String status = sc.next();
		hotelDetails.stream().forEach((details ->{details.setFromDate(fromDate);
		details.setToDate(toDate);
		details.setStatus(status);}));
		read(sc);
		}
	
		

	/**
	 * This method is used to diplay the details which is stored.
	 * 
	 * @param sc
	 * @return void.
	 */

	private void read(Scanner sc) {
		try {
		System.out.println("\nThe Details added to the list:");
		hotelDetails.stream()
				.forEach((mb) -> System.out.println("From Date: " + mb.getFromDate() + "\nTo Date: " + mb.getToDate()
						+ "\nName: " + mb.getName() + "\nStatus: " + mb.getStatus() + "\nPrice: " + mb.getPrice()));

	}catch(Exception e) {
		System.out.println("Unable to read:" +e.getMessage());
	}
	}

	/**
	 * This method is used to get the details from the user and add it to the
	 * arraylist.
	 * 
	 * @param sc
	 * @return void.
	 */

	public void add(Scanner sc) {
		try {
			System.out.println("Enter the date of room accomodation:");
			String fromDate = sc.nextLine();
			System.out.println("Enter the date of vaccating of rooms:");
			String toDate = sc.nextLine();
			System.out.println("Enter the Name:");
			String name = sc.nextLine();
			System.out.println("Enter the Status:");
			String status = sc.nextLine();
			System.out.println("Enter the Price:");
			double price = sc.nextDouble();
			hotelDetails.add(new HotelReservation(fromDate, toDate, name, status, price));
			System.out.println("\nThe details are added successfully!\n");
		} catch (Exception e) {
			System.out.println("Not Successfull!" + e.getMessage());
		}

	}
}
