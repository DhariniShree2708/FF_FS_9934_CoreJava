package com.hcl.day5.ex2;

import java.util.Scanner;

/**
 * Day # : 5. 
 * Topic : Core Java.
 * 
 * 
 *
 *
 *
 *This class consists of main method which is used to replace the
 *particular character of a string using string class.
 *
 *@author Dharini
 */

public class ReplaceCharacter {
	/**
	 * This main method gets the input str from the user and converts it into
	 * lowercase and replace the specific character in string.
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String: ");
		String str = sc.nextLine();
		String str1 = str.toLowerCase().replace('d', 'h');
		System.out.println("Output: " + str1);
		sc.close();
	}
}
