package edu.postech.csed332.homework1;

/**
 *  This interface contains the information needed to represent an account,
 *  and must be implemented by the HighInterest and LowInterest class.
 */
interface Account {
	/**
	 *  Returns the account number 
	 *  
	 *  @return the account number
	 */
	double getAccountNumber();
	/**
	 *  Returns the account balance 
	 *  
	 *  @return the balance
	 */
	double getBalance();
	
	/**
	 *  Returns the account owner name 
	 *  
	 *  @return the owner name
	 */
	String getOwner();
	
	/**
	 *  This function is for updating the balance according to the interest rate and 
	 *  	elapsed date. 
	 *  
	 *  @param elapsedDate elapsed date
	 */
	void updateBalance(int elapsedDate);
	
	/**
	 *  Add as much money as a given amount factor to the given account 
	 *  
	 *  @param amount deposit amount
	 */
	void deposit(double amount);
	
	/**
	 *  Withdraw as much money as a given amount factor to the given account. 
	 *  	You have to use exception handler to handle the case that the balance 
	 *  of account is smaller than the amount of money that you want to withdraw.
	 *  Please use NegativeException we gave you.
	 *  
	 *  @param amount withdraw amount 
	 */
	void withdraw(double amount) throws NotEnoughException;
}
