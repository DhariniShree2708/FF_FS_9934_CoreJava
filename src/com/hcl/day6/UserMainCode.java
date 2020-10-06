package com.hcl.day6;

/**
 * Day # :6 Topic : Core Java
 *
 * This class deletes the unwanted character in the string which is mentioned.
 *
 *
 * @author Dharini
 *
 */

public class UserMainCode {
	/**
	 * This method is used to check if the 1st 2 character of string consists of any
	 * unwanted words and deletes them using the string method.
	 * 
	 * sample Input 1: hello 
	 * Sample Output 1: llo 
	 * Sample Input 2: kava 
	 * Sample Output 2: kva
	 * Sample Input 3: absent
	 * Sample Output 3: bsent
	 *
	 * @param str
	 * @return String - Returns a string value
	 */
	public String getString(String str) {
		if (str.length() > 0) {
			if (str.startsWith("k")) {
				return str.charAt(0) + str.substring(2, str.length());
			} else if (str.charAt(1) == 'b') {
				return str.substring(1, str.length());
			} else {
				return str.substring(2, str.length());
			}
		}
		return str;
	}
}
