package com.company.service;
/**
 * @author likith.hp
 */

import com.company.dao.EmployeeDao;
import com.company.dao.EmployeeDaoImpl;
import com.company.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee searchByIdser(int empId) {
		// Handle by database
		Employee employeeDummy =null;
		EmployeeDao employeeDao  =new EmployeeDaoImpl();
		employeeDummy=employeeDao.searchById(empId);
		return employeeDummy;
	}

	@Override
	public Employee[] searchByNameser(String name) {
		// Handle by database
	        Employee[] dummyArray=null;
	        EmployeeDao employeeDao = new EmployeeDaoImpl();
	        dummyArray=employeeDao.searchByName(name);
	        return dummyArray;
	    }

	
	

}
