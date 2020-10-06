package com.hcl.day6;

import java.util.Scanner;

/**
 *
 * Day # :6 Topic : Core Java
 *
 * This class is used to to check whether the given string is a palindrome or
 * not. which is obtained from user.
 *
 * @author Dharini.
 *
 */

public class PalindromeWords {
	/**
	 * This method is used to get the string from user and check whether it is
	 * palindrome or not.
	 *
	 * Sample Input
	 * madam
	 * Sample Output
	 * Yes
	 * Sample Input2
	 * Hcl techologies 
	 * Sample Output2 
	 * No
	 *
	 * @param args - command line argument
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String str1 = sb.reverse().toString();
		if (str.equals(str1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
