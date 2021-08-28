package com.company.model;

/**
 * 
 * @author likith.hp
 *
 */

public class Employee {
	// Employee Fields
	private int empNo;
	private String empName;
	private int salary;

	// Constructor Using Field
	public Employee(int empNo, String empName, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	// constructor Using super
	public Employee() {
		super();

	}

	// Constructor Using Field
	public Employee(String empName, int salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	// Generate getters And setters
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
