package com.model;
/**
 * @author likith.hp
 */

import java.util.List;

public class Department {
	private int deptId;
	private String deptName;
	private List<Student> student;

	// using Default constructor
	public Department() {
		super();
	}

	// using Constructor field
	public Department(int deptId, String deptName, List<Student> student) {
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

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
