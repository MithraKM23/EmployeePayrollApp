/*
 * @author Developer
 * @version 6
 */

package com.employeePayroll.validation;

import java.util.Scanner;

public class UseCase6ValidationApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("=== USE CASE 6: INPUT VALIDATION ===");

	        try {

	            System.out.print("Enter Employee ID (EMP-XXXX): ");
	            String empId = sc.nextLine();
	            ValidationService.validateEmployeeId(empId);

	            System.out.print("Enter Email: ");
	            String email = sc.nextLine();
	            ValidationService.validateEmail(email);

	            System.out.print("Enter Phone Number: ");
	            String phone = sc.nextLine();
	            ValidationService.validatePhone(phone);

	            System.out.print("Create Password: ");
	            String password = sc.nextLine();
	            ValidationService.validatePassword(password);

	            System.out.println("\nAll inputs are VALID. Registration/Login can proceed.");

	        } catch (ValidationException e) {
	            System.out.println("\n" + e.getMessage());
	            System.out.println("Please try again.");
	        }
	    }
}
