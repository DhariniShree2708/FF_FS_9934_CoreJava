package com.hcl.day2.ex2;
/**
*
 * Day # : 2 Topic : Core Java
*
 * This class contains a static method checkSum which accepts a positive
 * integer.
*
 * @author Dharini
 *
 */
public class UserMainCode {
/*
* This is a static method which returns 1 if the sum is odd and return -1 if
* the sum is even.
*/

public static int checkSum(int num) {
int digit = num, a = 10;
int sum = 0;
while (digit != 0) {
int temp = digit % a;
if (temp % 2 != 0) {
sum = sum + temp;
digit = digit / a;
}
}
return sum % 2 != 0 ? 1 : -1;
}
}
