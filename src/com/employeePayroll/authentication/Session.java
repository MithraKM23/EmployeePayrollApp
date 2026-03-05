package com.employeePayroll.authentication;

public class Session {
	private String username;
	private long loginTime;
	private long timeoutMillis;
	public Session(String username, long timeoutMillis) {
		
		this.username = username;
		this.loginTime = System.currentTimeMillis();
		this.timeoutMillis = timeoutMillis;
	}
	
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
