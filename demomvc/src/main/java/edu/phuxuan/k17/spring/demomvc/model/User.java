package edu.phuxuan.k17.spring.demomvc.model;

public class User {
	public User(String fullName) {
		super();
		this.fullName = fullName;
	}
	
	public User() {
	}
	
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
