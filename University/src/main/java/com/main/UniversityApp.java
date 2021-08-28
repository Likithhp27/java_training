package com.main;
/**
 * @author likith.hp
 */

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.UniversityService;
import com.service.UniversityServiceImpl;

public class UniversityApp {

	public static void main(String[] args) {

		University university = new University();
		university.setuId(301);// insert the university id
		university.setuName("VTU");// insert the university name
		System.out.println("University id:" + university.getuId());// display the university id
		System.out.println("University name:" + university.getuName());// display the university name
		UniversityService universityService2 = new UniversityServiceImpl();
		College college1 = universityService2.searchCollege(university, 201);
		if (college1 != null) {
			// fetch by college
			System.out.println("College Id:" + college1.getCollegeId());// display college id;
			System.out.println("College Name:" + college1.getCollegeName());// display college Name;
			System.out.println("College Student:" + college1.getPlace());// display college place

		}
		College college = new College();
		UniversityService universityService1 = new UniversityServiceImpl();
		Department department1 = universityService1.searchDepartment(college, 101);
		if (department1 != null) {
			// fetch by Department
			System.out.println("DEpatment Id: " + department1.getDeptId());// display DepartmentId
			System.out.println("DEpatment Name: " + department1.getDeptName());// display Department name
			// System.out.println("DEpatment Student: " + department1.getStudent());
		}
		Department department = new Department();
		UniversityService universityService = new UniversityServiceImpl();
		Student student = universityService.searchStudent1(department, 6);

		if (student != null) {
			// fetch by student
			System.out.println("student id:" + student.getStudId());// display studentId
			System.out.println("student Name:" + student.getStudName());// display Student Name
			// System.out.println("student dept:" + student.getdept());
		}
	}

}
