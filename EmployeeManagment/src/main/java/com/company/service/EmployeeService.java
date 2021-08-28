package com.company.service;
/**
 * @author likith.hp
 */

import com.company.model.Employee;

public interface EmployeeService {
	//Abstract method
	public abstract	Employee searchByIdser(int empId);
	public abstract Employee[] searchByNameser(String name);


}
