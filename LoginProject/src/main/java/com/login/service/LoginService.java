package com.login.service;
/**
 * 
 * @author likith.hp
 *
 */

import com.login.model.User;

public interface LoginService {
	public abstract User create(User user);// save data

	public abstract User readByUserIdAndPasswordService(User user);// read data

	public abstract User update(User user);// update data

	public abstract User delete(int userId);// delete data

}
