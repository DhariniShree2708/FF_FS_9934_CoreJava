package com.hcl.day4.ex2;

/**
 * Day # : 4
 * Topic : Core Java
 *
 * @author Dharini
 */
import com.hcl.day4.ex2a.A;
import com.hcl.day4.ex2b.B;

/**
*
* This main class consists of main method which calls the methods from 2
* different packages Under 2 different classes.
*
*/
public class Main {

/*
* @param args
* This static method calls the 2 different non static method from 2
* different packages under 2 different classes by creating object which
* demonstrates the concept of package.
* @return void
*/
public static void main(String[] args) {
A a = new A(); // object creation for class A
a.methodB();
B b = new B(); // object creation for class B
b.methodA();
}
}
