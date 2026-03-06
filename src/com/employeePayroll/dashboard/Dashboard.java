/*
 * @author Developer
 * @version 5
 */

package com.employeePayroll.dashboard;

import java.util.ArrayList;

import com.employeePayroll.payslip.FinalPayslip;

public interface Dashboard {
	void display(ArrayList<FinalPayslip> payslips, Employee employee);

}
