package com.brotherGivenTask.controller;

public class Employee {

	private int userId;
	private String username;
	private String email;
	public int getUserId() {
		return userId;
	}
	public Employee(int userId, String username, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
