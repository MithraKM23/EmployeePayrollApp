/*
 * @author Developer
 * @version 3
 */

package com.employeePayroll.payslip;
//This class groups all the salary related values
public class SalaryComponents {
	double basicSalary;
	double hra;
	double da;
	double allowances;
	double pf;
	double tax;
	double netPay;
	public SalaryComponents(double basicSalary, double hra, double da, double allowances) {

		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.allowances = allowances;
	}
	
}
