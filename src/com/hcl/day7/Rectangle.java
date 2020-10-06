package com.hcl.day7;

/**
 * @author ksluc
 *
 */
public class Rectangle extends Shape {

	int length;
	int breadth;

	public Rectangle() {
		super();
		this.length = super.length;
		this.breadth = 20;
	}

	/**
	 * @param length, breadth
	 */
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int printArea() {
		return length * breadth;
	}

}
