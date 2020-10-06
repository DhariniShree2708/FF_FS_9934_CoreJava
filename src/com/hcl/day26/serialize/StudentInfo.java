/**
 * 
 */
package com.hcl.day26.serialize;

import java.io.Serializable;

/**
 * @author ksluc
 *
 */
class StudentInfo implements Serializable {
		
		String name;
		int rid;
		String contact;
		/**
		 * @param name
		 * @param rid
		 * @param i
		 */
		public StudentInfo(String name, int rid, String contact) {
			super();
			this.name = name;
			this.rid = rid;
			this.contact = contact;
		}
		
	}
