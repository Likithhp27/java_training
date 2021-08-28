package com.login.dao;
/**
 * 
 * @author likith.hp
 *
 */

import com.login.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User create(User user) {

		return null;
	}

	@Override
	public User readByUserIdAndPassword(User user) {
		// No Data base

		if (user.getUserId() == 123456 && user.getPassword().equals("password")) {
			user.setUserName("Hello");
		}
		if (user.getUserId() == 1234567 && user.getPassword().equals("security")) {
			user.setUserName("Word");
		}
		return user;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
