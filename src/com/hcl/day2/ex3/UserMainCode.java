package com.hcl.day2.ex3;

/**
 *
 * Day 2 : Topic : Core Java
 *
 * This class contains a static method sumOfSquaresOfEvenDigits which accepts
 * positive integer.
 *
 * @author Dharini
 *
 */

public class UserMainCode {
/*
* This is a static method which returns sum of square of even digits
* if sum is not equal to zero and return 0 if the sum is zero.
*/
//Static mtd
public static int sumOfSquaresOfEvenDigits(int number) {
int digit = number, sum = 0, a = 10;
while (digit != 0) {
int temp = digit % a;
if (temp % 2 == 0) {
int multiply = temp * temp;
sum = sum + multiply;
}
digit = digit / a;
}
return sum;
}
}
