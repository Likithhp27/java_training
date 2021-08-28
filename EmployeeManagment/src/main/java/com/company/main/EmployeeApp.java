package com.company.main;
/**
 * @author likith.hp
 */

import java.util.Scanner;

import com.company.model.Employee;
import com.company.service.EmployeeService;
import com.company.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// Scanner
		System.out.println("Search By UserId");
		System.out.println("Enter userId:");// Enter the userId
		int id = input.nextInt();
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.searchByIdser(id);// calling EmployeeService
		if (employee != null) {
			System.out.println("EmployeeId:" + employee.getEmpNo());// fetch id
			System.out.println("EmployeeName:" + employee.getEmpName());// fetch name
			System.out.println("EmployeeSalary:" + employee.getSalary());// fetch Salary
		}

		Scanner input1 = new Scanner(System.in);// Scanner
		System.out.println("Search By UserName");
		System.out.println("Enter userName:");// Enter the UserName
		String name = input1.next();
		Employee[] employee1 = employeeService.searchByNameser(name);// calling EmployeeService

		if (employee1 != null) {
			for (int i = 0; i < employee1.length; i++) {

				if (employee1[i] != null) {
					System.out.println("EmployeeId:" + employee1[i].getEmpNo());// fetch id
					System.out.println("EmployeeName:" + employee1[i].getEmpName());// fetch name
					System.out.println("EmployeeSalary:" + employee1[i].getSalary());// fetch Salary
				}
			}

		}

	}

}
