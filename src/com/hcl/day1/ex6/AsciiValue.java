package com.hcl.day1.ex6;

import java.util.Scanner;

public class AsciiValue {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Entered Character :");
String str = sc.next();
char ch = str.charAt(0);
byte castAscii = (byte) ch;
System.out.println("The ASCII Value is:" + castAscii);
sc.close();
}
}
