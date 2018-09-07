package edu.postech.csed332.homework1;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The Bank class has all account information that have been created so far. The
 * account number is start at 100000. If first person creates an account at
 * first, his account number is 100000 and the account number of second person
 * who creates an account at second time is 100001. Use accs for findAccount.
 * Use accsByName for findAccountByName.
 */
public class Bank {
	String name;
	int accNumCounter;
	Map<Integer, Account> accs;
	Map<String, Account> accsByName;

	/**
	 * Creates a new bank with the given name
	 * 
	 * @param bankname the name of bank
	 */
	Bank(String bankname) {
		// TODO implement this
	}

	/**
	 * Find the accounts in a given interval of account number.
	 * 
	 * @param lower  lower bound of the searching interval
	 * @param upper upper bound of the searching interval
	 * @return list of accounts in the given interval
	 */
	List<Account> findAccountsInInterval(int lower, int upper) {
		// TODO implement this
	}

	/**
	 * Find the account by owner's name. You have to use exception handler to handle
	 * the case that if given account number does not exist. Please use
	 * NotFoundException we gave you. If multiple accounts are found by the given
	 * name, return the account with lowest account number.
	 * 
	 * @param name looking account owner's name
	 * @return requested account
	 */
	Account findAccountByName(String name) throws NotFoundException {
		// TODO implement this
	}

	/**
	 * Creates a new account with the given person name, the type of account, and
	 * initial balance. 
	 * 
	 * @param name    owner name
	 * @param accType kind of account
	 * @param initial initial balance of account
	 * @return the created account
	 */
	Account createAccount(String name, ACCTYPE accType, double initial) {
		// TODO implement this
	}

	/**
	 * Fine the account which the highest balance. You have to use exception handler
	 * to handle the case that if there is no account in the bank. Please use
	 * EmptyException we gave you. If there are several accounts with the same
	 * maximum balance, return the lowest account number.
	 */
	Account maxBalance() throws EmptyException {
		// TODO implement this
	}

	/**
	 * Transfer the money as much as given amount factor from src account to dst
	 * account. You have to use exception handler to handle the case that the
	 * balance of source account is smaller than amount of money to send. Please use
	 * NegativeException we gave you. (You can not send money from one bank to
	 * another.
	 * 
	 * @param src    the account to send money
	 * @param dst    the account to receive money
	 * @param amount amount of money to send
	 */
	void transfer(Account src, Account dst, double amount) throws NotEnoughException {
		// TODO implement this
	}

	public static void main(String[] args) {
		int errCtr = 0;
		Bank wb = new Bank("SDBank");

		/**
		 * Test case 1. Checking correctness of a high interest account accruement.
		 */
		Account s;
		s = wb.createAccount("Thomas", ACCTYPE.HIGH, 90000.);
		s.deposit(10000.);
		double expected = 122019.00399479672;
		s.updateBalance(20);
		double result = s.getBalance();
		if (expected != result) {
			System.out.println("Your implementation is certainly wrong (#1)");
			errCtr++;
		}

		/**
		 * Test case 2. Checking correctness of the findAccountsInInterval method.
		 */

		List<Account> reqList = new ArrayList<Account>();
		reqList = wb.findAccountsInInterval(100000, 100010);
		if(reqList.size() != 1 || !reqList.get(0).getOwner().equals("Thomas")) {
			System.out.println("Your implementation is certainly wrong (#2)");
			errCtr++;
		}
		

		/**
		 * Test case 3. Checking correctness of the withdraw method.
		 */
		try {
			s.withdraw(200000);
			System.out.println("Your implementation is certainly wrong (#3)");
			errCtr++;
		} catch (NotEnoughException e) {
		}

		/**
		 * Test case 4. Checking correctness of the maxBalance method.
		 */
		Bank eb = new Bank("EmptyBank");
		try {
			eb.maxBalance();
			System.out.println("Your implementation is certainly wrong (#4)");
			errCtr++;
		} catch (EmptyException e) {
		}

		if (errCtr > 0) {
			System.out.println(Integer.toString(errCtr) + " error(s) found.");
			return;
		}

		System.out.println("Your implementation looks fine at a glance, but there");
		System.out.println("is no guarantee that your implementation is correct.");
		System.out.println("It is your job to ensure the correctness by thorough testing.");
	}

}
