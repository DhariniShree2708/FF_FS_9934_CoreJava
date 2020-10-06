/**
*
*/
package com.hcl.day2.ex2;

import java.util.Scanner;

/**
*
* Day # : 2 Topic : Core Java
*
* This class would get the input as a positive integer. call the static method
* checkSum present in the UserMainCode.
*
* @author Dharini
*
*/

public class Main {
/**
* Main method is used to call static method and print the result.
*
*@param args
*@return void
*
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number:");
if (UserMainCode.checkSum(sc.nextInt()) == 1) {
System.out.println("Sum of odd digit is odd");
}
else {
System.out.println("Sum of odd digit is even");
}
sc.close();
}
}
