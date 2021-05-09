package com.training.employeeapp.model;

public class Department {

	private int id;
	private String name;

	public Department() {

	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "[Department id : " + id + " name : " + name + "]";
	}

}
