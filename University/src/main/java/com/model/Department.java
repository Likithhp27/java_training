package com.model;
/**
 * @author likith.hp
 */

public class Department {
	private int deptId;
	private String deptName;
	private Student[] student;

	// using Default constructor
	public Department() {
		super();
		
	}

	// using Constructor field
	public Department(int deptId, String deptName, Student[] student) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
	}

	// generate Getters/setters
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String string) {
		this.deptName = string;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

}
