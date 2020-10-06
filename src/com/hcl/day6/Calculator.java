package com.hcl.day6;

/**
 * This class is used to add 2 integers and pass it
 * to the another method in different package.
 * 
 * @author Dharini
 *
 */
public class Calculator {
	/**
	 * This Method adds two integers 
	 * and print the result.
	 * @param args
	 * return void
	 */

	public static void main(String[] args) {
	int num1 = 10;
	int num2 = 20;
	int sum = num1 + num2;
	System.out.println("Result : " +sum);
	}
}