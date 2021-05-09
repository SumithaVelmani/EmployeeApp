package com.training.employeeapp.test;

import java.util.Map;

import com.training.employeeapp.exception.EmployeeNotFoundException;
import com.training.employeeapp.model.Department;
import com.training.employeeapp.model.Employee;
import com.training.employeeapp.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("1.Create a New Employee");
		EmployeeService employeeService = new EmployeeService();

		Employee employee = new Employee();
		employee.setName("Sandhya");
		employee.setId(105);
		Department dept1 = new Department();
		dept1.setId(1);
		dept1.setName("Dev");
		employee.setDept(dept1);
		employeeService.createEmployee(employee);

		System.out.println("2.Find All Employees");
		Map<Integer, Employee> employees = employeeService.findAllEmployees();
		for (Map.Entry<Integer, Employee> e : employees.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		System.out.println("3.Find A Employee By Given Id");

		try {
			Employee foundEmployee = employeeService.findEmployeeById(1);
			System.out.println(foundEmployee);
		} catch (EmployeeNotFoundException e) {

		}

		System.out.println("4.Update A Employee By Given Id");
		int updateId = 5;
		Employee newEmployee = new Employee();
		newEmployee.setId(107);
		employeeService.updateEmployee(updateId, newEmployee);

		employees = employeeService.findAllEmployees();
		for (Map.Entry<Integer, Employee> c : employees.entrySet()) {
			System.out.println(c.getKey() + ": " + c.getValue());
		}

		System.out.println("5.Delete A Employee By Given Id");
		int deleteId = 5;
		employeeService.deleteEmployee(deleteId);
		employees = employeeService.findAllEmployees();
		for (Map.Entry<Integer, Employee> c : employees.entrySet()) {
			System.out.println(c.getKey() + ": " + c.getValue());
		}

	}

}
