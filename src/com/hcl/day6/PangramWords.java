package com.hcl.day6;

import java.util.Scanner;

/**
 *
 * Day # :6 Topic : Core Java
 *
 * This class is used to to check whether the given string is a pangram or not.
 * which is obtained from user.
 *
 * @author Dharini.
 *
 */
public class PangramWords {

	/**
	 * 
	 * This method is used to get the string from user 
	 * and check whether it contains any repeated letter
	 * or not by counting the occurence of character in a
	 * string.
	 * 
	 * Sample Input
	 * The quick brown fox jumps over the lazy dog sp.
	 * Sample Output:
	 * Pangram
	 * Sample Input2
	 * The quick brown fox ran away ssp. 
	 * Sample Output2: Not a Pangram
	 *
	 * @param args - command line argument
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String : ");
		String str = sc.nextLine();
		boolean[] alphabets = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			alphabets[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphabets[i] == false)
				flag = 0;
		}
		// System.out.print("String: " + str);
		if (flag == 1)
			System.out.print("\nPangram.");
		else
			System.out.print("\nNot a Pangram.");
		sc.close();
	}
}
