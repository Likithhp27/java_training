package com.service;

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public interface UniversityService {
	public abstract Student searchStudent1(Department department, int search);
	public abstract Department searchDepartment(College college, int search);
	public abstract College searchCollege(University university, int search);

}
