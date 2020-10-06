package com.hcl.day7;

/**
 * Day # : 7
 * Topic : Core Java.
 * 
 * This class consists of private member variables 
 * which uses getter and setter methods.
 * 
 * @author Dharini
 *
 */
public class StateBankOfIndia {

	private float rateOfInterestForHomeLoan;
	private float rateOfInterestForPersonalLoan;
	private float rateOfInterestForSavingAccount;
	private float minimumBalanceForSavingAccount;
	private float penaltyForNonMinBalForSavingAccount;
	
	/**
	 * A default constructor is used here 
	 * which assigns the values to the private variables.
	 */
	public StateBankOfIndia() {
		super();
		this.setRateOfInterestForHomeLoan(8f);
		this.setRateOfInterestForPersonalLoan(12f);
		this.setRateOfInterestForSavingAccount(3.5f);
		this.setMinimumBalanceForSavingAccount(5000f);
		this.setPenaltyForNonMinBalForSavingAccount(250f);
	}
	
	/**
	 * 
	 * A Parameterized constructor is used here 
	 * which assigns the values to the private variables.
	 * 
	 * @param rateOfInterestForHomeLoan
	 * @param rateOfInterestForPersonalLoan
	 * @param rateOfInterestForSavingAccount
	 * @param minimumBalanceForSavingAccount
	 * @param penaltyForNonMinBalForSavingAccount
	 */
	public StateBankOfIndia(float rateOfInterestForHomeLoan, float rateOfInterestForPersonalLoan,
			float rateOfInterestForSavingAccount, float minimumBalanceForSavingAccount,
			float penaltyForNonMinBalForSavingAccount) {
		super();
		this.setRateOfInterestForHomeLoan(rateOfInterestForHomeLoan);
		this.setRateOfInterestForPersonalLoan(rateOfInterestForPersonalLoan);
		this.setRateOfInterestForSavingAccount(rateOfInterestForSavingAccount);
		this.setMinimumBalanceForSavingAccount(minimumBalanceForSavingAccount);
		this.setPenaltyForNonMinBalForSavingAccount(penaltyForNonMinBalForSavingAccount);
	}

	/**
	 * Getter method for the member variable.
	 * @return the rateOfInterestForPersonalLoan
	 */
	public float getRateOfInterestForPersonalLoan() {
		return rateOfInterestForPersonalLoan;
	}

	/**
	 * Setter method for 
	 * @param f the rateOfInterestForPersonalLoan to set
	 */
	public void setRateOfInterestForPersonalLoan(float f) {
		this.rateOfInterestForPersonalLoan = f;
	}

	/**
	 * @return the rateOfInterestForHomeLoan
	 */
	public float getRateOfInterestForHomeLoan() {
		return rateOfInterestForHomeLoan;
	}

	/**
	 * @param f the rateOfInterestForHomeLoan to set
	 */
	public void setRateOfInterestForHomeLoan(float f) {
		this.rateOfInterestForHomeLoan = f;
	}

	/**
	 * @return the rateOfInterestForSavingAccount
	 */
	public double getRateOfInterestForSavingAccount() {
		return rateOfInterestForSavingAccount;
	}

	/**
	 * @param rateOfInterestForSavingAccount the rateOfInterestForSavingAccount to set
	 */
	public void setRateOfInterestForSavingAccount(float rateOfInterestForSavingAccount) {
		this.rateOfInterestForSavingAccount = rateOfInterestForSavingAccount;
	}

	/**
	 * @return the minimumBalanceForSavingAccount
	 */
	public float getMinimumBalanceForSavingAccount() {
		return minimumBalanceForSavingAccount;
	}

	/**
	 * @param f the minimumBalanceForSavingAccount to set
	 */
	public void setMinimumBalanceForSavingAccount(float f) {
		this.minimumBalanceForSavingAccount = f;
	}

	/**
	 * @return the penaltyForNonMinBalForSavingAccount
	 */
	public float getPenaltyForNonMinBalForSavingAccount() {
		return penaltyForNonMinBalForSavingAccount;
	}

	/**
	 * @param f the penaltyForNonMinBalForSavingAccount to set
	 */
	public void setPenaltyForNonMinBalForSavingAccount(float f) {
		this.penaltyForNonMinBalForSavingAccount = f;
	}
	
	
	
	
}
