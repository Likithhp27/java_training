package com.model;

/**
 * 
 * @author likith.hp
 *
 */

public class University {
	private int uId;
	private String uName;
	private College[] college;

	// using Default constructor
	public University() {
		super();

	}

	// using Default constructor
	public University(int uId, String uName, College[] college) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.college = college;
	}

	// generate Getters/setters
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public College[] getCollege() {
		return college;
	}

	public void setCollege(College[] college) {
		this.college = college;
	}

}
