/*
 * @author Developer
 * @version 6
 */

package com.employeePayroll.validation;

public class ValidationService {

	    // EMP-0001 pattern
	    public static void validateEmployeeId(String empId) throws InvalidEmpidException {
	        if (empId == null || !empId.matches("^EMP-[0-9]{4}$")) {
	            throw new InvalidEmpidException(
	                "Invalid Employee ID. Expected format: EMP-XXXX"
	            );
	        }
	    }

	    // Email validation
	    public static void validateEmail(String email) throws InvalidEmailException {
	        String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	        if (email == null || !email.matches(pattern)) {
	            throw new InvalidEmailException("Invalid Email Format.");
	        }
	    }

	    // Phone: 10-digit Indian phone number
	    public static void validatePhone(String phone) throws InvalidPhoneException {
	        if (phone == null || !phone.matches("^[6-9][0-9]{9}$")) {
	            throw new InvalidPhoneException("Invalid Phone Number. Must be 10 digits.");
	        }
	    }

	    // Password strength: Min 6 chars, one uppercase, one digit, one special char
	    public static void validatePassword(String pass) throws WeakPasswordException {
	        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&]).{6,}$";

	        if (pass == null || !pass.matches(pattern)) {
	            throw new WeakPasswordException(
	                "Weak Password. Must contain uppercase, number, and special char."
	            );
	        }
	    }
}
