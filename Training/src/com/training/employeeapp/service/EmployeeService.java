package com.training.employeeapp.service;

import java.util.Map;

import com.training.employeeapp.exception.EmployeeNotFoundException;
import com.training.employeeapp.model.Employee;
import com.training.employeeapp.repository.EmployeeRepository;

public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService() {
		employeeRepository = new EmployeeRepository();
	}

	public void createEmployee(Employee employee) {
		employeeRepository.add(employee);
	}

	public Map<Integer, Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		Employee employee = employeeRepository.findById(id);
		if (employee == null) {
			throw new EmployeeNotFoundException("Employee is not found");
		} else {
			return employee;
		}
	}

	public void updateEmployee(int id, Employee employee) {
		employeeRepository.update(id, employee);
	}

	public void deleteEmployee(int id) {
		employeeRepository.delete(id);
	}

}
