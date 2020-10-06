package com.hcl.day2.ex4;

/**
 * Day # : 2
 * Topic : Core Java
 *
 * This class is used to find the smallest number
 * amoung three numbers by using ternary operator.
 * @author Dharini
 *
 */
import java.util.Scanner;

public class SmallestNumber {

/**
* Main method is used to compare 3 numbers and find the smallest.
* @param args - Command line argument
* @return void
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("First Number:");
byte number1 = sc.nextByte();
System.out.println("Second Number:");
byte number2 = sc.nextByte();
System.out.println("Third Number:");
byte number3 = sc.nextByte();
byte temp = number1 < number2 ? number1 : number2;
byte res = number3 < temp ? number3 : temp;
System.out.println("Smallest Number:" + res);
sc.close();
}
}
