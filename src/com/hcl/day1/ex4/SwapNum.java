package com.hcl.day1.ex4;

import java.util.Scanner;

public class SwapNum {
public static void main(String[] args) {
byte num1, num2, temp = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Number:");
num1 = sc.nextByte();
System.out.println("Enter the Second Number:");
num2 = sc.nextByte();
System.out.println("Before Swap...");
System.out.println("First Number : " + num1);
System.out.println("Second Number : " + num2);
temp = num1;
num1 = num2;
num2 = temp;
System.out.println("After Swap...");
System.out.println("First Number : " + num1);
System.out.println("Second Number : " + num2);
sc.close();
}
}
