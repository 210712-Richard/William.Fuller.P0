package models;

import java.util.HashMap;
import java.util.Set;

public class User {
	private String name;
	private int id;
	//hashmap of accounts <AccountID, Balance>
	//(AccountID will be randomly assigned)
	private HashMap<Integer, Integer> accounts = new HashMap<Integer, Integer>();
	
	public User() {
		
	}
	public User(String name, HashMap<Integer, Integer> accounts) {
		this.name = name;
		this.accounts = accounts;
	}
	
	public User(String name, int id) {
		this(name, new HashMap<Integer, Integer>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<Integer, Integer> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<Integer, Integer> accounts) {
		this.accounts = accounts;
	}
	
	//maybe these methods below can be somewhere else? not entirely sure
	
	
}