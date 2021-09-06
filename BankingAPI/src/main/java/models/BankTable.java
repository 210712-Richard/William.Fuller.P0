package models;
import models.User;
import java.util.HashMap;
import java.util.Map;

public class BankTable {
	private int id;
	private String name;
	private HashMap <Integer, Integer> accounts;
	
	public BankTable() {
		
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccount(HashMap <Integer, Integer> account) {
		this.accounts = accounts;
	}
	public Map getAccount() {
		return this.accounts;
	}
	
}
