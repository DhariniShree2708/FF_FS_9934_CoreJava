package com.hcl.day7;

/**
 * @author ksluc
 *
 */
public class Shape {
	
	public int length;
	
	public Shape()
	{
		super();
		this.length = 10;
	}

	/**
	 * @param length
	 */
	public Shape(int length) {
		super();
		this.length = length;
	}
 
	public int printArea() {
		return length*length;
	}

}
