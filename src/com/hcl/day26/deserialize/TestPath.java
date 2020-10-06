/**
 * 
 */
package com.hcl.day26.deserialize;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dharini
 *
 */

public class TestPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			StudentInfo si = null;
			try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\ksluc\\OneDrive\\Desktop\\student\\student.txt");
			ObjectOutputStream in = new ObjectOutputStream(file);
			si = (StudentInfo) in.readObject();
			}
		catch (Exception e)
		{
			System.out.println("Error in Reading the details from the files." + e.getMessage());
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);

	}

}
