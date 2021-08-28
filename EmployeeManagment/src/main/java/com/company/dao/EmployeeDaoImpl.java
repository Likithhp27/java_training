package com.company.dao;
/**
 * @author likith.hp
 */

import com.company.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee searchById(int empId) {
		Employee employee = new Employee(1, "Likith", 72000);// Hard coding value
		Employee employee1 = new Employee(2, "Abhi", 62000);// Hard coding value

		Employee[] employees = new Employee[2];// Stored in Employee Array
		employees[0] = employee;
		employees[1] = employee1;

		System.out.println("No of employess:" + employees.length);// display employee length
		Employee tempEmployee = null;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpNo() == empId) {
				// sucess
				tempEmployee = employees[i];
			} else {

				// failure
			}

		}

		return tempEmployee;

	}

	@Override
	public Employee[] searchByName(String name) {
		Employee employee1 = new Employee(1, "Likith", 100);// Hard coding value
		Employee employee2 = new Employee(2, "Likith", 900);// Hard coding value
		Employee employee3 = new Employee(3, "Abhi", 900);// Hard coding value
		Employee[] employees = new Employee[3];// Stored in Employee Array
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		System.out.println("No of employess:" + employees.length);// display employee length

		Employee[] dummyArray = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpName().equals(name)) {
				dummyArray[i] = employees[i];
			}
		}
		return dummyArray;

	}

}
