package com.hcl.day2.ex5;

import java.util.Scanner;

/**
*
 * Day # : 2 Topic : Core Java
*
 * This class is used to display the middle character of a string.
*
 * @author Dharini
 *
 */

public class MiddleName {
/**
* Main method is used to get the string from user.
*@param args
*
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Input a string: ");
middle(sc.nextLine());
sc.close();
}
/*
* This static method is used to find the length of the string.
* If it is odd it returns one middle character.
*If the length is even it returns two middle
* character.
*
*/
public static void middle(String str) {
int position = 0,
extent = 0;
if (str.length() % 2 == 0) {
position = str.length() / 2 - 1;
extent = 2;
} else {
 position = str.length() / 2;
 extent = 1;
 }
String ch = str.substring(position, position + extent);
System.out.println("The middle character in the string: " + ch);
}
}
