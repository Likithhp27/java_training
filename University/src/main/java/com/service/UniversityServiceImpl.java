package com.service;

import com.dao.UniversityDao;
import com.dao.UniversityDaoImpl;
import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public class UniversityServiceImpl implements UniversityService {

	@Override
	public Student searchStudent1(Department department, int search) {
		Student student1 = null;
		UniversityDao universityDao = new UniversityDaoImpl();
		student1 = universityDao.searchStudent(department, search);
		// TODO Auto-generated method stub
		return student1;
	}

	@Override
	public Department searchDepartment(College college, int search) {
		Department department = null;
		UniversityDao universityDao = new UniversityDaoImpl();
		department = universityDao.searchDepartment(college, search);
		return department;
	}

	@Override
	public College searchCollege(University university, int search) {
		College college = null;
		UniversityDao universityDao = new UniversityDaoImpl();
		college = universityDao.searchCollege(university, search);
		return college;
	}

}
