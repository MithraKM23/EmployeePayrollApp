/*
 * @author developer 
 * @version 2
 */

package com.employeePayroll.authentication;

public class RegularEmployee extends User{

	//Constructor using super keyword
	public RegularEmployee(String username, String password) {
		super(username, password, "EMPLOYEE");
		
	}
	
	//Authenticates the logic specific to regular employees
	@Override
	public boolean authenticate(String username,String password) {
		return this.username.equals(username) && this.passwordHash.equals(PasswordUtil.hash(password));
	}

	
}
