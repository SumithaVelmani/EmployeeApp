package com.training.employeeapp.exception;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		System.out.println(message);
	}
}
