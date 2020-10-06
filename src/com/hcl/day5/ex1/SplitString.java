package com.hcl.day5.ex1;

import java.util.Scanner;

/**
 * Day # : 5
 * Topic : Core Java
 *
 * This class consists of main method which is used to split the input string by
 * delimiter “;” and convert all the characters in a string to lowercase and
 * print.
 *
 * @author Dharini
 *
 */
public class SplitString {

/**
* The static main method is used to get the string and split the
* string by delimiter by using split function in string class.
* @param args
* @return void
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Input a String:");
String str = sc.nextLine();
String[] arrOfStr = str.toLowerCase().split(";"); // Split function
for (String str1 : arrOfStr) {
System.out.println(str1);
sc.close();
}
}
}

