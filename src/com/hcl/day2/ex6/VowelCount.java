package com.hcl.day2.ex6;

import java.util.Scanner;

/**
 *
 * Day # : 2 Topic : Core Java
 *
 * This class has static main method which calls countVowels(non static method).
 *
 * @author Dharini
 *
 */
public class VowelCount {
/**
* @param args
* This method gets the input from user.
* @return void
*/
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Input a string: ");
VowelCount cn = new VowelCount();
cn.countVowels(sc.nextLine());
sc.close();
}
/*
* Non Static method is used for counting
* all vowels in parameter passed string
* type.
*/
public void countVowels(String str) {
byte count = 0;
for (int i = 0; i < str.length(); i++) {
char ch = str.toLowerCase().charAt(i);
if (ch == 'a' || ch == 'e'
|| ch == 'i' || ch == 'o' || ch == 'u') {
count++;
}
System.out.println("Number of Vowels in the string:" + count);
}
}
}
