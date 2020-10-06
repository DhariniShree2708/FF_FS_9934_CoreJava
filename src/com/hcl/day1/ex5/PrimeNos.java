package com.hcl.day1.ex5;

import java.util.Scanner;

public class PrimeNos {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number:");
byte num = sc.nextByte();
boolean temp = false;
for (int i = 2; i <= num / 2; ++i) {
if (num % i == 0) {
temp = true;
break;
}
}
if (!temp) {
System.out.println(num + " is a prime number.");
}
else {
System.out.println(num + " is not a prime number.");
}
sc.close();
}
}
