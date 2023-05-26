package com.bk.models;

public class User{
	
	int user_id;
	String name;
	String email;
	private String password;

	public User(int user_id, String name, String email,  String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		
	}
	public User(  String email,  String password) {
		super();
		
		
		this.email = email;
		this.password = password;
		
	}

	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
