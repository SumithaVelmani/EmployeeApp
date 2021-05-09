package com.training.employeeapp.repository;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;

import com.training.employeeapp.model.Employee;
import com.training.employeeapp.model.Department;

public class EmployeeRepository implements IEmployeeRepository {

	private static Map<Integer, Employee> employeeMap;

	public EmployeeRepository() {

		Employee employee1 = new Employee(101, "Reena");
		Employee employee2 = new Employee(102, "Ramya");
		Employee employee3 = new Employee(103, "Iswariya");
		Employee employee4 = new Employee(104, "Visha");
		Department dept1 = new Department();
		dept1.setId(1);
		dept1.setName("Dev");
		employee1.setDept(dept1);
		employee2.setDept(dept1);
		Department dept2 = new Department();
		dept2.setId(1);
		dept2.setName("HpDev");
		employee3.setDept(dept2);
		employee4.setDept(dept2);

		employeeMap = new HashMap<>();
		employeeMap.put(1, employee1);
		employeeMap.put(2, employee2);
		employeeMap.put(3, employee3);
		employeeMap.put(4, employee4);
	}

	@Override
	public void add(Employee car) {

		int id = employeeMap.size() + 1;
		employeeMap.put(id, car);
	}

	@Override
	public Map<Integer, Employee> findAll() {
		return employeeMap;
	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;
		for (Map.Entry<Integer, Employee> e : employeeMap.entrySet()) {
			// System.out.println(employeeMap);
			if (e.getKey() == id) {
				// System.out.println(e.getKey());
				employee = e.getValue();
			}
		}
		return employee;
	}

	@Override
	public void update(int id, Employee employee) {
		for (Map.Entry<Integer, Employee> e : employeeMap.entrySet()) {
			if (e.getKey() == id) {
				e.getValue().setId(employee.getId());
			}
		}
	}

	@Override
	public void delete(int id) {
		Iterator<Entry<Integer, Employee>> it = employeeMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Employee> entry = it.next();
			if (entry.getKey() == id) {
				it.remove();
			}
		}

	}

}
