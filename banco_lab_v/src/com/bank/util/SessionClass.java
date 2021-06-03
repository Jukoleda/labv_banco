package com.bank.util;

public class SessionClass {
	
	
	private String email;
	private String pass;
	public SessionClass(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	public SessionClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
