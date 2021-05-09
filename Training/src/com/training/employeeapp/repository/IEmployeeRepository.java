package com.training.employeeapp.repository;

import java.util.Map;

import com.training.employeeapp.model.Employee;

public interface IEmployeeRepository {

	public void add(Employee car);

	public Map<Integer, Employee> findAll();

	public Employee findById(int id);

	public void update(int id, Employee employee);

	public void delete(int id);

}
