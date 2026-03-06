/*
 * @author Developer
 * @version 4
 */

package com.employeePayroll.payslip;

import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	
	//Saves payslip as a textFile
	    public String savePayslipAsText(FinalPayslip p) throws IOException {
	        String file = "Payslip_" + p.getEmpId() + "_" + System.currentTimeMillis() + ".txt";

	        FileWriter fw = new FileWriter(file);
	        fw.write(p.toString());
	        fw.close();

	        return file;
	    }
	    
	    //Saves payslip as a PDF

	    public String savePayslipAsPdf(FinalPayslip p) throws IOException {
	  
	        String file = "Payslip_" + p.getEmpId() + "_" + System.currentTimeMillis() + ".pdf";

	        FileWriter fw = new FileWriter(file);
	        fw.write("PDF PAYSILP CONTENT:\n\n");
	        fw.write(p.toString());
	        fw.close();

	        return file;
	    }
	

}
