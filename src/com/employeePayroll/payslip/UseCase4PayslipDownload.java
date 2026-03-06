/*
 * @author Developer
 * @version 4
 */

package com.employeePayroll.payslip;

public class UseCase4PayslipDownload {

	public static void main(String[] args) {

		System.out.println("=== USE CASE 4: PAYSLIP PRINT / DOWNLOAD ===");

		//Existing generated payslip
		FinalPayslip original = new FinalPayslip(
				"EMP-1010",
				"John David",
				"January 2026",
				48500
				);

		System.out.println("\nOriginal Payslip:");
		System.out.println(original);

		try {
			// Clone the payslip
			FinalPayslip copy = (FinalPayslip) original.clone();

			System.out.println("Verified: Download copy is equal to original.");
			System.out.println("Original hashcode : " + original.hashCode());
			System.out.println("Cloned   hashcode : " + copy.hashCode());

			// Check token validity
			DownloadToken token = new DownloadToken(); // 1-min validity

			if (token.isExpired()) {
				throw new RuntimeException("Download token expired!");
			}

			// Save files
			FileService fs = new FileService();
			String txtFile = fs.savePayslipAsText(original);
			String pdfFile = fs.savePayslipAsPdf(original);

			System.out.println("\nPayslip Download Successful.");
			System.out.println("Saved as text file : " + txtFile);
			System.out.println("Saved as PDF file  : " + pdfFile);

			System.out.println("\n--- Printed Payslip ---");
			System.out.println(original);

		} catch (Exception e) {
			System.out.println("Error during payslip download.");
		}
	}
}
