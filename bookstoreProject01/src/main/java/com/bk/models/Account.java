package com.bk.models;

public class Account {
	int account_id;
	String name;
	String lastName;
	String email;
	String password;	
	
	
	
	
	public Account( int account_id, String email, String password, String name, String lastName) {
		// TODO Auto-generated constructor stub
		this.account_id = account_id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public Account(String name, String lastName, String email, String password) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	

	
}
