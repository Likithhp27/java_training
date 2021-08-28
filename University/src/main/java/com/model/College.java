package com.model;

/**
 * @author likith.hp
 */

public class College {
	private int collegeId;
	private String collegeName;
	private String place;
	private Department[] department;

	// using Default constructor
	public College() {
		super();

	}

	// using Constructor field
	public College(int collegeId, String collegeName, String place, Department[] department) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.place = place;
		this.department = department;
	}

	// generate Getters/setters
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}

}
