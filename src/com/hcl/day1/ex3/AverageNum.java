package com.hcl.day1.ex3;

import java.util.Scanner;

public class AverageNum {
public static void main(String[] args) {
int num = 3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number 1:");
int num1 = sc.nextByte();
System.out.println("Enter Number 2:");
int num2 = sc.nextByte();
System.out.println("Enter Number 3:");
int num3 = sc.nextByte();
int res = num1 + num2 + num3 / num;
System.out.println("The Average of 3 Numbers is:" + res);
sc.close();
}
}
