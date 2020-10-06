package com.hcl.day7;

/**
 * Day # : 7
 * Topic : Core Java
 * 
 * 
 * This class consists of overloaded methods which performs 
 * different arithemetic operations and return the value to
 * main function.
 * 
 * @author ksluc
 *
 */
public class Arithematic {
	//Method to add 2 integers
	public int add(int number1, int number2) {
		return number1+number2;
	}
	
	//overloaded Method to add 3 integers
	public int add(int number1, int number2, int number3) {
		return (number1 + number2 + number3);
	}
	
	//Method to subtract 2 integers
	public int sub(int number1, int number2) {
		return (number1 - number2);
	}
	
	//Overloaded Method to subtract 3 integers
	public int sub(int number1, int number2, int number3) {
		return (number1 - number2 - number3);
	}
	
	//Method to multiply 2 integers
		public int mul(int number1, int number2) {
			return (number1 * number2);
		}
		
		//Overloaded Method to multiply 3 integers
		public int mul(int number1, int number2, int number3) {
			return (number1 * number2 * number3);
		}
	
	//Method to divide 2 integers
	public int div(int number1, int number2) {
		return (number1 / number2);
	}
	
	//overloaded Method to divide 3 integers
	public int div(int number1, int number2, int number3) {
		return ((number1 / number2) / number3);
	}
	
	//Method to find remainder 2 of integers
	public int rem(int number1, int number2) {
		return (number1 % number2);
	}
	
	//overloaded Method to find remainder of 3 integers
	public int rem(int number1, int number2, int number3) {
		return ((number1 % number2) % number3);
	}
	
	//Method to find average of 2 integers
	public int average(int number1, int number2) {
		return ((number1 + number2)/2);
	}
	
	//overloaded Method to find average of 3 integers
	public int average(int number1, int number2, int number3) {
		return ((number1 + number2 + number3)/3);
	}
	
	//Method to find maximum of 2 integers
	public int maximum(int number1, int number2) {
		return (number1>number2)?number1 : number2;
	}
	
	//overloaded Method to find maximum of 3 integers
	public int maximum(int number1, int number2, int number3) {
		int temp = (number1>number2)?number1 : number2;
		return (number3>temp)?number3 : temp;
		}
	
	//Method to find minimum of 2 integers
	public int minimum(int number1, int number2) {
		return (number1<number2)?number1 : number2;
	}
	
	//Overloaded method to find minimum of 3 integers
	public int minimum(int number1, int number2, int number3) {
		int temp = (number1<number2)?number1 : number2;
		return (number3<temp)?number3 : temp;
		}
}
