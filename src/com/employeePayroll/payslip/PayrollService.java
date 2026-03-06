/*
 * @author Developer
 * @version 3
 */

package com.employeePayroll.payslip;
import com.employeePayroll.dashboard.*;

//This class contains the salary calculation logic
public class PayrollService {
	
	//Generating a payslip
	public PaySlip generatePayslip(Employee employee,String month,double basic,double hra,double da,double allowances) {
		SalaryComponents sc=new SalaryComponents(basic,hra,da,allowances);
		
		//Gross salary calculation
		double gross=basic+hra+da+allowances;
		
		//Deductions
		sc.pf=basic*0.12;
		sc.tax=gross*0.10;
		
		//NetPay
		sc.netPay=gross-(sc.pf+sc.tax);
		return new PaySlip(employee,sc,month);
	}
}
