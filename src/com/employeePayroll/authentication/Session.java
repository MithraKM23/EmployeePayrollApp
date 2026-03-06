/*
 * @author Developer
 * @version 2
 */

package com.employeePayroll.authentication;

public class Session {
	private String username;
	private long loginTime;
	private long timeoutMillis;
	
	//Initializing through constructors
	public Session(String username, long timeoutMillis) {
		
		this.username = username;
		this.loginTime = System.currentTimeMillis();
		this.timeoutMillis = timeoutMillis;
	}
	
	//Checks whether the session is valid
	public boolean isExpired() {
		long currentTime=System.currentTimeMillis();
		return (currentTime-loginTime)>timeoutMillis;
	}
	
	public String getUsernam() {
		return username;
	}
	
	@Override
	public String toString() {
		return "Session active for user: "+username;
	}
}
