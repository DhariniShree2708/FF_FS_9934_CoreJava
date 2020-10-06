package com.hcl.day6;

/**
 * Day # : 6 Topic : Core Java.
 *
 * @author Dharini
 *
 *This class is used to allocate 5 elements of integer array - anbu for
 *understanding the concept of array creation using new keyword.
 *
 */
public class ArrayDemo1 {

	/**
	 *
     * The static main method allocates first
	 * & fifth element with 11,22 -anbu
     * initializes the array and
     * give the array values and
     * display them using sysout
	 * function.
	 *
	 * @param args
     * @return void
	 */
	public static void main(String[] args) {
		int[] x; // declares the array
		x = new int[5]; // allocates the memory
		x[0] = 11;
		// x[1]=12;
		// x[2]=13;
		// x[3]=14;
		x[4] = 22;
		System.out.println("Element at index 0 : " + x[0]);
		System.out.println("Element at index 1 : " + x[1]);
		// System.out.println("Element at index 2 : " + x[2]);
		// System.out.println("Element at index 3 : " + x[3]);
		System.out.println("Element at index 4 : " + x[4]);
}
}
