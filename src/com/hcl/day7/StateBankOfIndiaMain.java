/**
 * 
 */
package com.hcl.day7;

/**
 * @author ksluc
 *
 */
public class StateBankOfIndiaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StateBankOfIndia bank = new StateBankOfIndia();
		
		bank.setRateOfInterestForHomeLoan(5);
		bank.setRateOfInterestForPersonalLoan(2);
		bank.setRateOfInterestForSavingAccount(4);
		bank.setMinimumBalanceForSavingAccount(2500);
		bank.setPenaltyForNonMinBalForSavingAccount(500);
		
		System.out.println(bank.getRateOfInterestForHomeLoan());
		System.out.println(bank.getRateOfInterestForPersonalLoan());
		System.out.println(bank.getRateOfInterestForSavingAccount());
		System.out.println(bank.getMinimumBalanceForSavingAccount());
		System.out.println(bank.getPenaltyForNonMinBalForSavingAccount());
		
		StateBankOfIndia bank1 = new StateBankOfIndia(8, 4, 5, 5000, 250);
		
		System.out.println(bank1.getRateOfInterestForHomeLoan());
		System.out.println(bank1.getRateOfInterestForPersonalLoan());
		System.out.println(bank1.getRateOfInterestForSavingAccount());
		System.out.println(bank1.getMinimumBalanceForSavingAccount());
		System.out.println(bank1.getPenaltyForNonMinBalForSavingAccount());
		
		
		

	}

}
