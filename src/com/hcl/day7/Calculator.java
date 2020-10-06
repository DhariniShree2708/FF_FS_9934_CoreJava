package com.hcl.day7;

/**
 * Day # : 7
 * Topic : Core Java
 * 
 * This class is used to call the overloaded methods which is
 * created in another class.
 * 
 * 
 * @author Dharini
 *
 */
public class Calculator {

	/**
	 * This method creates an object for the another class 
	 * and calls the overloaded method.
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		Arithematic arm = new Arithematic();
		System.out.println("Addition : " + arm.add(10, 20));
		System.out.println("Addition : " + arm.add(10, 20, 30));
		System.out.println("Subtraction : " + arm.sub(10, 20));
		System.out.println("Subtraction : " + arm.sub(10, 20, 30));
		System.out.println("Multiply : " + arm.mul(20,10));
		System.out.println("Multiply : " + arm.mul(20, 20, 30));
		System.out.println("Division : " + arm.div(20,10));
		System.out.println("Division : " + arm.div(20, 20, 30));
		System.out.println("Remainder : " + arm.rem(15, 2));
		System.out.println("Remainder : " + arm.rem(7,3,1));
		System.out.println("Average : " + arm.average(10, 20));
		System.out.println("Average : " + arm.average(10, 20, 30));
		System.out.println("Maximum : " + arm.maximum(10, 20));
		System.out.println("Maximum : " + arm.maximum(10, 20, 30));
		System.out.println("Minimum : " + arm.minimum(10, 20));
		System.out.println("Minimum : " + arm.minimum(10, 20, 30));
		
	}

}
