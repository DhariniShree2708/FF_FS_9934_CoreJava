/**
 * 
 */
package com.hcl.day7;

/**
 * @author ksluc
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape ss = new Shape();
		Rectangle rect1 = new Rectangle();
		Square square1 = new Square();
		
		System.out.println(ss.printArea());
		System.out.println(rect1.printArea());
		System.out.println(square1.printArea());
		
		Rectangle rect2 = new Rectangle(5,10);
		Square square2 = new Square(5);
		
		System.out.println(rect2.printArea());
		System.out.println(square2.printArea());
		}

}
