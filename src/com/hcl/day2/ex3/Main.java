package com.hcl.day2.ex3;

import java.util.Scanner;

/**
* Day 2 : Topic : Core Java This class gets the input as a positive integer and
* call the static method sumOfSquaresOfEvenDigits present in the UserMainCode.
*
* @author Dharini
*
*/
public class Main {

/*
* This method gets the value and pass it to the function
*
*@param args - Command line arguments
*@return void
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number:");
int number = sc.nextInt();
//Prints the value that returns from method
System.out.println(UserMainCode.sumOfSquaresOfEvenDigits(number));
sc.close(); // Closes Scanner class
}
}
