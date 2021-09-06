package serviceLayer;

import java.util.HashMap;

import java.util.Set;
import models.User;

public class UserService {
	
	private String name;
	private int id;
	
	
	
	public UserService(String name, HashMap<Integer, Integer> accounts) {
		this.name = name;
		this.accounts = accounts;
	
	public static void main(String[] args) {
		/**
	 * Get method to return list of accounts based on specified amount: Less Than,
	 * Greater Than, and Between a Range are the 3 following methods.
	 * @param amount Amount that is being compared
	 * @return Resulting HashMap
	 */
	public HashMap<Integer, Integer> getAccountsLT(int amount) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		Set<Integer> acctID = accounts.keySet();
		for (int id : acctID) {
			int balance = accounts.get(id);
			if (balance <= amount) {
				result.put(id, balance);
			}
		}
		return result;
	}
	
	public HashMap<Integer, Integer> getAccountsGT(int amount) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		Set<Integer> acctID = accounts.keySet();
		for (int id : acctID) {
			int balance = accounts.get(id);
			if (balance >= amount) {
				result.put(id, balance);
			}
		}
		return result;
	}

	public HashMap<Integer, Integer> getAccountsRange(int minAmount, int maxAmount) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		Set<Integer> acctID = accounts.keySet();
		for (int id : acctID) {
			int balance = accounts.get(id);
			if (balance >= minAmount && balance <= maxAmount) {
				result.put(id, balance);
			}
		}
		return result;
	}
	
	//adding or removing accounts for client
	public void addAccount(int id, int balance) {
		accounts.put(id, balance);
	}
	
	public void removeAccount(int id) {
		accounts.remove(id);
	}
	
	//adding or removing from balance, transfer uses the combination of both
	/**
	 * Method that adds specified amount to client's specified account.
	 * @param accountID ID that specifies which account client wishes to add
	 * @param amount Amount that client wishes to add
	 */
	public void addAmount(int accountID, int amount) {
		Set<Integer> acctID = accounts.keySet();
		for (int id : acctID) {
			if (id == accountID) {
				int balance = accounts.get(id);
				balance += amount;
				accounts.replace(id, balance);
			}
		}
	}
	
	public void removeAmount(int accountID, int amount) {
		Set<Integer> acctID = accounts.keySet();
		for (int id : acctID) {
			if (id == accountID) {
				int balance = accounts.get(id);
				balance -= amount;
				accounts.replace(id, balance);
			}
		}
	}

}

	}
	