/*
 * @author Developer
 * @version 3
 */

package com.employeePayroll.payslip;

import java.util.Scanner;
import com.employeePayroll.dashboard.*;

//This is the main class for use case 3
//This is the entry point for payslip generation
public class UseCase3PayslipApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=== USE CASE 3: PAYSLIP GENERATION ===");
		
		System.out.println("Enter Employee ID: ");
		String empid=sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter month (eg. January 2026): ");
		String month=sc.nextLine();
		
		System.out.println("Enter basic Salary: ");
		double basic=sc.nextDouble();
		
		System.out.println("Enter HRA: ");
		double hra=sc.nextDouble();
		
		System.out.println("Enter DA: ");
		double da=sc.nextDouble();
		
		System.out.println("Enter Allowances: ");
		double allowances=sc.nextDouble();
		
		Employee emp=new Employee(empid,name);
		PayrollService service=new PayrollService();
		PaySlip payslip=service.generatePayslip(emp, month, basic, hra, da, allowances);
		System.out.println(payslip);
		
	}
}
