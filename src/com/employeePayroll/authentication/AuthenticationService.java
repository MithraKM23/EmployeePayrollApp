/*
 * @author Developer
 * @version 2
 */

//this class handles the login related operations
package com.employeePayroll.authentication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthenticationService {
	private Map<String,User> users = new HashMap<>();
	private int maxAttempts=3;
	public AuthenticationService() {
		
		//These are the predefined users
		users.put("emp1",new RegularEmployee("emp1","Emp@1234"));
		users.put("manager1", new Manager("manager1","Mng@1234"));
	}
	
	//Handles the complete login flow
	public Session login() {
		Scanner sc=new Scanner(System.in);
		int attempts=0;
		while(attempts<maxAttempts) {
			System.out.println("Enter username: ");
			String username=sc.nextLine();
			
			System.out.println("Enter Password: ");
			String password=sc.nextLine();
			
			User user=users.get(username);
			if(user != null && user.authenticate(username, password)) {
				System.out.println("\nLogin Successful");
				System.out.println("Role: "+user.getRole());
				
				showDashboard(user.getRole());
				return new Session(username,600000);
			}
			attempts++;
			System.out.println("Invalid credentials. Attempts left: "+(maxAttempts-attempts));
		}
		return null;
	}
	
	//Displays dashboard based on user role
	public void showDashboard(String role) {
		System.out.println("\n==========DASHBOARD===========");
		
		if(role.equals("EMPLOYEE")){
			System.out.println("Employee Dashboard");
			System.out.println("View payslip | Update Profile");
		}
		else if(role.equals("MANAGER")) {
			System.out.println("Manager Dashboard");
			System.out.println("View Reports | Manage Employees");
		}
	}
	
}
