package com.hcl.day31;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Day # : 31.
 * 
 * Topic : core java.
 * 
 * 
 * This main class is used as hotel room reservation system which is used to get
 * the booking details and save it in the list and displays and updates it
 * whenever required.
 * 
 * 
 * @author Dharini
 *
 */
public class HotelReservationMain {
	ArrayList<HotelReservation> hotelDetails = new ArrayList<HotelReservation>();
	static Logger log = Logger.getLogger(HotelReservationMain.class.getName());

	/**
	 * This main method consists of three methods for saving the datas and reading
	 * it whenever required and updating the details.
	 * 
	 * @param args
	 * @return void.
	 */

	public static void main(String[] args) {
		log.info("Welcome to Hotel Reservation System");
		HotelReservationMain hoteldet = new HotelReservationMain();
		Scanner sc = new Scanner(System.in);
		try {
			String str = "quit";
			do {
				System.out.println("Enter command(add/read/update/delete/quit) : ");
				str = sc.next();
				switch (str.toLowerCase()) {
				case "add":
					hoteldet.add(sc);
					break;
				case "read":
					hoteldet.read();
					break;
				case "update":
					hoteldet.update(sc);
					break;
				case "delete":
					hoteldet.delete(sc);
					break;
				case "quit":
					log.info("Good Bye!");
					break;
				default:
					log.warn("Sorry,but \"" + str + "\" is not a valid command. Please try again.");
					break;
				}
			} while (!str.equals("quit"));
		} catch (Exception e) {
			log.error("Please enter the valid details: " + e.getMessage());
		}

	}

	public void delete(Scanner sc) {
		try {
			for (Iterator<HotelReservation> it = hotelDetails.iterator(); it.hasNext();) {
				if (it.next().getStatus().contains("unbooked")) {
					it.remove();
				}
				log.info("Details are deleted successfully!!");
			}
		} catch (Exception e) {
			System.out.println("Delete operation has failed!!");
		}

	}

	/**
	 * This method is used to update the details in the saved data.
	 * 
	 * @param sc
	 * @return void.
	 */

	public void update(Scanner sc) {
		try {
			System.out.println("Enter from date:");
			DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
			Date fromDate = dateFor.parse(sc.next());
			System.out.println("Enter to date:");
			Date toDate = dateFor.parse(sc.next());
			System.out.println("Enter status:");
			String status = sc.next();
			hotelDetails.stream().forEach((details -> {
				details.setFromDate(fromDate);
				details.setToDate(toDate);
				details.setStatus(status);
			}));
			log.info("Updated Successfully");
			read();
		} catch (Exception e) {
			log.warn("Failure in Updation:" + e.getMessage());
		}
	}

	/**
	 * This method is used to diplay the details which is stored.
	 * 
	 * @param sc
	 * @return void.
	 */

	private void read() {
		try {

			hotelDetails.stream()
					.forEach((hr) -> log.debug("From Date: " + hr.getFromDate() + "\nTo Date: " + hr.getToDate()
							+ "\nName: " + hr.getName() + "\nStatus: " + hr.getStatus() + "\nPrice(INR): "
							+ NumberFormat.getInstance().format(hr.getPrice())));
			log.info("\nThe Details are Displayed successfully!");
		} catch (Exception e) {
			log.error("Unable to read:" + e.getMessage());
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
			DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
			Date fromDate = dateFor.parse(sc.next());
			System.out.println("Enter the date of vaccating of rooms:");
			Date toDate = dateFor.parse(sc.next());
			System.out.println("Enter the Name:");
			String name = sc.next();
			System.out.println("Enter the Status:");
			String status = sc.next();
			System.out.println("Enter the Price(INR):");
			double price = sc.nextDouble();
			hotelDetails.add(new HotelReservation(fromDate, toDate, name, status, price));
			log.info("\nThe details are added successfully!\n");
		} catch (Exception e) {
			log.error("Please enter the valid Data's!" + e.getMessage());
		}

	}
}
