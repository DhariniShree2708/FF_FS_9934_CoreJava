/**
 * 
 */
package com.hcl.day26.ex1;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * @author ksluc
 *
 */
public class STDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		FileReader freader = new FileReader("C:\\Users\\ksluc\\eclipse-workspace\\CoreJava\\src\\com\\hcl\\day26\\ex1\\AllContent.txt");
		StreamTokenizer st = new StreamTokenizer(freader);
		double sum = 0;
		int numWords = 0;
		int numChars = 0;
		while(st.nextToken()!=st.TT_EOF) {
			if(st.ttype == StreamTokenizer.TT_NUMBER) {
				sum +=st.nval;
			}
			else if(st.ttype == StreamTokenizer.TT_WORD)  {
				numWords++;
				numChars += st.sval.length();
				
			}
			
		}
		System.out.println("Total Inventory ($) : "+sum);
		System.out.println("Total Cars : "+numWords);
		System.out.println("No. of Characters available in words : "+numChars);
		
		freader.close();
		
	}

}
