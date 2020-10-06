package com.hcl.day6;

/**
 * Day #:6.
 * Topic:Core Java.
 *
 * The class is used to produce 3 rows and allocate 3 values to it.
 * @author Dharini.
 *
 */
public class TwoDimDemo {

	/**
	 * The static method allocates the
	 * column no. to 0th,1st and 2nd position
	 * @param args
     * @return void
	 */
	public static void main(String[] args) {
		int[][] x = new int[3][];
		x[0] = new int[3];
		x[1] = new int[2];
		x[2] = new int[5];
		for(int i = 0; i < x.length; i++) {   
			for(int j = 0; j < x[i].length; j++) {   
				  x[i][j] = i;
		System.out.println(x[i][j]);
	}
	System.out.println("\n");
}
}
}