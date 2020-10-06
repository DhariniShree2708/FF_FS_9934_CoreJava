package com.hcl.day6;
import java.util.Scanner;

/**
 * Day # :6
 * Topic : Core Java
 *
 *This class is used to get the particular string from user and
 * pass it to the method in another class .
 *
 * @author Dharini
 *
 */
public class Main {

	/**
	 * 
	 * This method is used to pass the obtained string from user
	 * to the non static method which is placed in the another class,
	 * by creating object for the class.
     *
	 * @param args - Command line argument
     * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String : ");
		String str1 = sc.nextLine();
		UserMainCode um = new UserMainCode();
       System.out.println(um.getString(str1));
		sc.close();

	}

}
