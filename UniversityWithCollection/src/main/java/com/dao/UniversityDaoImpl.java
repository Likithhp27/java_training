package com.dao;
/**
 * @author likith.hp
 */

import java.util.ArrayList;
import java.util.List;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public class UniversityDaoImpl implements UniversityDao {
	// insert the students values
	Student student1 = new Student(1, "Akshay", 101);
	Student student2 = new Student(2, "Manoj", 101);
	Student student3 = new Student(3, "Adhi", 101);
	Student student4 = new Student(4, "Abhi", 102);
	Student student5 = new Student(5, "Pinky", 102);
	Student student6 = new Student(6, "Rashmi", 102);
	// stores students in an ArrayList
	List<Student> students = new ArrayList<Student>();

	// insert the Department values
	Department department1 = new Department(101, "ECE", students);
	Department department2 = new Department(102, "CSE", students);
	// stores departments in an ArrayList
	List<Department> departments = new ArrayList<Department>();
	// insert the college values
	College college1 = new College(201, "Sit", "Tumkuru", departments);
	College college2 = new College(202, "Cit", "Tumkuru", departments);
	// stores colleges in an ArrayList
	List<College> colleges = new ArrayList<College>();

	@Override
	public Student searchStudent(Department department, int search) {
		// added into the ArrayList
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		// in the department we can add the students
		department.setStudent(students);
		Student dummyArray = null;
		List<Student> student = department.getStudent();
		for (Student stud : student) {
			if (stud.getStudId() == search) {
				dummyArray = stud;
			}
		}

		return dummyArray;
	}

	@Override
	public Department searchDepartment(College college, int search) {
		// added into the ArrayList
		departments.add(department1);
		departments.add(department2);
		// in the college we can add the departments
		college.setDepartment(departments);
		Department dummyDepartment = null;
		List<Department> department = college.getDepartment();
		for (Department depart : department) {
			if (depart.getDeptId() == search) {
				dummyDepartment = depart;
			}

		}

		return dummyDepartment;
	}

	@Override
	public College searchCollege(University university, int search) {
		// added into the ArrayList
		colleges.add(college1);
		colleges.add(college2);
		// in the university we can add the department
		university.setCollege(colleges);
		College dummyCollege = null;
		List<College> college = university.getCollege();
		for (College coll : college) {
			if (coll.getCollegeId() == search) {
				dummyCollege = coll;
			}
		}

		return dummyCollege;
	}

}
