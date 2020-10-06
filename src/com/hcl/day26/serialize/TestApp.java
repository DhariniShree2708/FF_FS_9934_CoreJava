/**
 * 
 */
package com.hcl.day26.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author ksluc
 *
 */
public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StudentInfo si = new StudentInfo("Abhi",104,"110044");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\ksluc\\OneDrive\\Desktop\\student\\student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			System.out.println("Success");
			oos.close();
			fos.close();
		}
		catch (Exception e)
		{
			System.out.println("Error in writing the details into the files." + e.getMessage());
		}
	}
	

}
