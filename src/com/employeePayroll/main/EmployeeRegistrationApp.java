/*
 * @author Developer
 * @version 1
 * 
 * This is the entry point for use case 1
 * 
 * Execution flow:
 * 1. take input from user
 * 2. validate input
 * 3. create objects
 * 4. persist data
 * 5. Display confirmation
 */

package com.employeePayroll.main;

import java.io.IOException;
import java.util.Scanner;

import com.employeePayroll.dashboard.Employee;
import com.employeePayroll.validation.ValidationException;
import com.employeePayroll.validation.Validator;

public class EmployeeRegistrationApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("=== USE CASE 1: EMPLOYEE REGISTRATION ===");
			
			System.out.print("Enter Employee ID (EMP-XXXX): ");
			String empId=sc.nextLine();
			
			Validator.validateEmpId(empId);
			
			System.out.print("Enter Name: ");
			String name=sc.nextLine();
			
			System.out.print("Enter Email: ");
			String email=sc.nextLine();
			
			Validator.validateEmail(email);
			
			System.out.print("Enter phone (10 digits starting 6-9): ");
			String phone=sc.nextLine();
			
			Validator.validatePhone(phone);
			
			Employee employee=new Employee(empId,name,email,phone);
			
			employee.persist();
			
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println("Employee Registered successfully:");
			System.out.println(employee);
			System.out.println();
			System.out.println("Data persisted in file: employee_data.txt");
			System.out.println("-----------------------------------");
		}
		catch(ValidationException e) {
			System.out.println("Validation Error: "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("File Error: "+e.getMessage());
		}
		sc.close();

	}

}
