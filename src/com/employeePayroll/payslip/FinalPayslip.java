/*
 * @author Developer
 * @version 4
 */

package com.employeePayroll.payslip;

public class FinalPayslip implements Cloneable{

	    private final String empId;
	    private final String empName;
	    private final String month;
	    private final double netPay;

	    //Constructor for the fields
	    public FinalPayslip(String empId, String empName, String month, double netPay) {
	        this.empId = empId;
	        this.empName = empName;
	        this.month = month;
	        this.netPay = netPay;
	    }
	    
	    //Get mathods for the fields
	    public String getEmpId() { return empId; }
	    public String getEmpName() { return empName; }
	    public String getMonth() { return month; }
	    public double getNetPay() { return netPay; }

	    @Override
	    public Object clone() {
	        try {
	            return (FinalPayslip) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Clone failed.");
	        }
	    }

	    //Defines logical equality between two payslips
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof FinalPayslip)) return false;

	        FinalPayslip p = (FinalPayslip) o;
	        return empId.equals(p.empId)
	                && empName.equals(p.empName)
	                && month.equals(p.month)
	                && Double.compare(netPay, p.netPay) == 0;
	    }

	    @Override
	    public int hashCode() {
	        int result = empId.hashCode();
	        result = 31 * result + empName.hashCode();
	        result = 31 * result + month.hashCode();
	        result = 31 * result + Double.hashCode(netPay);
	        return result;
	    }

	    //Converts payslip into readable text
	    @Override
	    public String toString() {
	        return "PAYSLIP\n" +
	                "Employee ID    : " + empId + "\n" +
	                "Employee Name  : " + empName + "\n" +
	                "Month          : " + month + "\n" +
	                "Net Pay        : " + netPay + "\n";
	    }
	}
