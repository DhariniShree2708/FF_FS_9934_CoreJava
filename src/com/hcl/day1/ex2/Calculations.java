package com.hcl.day1.ex2;

import java.util.Scanner;

public class Calculations {
public static void main(String[] args) {
byte num1, num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
num1 = sc.nextByte();
System.out.println("Enter Second Number:");
num2 = sc.nextByte();
System.out.println("Addition:" + (num1 + num2));
System.out.println("Subtraction:" + (num1 - num2));
System.out.println("Muliplication:" + (num1 * num2));
System.out.println("Division:" + (num1 / num2));
System.out.println("Remainder:" + (num1 % num2));
sc.close();
}
}
