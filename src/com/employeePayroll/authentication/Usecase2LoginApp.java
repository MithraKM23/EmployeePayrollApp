/*
 * @author Developer
 * @version 2
 */

package com.employeePayroll.authentication;


//Main class for use case 2
public class Usecase2LoginApp {
	public static void main(String[] args) {
		System.out.println("===USE CASE 2: EMPLOYEE AUTHENTICATION & LOGIN ===\n");
		AuthenticationService auth=new AuthenticationService();
		Session session =auth.login();
		
		//If session is not null checking whether the session is active or expired.
		if(session!=null) {
			System.out.println();
			System.out.println(session);
			if(!session.isExpired()) {
				System.out.println("Session active and valid");
			}
			else {
				System.out.println("Session expired");
			}
		}
		else {
			System.out.println("Login failed");
		}
	}
}
