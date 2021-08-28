package com.login.dao;
/**
 * 
 * @author likith.hp
 *
 */

import com.login.model.User;

public interface LoginDao {

	public abstract User create(User user);// save data

	public abstract User readByUserIdAndPassword(User user);// save data

	public abstract User update(User user);// save data

	public abstract User delete(int userId);// save data

}
