package com.training.employeeapp.model;

public class Employee {

	private String name;
	private int id;
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDept(Department department) {
		this.department = department;
	}

	public Department getDept() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", ID=" + id + "]" + department;
	}

}
