package com.hcl.day6;

import java.util.Scanner;

/**
 * Day # :6 Topic : Core Java
 *
 * This class is used to provide the particular part in the entire string which
 * is obtained from user.
 *
 * @author Dharini
 *
 */
public class MiddleOfWord {

	/**
	 * This method is used to print the part of string
	 * by getting the start & end position from user.
	 *
	 *
	 * Sample Input
	 * HelloWorld
	 * 3 7
	 * Sample Output
	 * loWo
	 *
	 * @param args - command line argument
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String : ");
		String str = sc.nextLine();
		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();
		System.out.println(str.substring(startIndex, endIndex));
		sc.close();
	}
}
