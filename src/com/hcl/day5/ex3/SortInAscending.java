package com.hcl.day5.ex3;

import java.util.Arrays;

/**
 * Day # : 5. Topic : Core Java.
 * 
 * @author Dharini
 *
 *
 *
 *
 * This class consists of main method which is created for the purpose
 * of arranging the array of elements in ascending order.
 *
 */
public class SortInAscending {

	/**
	 * This is static main method which gets the array of integers from users
	 * compare the numbers & arrange them in ascending order.
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		int[] arr_int = { 5, 3, 7, 1, 11, 9, 4, 7, 2, 10 };
		System.out.println("Array before sorting: " + Arrays.toString(arr_int) + "\n");

		Arrays.sort(arr_int);

		System.out.println("Array after sorting: " + Arrays.toString(arr_int) + "\n");

	}
}
