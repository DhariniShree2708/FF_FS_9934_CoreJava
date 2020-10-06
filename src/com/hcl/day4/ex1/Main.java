package com.hcl.day4.ex1;
/*
 * This main class consists of main method
 * which is used to call the two methods in class Room.
 */
public class Main {
/*
 * @param args
 * This static Main class is used to call the non static method
 * by creating object for the class room.
 * @return void
 */
public static void main(String[] args) {
Room mm = new Room();  //Object creation for class Room
mm.setData();
mm.displayData();
}
}
