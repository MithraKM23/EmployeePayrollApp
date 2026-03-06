/*
 * @author Developer
 * @version 3
 */

package com.employeePayroll.payslip;
import com.employeePayroll.dashboard.*;
public class PaySlip {
	private Employee employee;   //Aggregation
	private SalaryComponents Components;          //Composition
	private String month;
	
	public PaySlip(Employee employee, SalaryComponents components, String month) {
		this.employee = employee;
		Components = components;
		this.month = month;
	}

	
	//Format Payslip information into a readable format
	@Override
	public String toString() {
		return "\n==============PAYSLIP===============\n"
				+"Month        :"+month+"\n"
				+"Employee ID  :"+employee.getEmpId()+"\n"
				+"Employee Name:"+employee.getName()+"\n"
				
				+"\n--------- Earnings-----------\n"
				+"Basic Salary :"+Components.basicSalary+"\n"
				+"HRA          :"+Components.hra+"\n"
				+"DA           :"+Components.da+"\n"
				+"Allowances   :"+Components.allowances+"\n"
				
				+"\n-----------Deductions---------\n"
				+"PF           :"+Components.pf+"\n"
				+"Tax          :"+Components.tax+"\n"
				
				+"\nNet pay    :"+Components.netPay+"\n"
				+"===================================\n";
	}
}
