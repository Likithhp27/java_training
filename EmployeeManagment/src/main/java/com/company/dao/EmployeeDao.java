package com.company.dao;
/**
 * @author likith.hp
 */

import com.company.model.Employee;

public interface EmployeeDao {
	//Abstract method
	public abstract	Employee searchById(int empId);
	public abstract Employee[] searchByName(String name);
}
