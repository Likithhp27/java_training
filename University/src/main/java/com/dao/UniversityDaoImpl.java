package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public class UniversityDaoImpl implements UniversityDao {

	Student student1 = new Student(1, "Akshay", 101);
	Student student2 = new Student(2, "Manoj", 101);
	Student student3 = new Student(3, "Adhi", 101);
	Student student4 = new Student(4, "Abhi", 102);
	Student student5 = new Student(5, "Pinky", 102);
	Student student6 = new Student(6, "Rashmi", 102);

	Student[] students = new Student[6];
	/*
	 * List<Student> students = new ArrayList<Student>();
	 */
	Department department1 = new Department(101, "ECE", students);
	Department department2 = new Department(102, "CSE", students);

	Department[] departments = new Department[2];

	College college1 = new College(201, "Sit", "Tumkuru", departments);
	College college2 = new College(202, "Cit", "Tumkuru", departments);

	College[] colleges = new College[2];

	@Override
	public Student searchStudent(Department department, int search) {
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		students[5] = student6;
		department.setStudent(students);
		Student dummyArray = null;
		Student[] student = department.getStudent();
		for (int i = 0; i < student.length; i++) {
			if (student[i].getStudId() == search) {
				dummyArray = student[i];

			}

		}
		return dummyArray;
	}

	@Override
	public Department searchDepartment(College college, int search) {
		departments[0] = department1;
		departments[1] = department1;
		college.setDepartment(departments);
		Department[] department = college.getDepartment();
		Department dummyDepartment = null;
		for (int i = 0; i < department.length; i++) {
			if (department[i].getDeptId() == search) {
				dummyDepartment = department[i];
			}

		}
		return dummyDepartment;
	}

	@Override
	public College searchCollege(University university, int search) {
		colleges[0] = college1;
		colleges[1] = college2;
		university.setCollege(colleges);
		College[] college = university.getCollege();
		College dummyCollege = null;
		for (int i = 0; i < college.length; i++) {
			if (college[i].getCollegeId() == search) {
				dummyCollege = college[i];
			}

		}

		return dummyCollege;
	}

}

/*
 * @Override public Student searchStudent(University university, int search) {
 * 
 * 
 * 
 * 
 * 
 * return null; }
 */

/*
 * @Override public Student searchStudent1(Department[] departments, int search)
 * { for (int i = 0; i < departments.length; i++) { Department department3 =
 * departments[i];
 * 
 * } Department[] departments = new Department[2]; students[0]=student1;
 * students[1]=student2; students[2]=student3; students[3]=student4;
 * students[4]=student5; students[5]=student6;
 * 
 * 
 * 
 * departments.setStudent(students);
 * 
 * Student dummyArray=null; Student[] student= department.getStudent(); for (int
 * i = 0; i < student.length; i++) { if(student[i].getStudId()==search) {
 * dummyArray= student[i];
 * 
 * 
 * }
 * 
 * } return dummyArray;
 * 
 * }
 * 
 * @Override public Student searchStudent2(College college, int search) { //
 * TODO Auto-generated method stub return null; }
 */
/*
 * }
 * 
 * }
 */
