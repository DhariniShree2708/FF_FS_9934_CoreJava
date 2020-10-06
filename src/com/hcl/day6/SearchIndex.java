package com.hcl.day6;

import java.util.Scanner;

/**
 * Day # : 6 
 * 
 * Topic : Core Java
 *
 *
 * This class is used to search the given element from user
 * and give the index of the
 * element as output.
 *
 * @author Dharini
 *
 */
public class SearchIndex {
	/**
	 * The main method gets the array elements
	 * and the element to be searched as an
	 * input from user.
	 * 
	 * Sample Input
	 * Array Elements : 1 3 45 34 2 6 7 8 9 22
	 * Enter the Element to be searched: 2
	 * 
	 * Sample Output
	 * The index of search element is : 4
	 * 
	 * 
	 *
	 * @param args - command line argument.
	 * @return void
	 */
	public static void main(String[] args) {
		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Array elements : ");
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}
		System.out.println("\nEnter the Element to be searched: ");
		byte num = sc.nextByte();

		SearchIndex si = new SearchIndex();
		si.searchIndexOfElement(numArray, num); // Calls the method
		sc.close();
	}

	/**
	 * This method is used to compare the elements of array.
	 * with the element to be
	 * searched.
	 *
	 * @param arr,num1
	 * @return void
	 */
	public void searchIndexOfElement(int[] arr, int num1) {
		byte count = 0;
		for (int i=0; i< arr.length; i++) {
			if (arr[i] == num1) {
				count += 1;
				System.out.println("The index of search element is : " + i);
				break;
			}
		}
		if (count == 0) {
			System.out.println("Search element not found");
		}
	}
}
