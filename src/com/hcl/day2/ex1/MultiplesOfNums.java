package com.hcl.day2.ex1;

/**
 * Day # : 2 Topic : Core Java
 *
 * This class iterates the integers from 1 to 100. For multiples of three print
 * "Fizz" instead of the number and print "Buzz" for the multiples of five. When
 * number is divided by both three and five, print "Fizz Buzz".
 *
 * @author Dharini
 *
 */

public class MultiplesOfNums {

/**
* Main Method is used to check the multiples of 3,5 and 15.
* @param args - Command Line Arguments
* @return void
*/
public static void main(String[] args) {
byte a = 100, b = 15, c = 5, d = 3;
for (byte i = 1; i <= a; i++) {
if (i % b == 0) {
System.out.println(i + ":Fizz Buzz");
}
else if (i % c == 0) {
System.out.println(i + ":Buzz");
}
else if (i % d == 0) {
System.out.println(i + ":Fizz");
}
}
}
}
