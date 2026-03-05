/*
 * @author Developer
 * @version 1
 */


//This class is responsible for checking the input correctness
package com.employeePayroll.validation;

import java.util.regex.Pattern;

public class Validator {
	
	//Checks whether an email follows a valid format
	public static void validateEmail(String email) throws ValidationException{
		String emailRegex="^[A-Za-z0-9_.-]+@(.+)$";
		if(!Pattern.matches(emailRegex, email)) {
			throw new ValidationException("Invalid Email Format");
		}
	}
	
	//Validates Employee ID fomat
	public static void validateEmpId(String empId) throws ValidationException{
		String empRegex ="^EMP-[0-9]{4}$";
		if(!Pattern.matches(empRegex, empId)) {
			throw new ValidationException("Employee ID must be in format EMP-XXXX");
		}
	}
	
	//Validates an Indian phone number by starting with 6,7,8 or 9
	public static void validatePhone(String phone) throws ValidationException{
		String phoneRegex="^[6-9][0-9]{9}$";
		if(!Pattern.matches(phoneRegex, phone)) {
			throw new ValidationException("Invalid Phone Number");
		}
		
	}
}
