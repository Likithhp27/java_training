package com.login.model;

/**
 * 
 * @author likith.hp
 *
 */

public class User {
	private int userId;
	private String userName;
	private String password;

	// Generate getters/setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
