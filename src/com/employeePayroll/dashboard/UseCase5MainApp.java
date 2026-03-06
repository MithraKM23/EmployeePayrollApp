/*
 * @author Developer
 * @version 5
 */

package com.employeePayroll.dashboard;


import java.util.*;
import com.employeePayroll.payslip.*;


public class UseCase5MainApp {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("=== USE CASE 5: DASHBOARD DISPLAY ===");

		        System.out.print("Enter Employee ID: ");
		        String id = sc.nextLine();

		        System.out.print("Enter Employee Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Role (EMPLOYEE/MANAGER): ");
		        String role = sc.nextLine();

		        Employee employee = new Employee(id, name, role);

		        // Dummy payslips for demo
		        ArrayList<FinalPayslip> payslips = new ArrayList<>();
		        payslips.add(new FinalPayslip(id, name, "May", 34000));
		        payslips.add(new FinalPayslip(id, name, "Apr", 33000));
		        payslips.add(new FinalPayslip(id, name, "Mar", 32000));
		        payslips.add(new FinalPayslip(id, name, "Feb", 31000));

		        // Factory creates dashboard at runtime
		        Dashboard dash = DashboardFactory.getDashboard(role);

		        if (dash == null) {
		            System.out.println("Invalid role entered.");
		        } else {
		            dash.display(payslips, employee);
		        }
		    }



}
