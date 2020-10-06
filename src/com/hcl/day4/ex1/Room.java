/**
*Day # : 3
*Title : Core Java
*@author Dharini
*/

package com.hcl.day4.ex1;

/**
*
* This Class contains the room details.
* like Room number,Type of room,
* Area of room and availability of AC Machine present in the room.
*
*/

public class Room {
int roomNo = 0;
char roomType;
double roomArea;
boolean acMachine;

/*
* This non static method is used to set
* the values to the attributes of the class
* By using this. function
* @return void
*
*/

public void setData() {
this.roomNo = 100;
this.roomType = 'S';
this.roomArea = 6.90;
this.acMachine = true;
}
/*
* This non static method is used to display
* the values of the attributes of class room
* @return void
*/
public void displayData() {
System.out.println(this.roomNo);
System.out.println(this.roomType);
System.out.println(this.roomArea);
System.out.println(this.acMachine);
}
}
