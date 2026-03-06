/*
 * @author Developer
 * @version 5
 */

package com.employeePayroll.dashboard;
	
import java.util.*;
import com.employeePayroll.payslip.FinalPayslip;

	public class ManagerDashboard implements Dashboard {

	    @Override
	    public void display(ArrayList<FinalPayslip> payslips, Employee employee) {

	        System.out.println("\n=== MANAGER DASHBOARD ===");
	        System.out.println("Manager: " + employee.getName());

	        // Runtime type info
	        System.out.println("Dashboard Type: " + this.getClass().getName());

	        // Total team YTD earnings
	        double total = 0;
	        for (FinalPayslip p : payslips) {
	            total += p.getNetPay();
	        }

	        System.out.println("\nTeam Total YTD Earnings: " + total);
	    }
	
}
