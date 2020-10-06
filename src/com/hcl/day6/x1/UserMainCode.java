package com.hcl.day6.x1;

/**
 *
 * Day # :6 Topic : Core Java
 *
 * This class consists of a non static method which gets a string and character
 * from main method.
 *
 *
 *
 * @author Dharini.
 *
 */
public class UserMainCode {
	/**
	 * This method gets the string & character
	 *  to be inserted from user and reverse
	 * the string using stringbuffer class methods
	 * and append the char at the after
	 * each character in string.
	 *
	 *Sample Input: Rabbit and -
	 *
	 * Sample Output:
	 * t-i-b-b-a-R
	 *
	 * @param s, str
	 * @return String
	 */
	public String reShape(String s, String str) {

		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		String s2 = sb.reverse().toString();
		for (int i = 0; i < s2.length(); i++) {
			sb2.append(s2.charAt(i));
			sb2.append(str);
		}
		sb2.deleteCharAt(sb2.length() - 1);
		System.out.println(sb2.toString());
		return sb2.toString();
	}

}
