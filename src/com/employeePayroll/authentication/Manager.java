package com.employeePayroll.authentication;

public class Manager extends User{

	public Manager(String username, String passwordHash) {
		super(username, passwordHash,"MANAGER");
		
	}
	
	@Override
	public boolean authenticate(String username,String password) {
		return this.username.equals(username) && this.passwordHash.equals(PasswordUtil.hash(password));
	}

}
