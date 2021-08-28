package com.model;

/**
 * 
 * @author likith.hp
 *
 */

public class Student {
	private int studId;
	private String studName;
	private int dept;

	// using Default constructor
	public Student() {
		super();

	}

	// using Constructor field
	public Student(int studId, String studName, int dept) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.dept = dept;
	}

	// generate Getters/setters
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getdept() {
		return dept;
	}

	public void setdept(int dept) {
		this.dept = dept;
	}

}
