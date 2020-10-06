package com.hcl.day6.x1;

import java.util.Scanner;

/**
 *
 * Day # :6 Topic : Core Java
 *
 * This class consists of a static method which gets a string from user and
 * define the character pass it to method.
 *
 * @author Dharini.
 *
 */
public class Main {

	/**
	 * 
	 * This method gets the string from user &
	 * character to be inserted is obtained
	 * by creating an object to character class
	 * and calls the method in another
	 * class by creating object.
	 *
	 * @param args - command line argument.
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string : ");
		String str = sc.nextLine();
		String s = sc.nextLine();//new Character('-');
		UserMainCode um = new UserMainCode();
		um.reShape(str, s);
		sc.close();
	}
}
