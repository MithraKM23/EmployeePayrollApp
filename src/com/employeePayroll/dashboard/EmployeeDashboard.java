/*
 * @author Developer
 * @version 5
 */

package com.employeePayroll.dashboard;


import java.util.*;
import com.employeePayroll.payslip.FinalPayslip;

	public class EmployeeDashboard implements Dashboard {

	    @Override
	    public void display(ArrayList<FinalPayslip> payslips, Employee employee) {

	        System.out.println("\n=== EMPLOYEE DASHBOARD ===");
	        System.out.println("Welcome, " + employee.getName());

	        // Runtime type check
	        System.out.println("Dashboard Type: " + this.getClass().getName());

	        // Sort by Net Pay DESCENDING
	        Collections.sort(payslips, (p1, p2) -> (int)(p2.getNetPay() - p1.getNetPay()));

	        // Top 3 payslips
	        System.out.println("\nRecent Payslips (Top 3):");
	        for (int i = 0; i < payslips.size() && i < 3; i++) {
	            System.out.println(payslips.get(i).getMonth() + " : " + payslips.get(i).getNetPay());
	        }

	        // Calculate YTD earnings
	        double total = 0;
	        for (FinalPayslip p : payslips) {
	            total += p.getNetPay();
	        }

	        System.out.println("\nYear-To-Date Earnings: " + total);
	    }

}
