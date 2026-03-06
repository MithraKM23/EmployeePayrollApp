/*
 * @author Developer
 * @version 2
 */

package com.employeePayroll.authentication;

public class Manager extends User{

	//Constructor using super keyword
	public Manager(String username, String passwordHash) {
		super(username, passwordHash,"MANAGER");
		
	}
	
	//Manager authenticates logic
	@Override
	public boolean authenticate(String username,String password) {
		return this.username.equals(username) && this.passwordHash.equals(PasswordUtil.hash(password));
	}

}
