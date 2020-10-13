package com.hcl.day28.bankportal;


/**
 * This interface is used for closing the bank account
 * which consists of default method.
 *
 */
@FunctionalInterface 
public interface Bank {
	
	/**
	 * This method is the default method which is
	 * used to close the bank account if the inactive is true.
	 * 
	 * @param act
	 * @return boolean
	 */
abstract void closeAccount();	
public default boolean closeAcount(MiniBank act) {
	try {
		act.setInActive(true);
		System.out.println("Account is Closed");
		return true;
	} catch(Exception e) {
		System.out.println("Account is not closed"+e.getMessage());
		}
	return false;
	}
}
