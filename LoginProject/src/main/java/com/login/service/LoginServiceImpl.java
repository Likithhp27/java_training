package com.login.service;
/**
 * 
 * @author likith.hp
 *
 */

import com.login.dao.LoginDao;
import com.login.dao.LoginDaoImpl;
import com.login.model.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByUserIdAndPasswordService(User user) {

		// handel by database
		User userDummy = null;
		int userId = String.valueOf(user.getUserId()).length();
		int password = String.valueOf(user.getPassword()).length();
		if (user != null && userId > 5 && password > 5) {
			LoginDao loginDao = new LoginDaoImpl();
			userDummy = loginDao.readByUserIdAndPassword(user);
		}

		return userDummy;
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
