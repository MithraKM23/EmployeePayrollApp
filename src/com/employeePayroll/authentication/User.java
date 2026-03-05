/*
 * @author Developer
 * @version 2
 */

package com.employeePayroll.authentication;

public abstract class User {
	protected String username;
	protected String passwordHash;
	protected String role;
	
	//Initialize using constructor
	public User(String username, String password, String role) {
		this.username = username;
		this.passwordHash = PasswordUtil.hash(password);
		this.role = role;
	}
	
	//Abstract class
	public abstract boolean authenticate(String username,String password);
	
	public String getRole() {
		return role;
	}
	
	
	
}
