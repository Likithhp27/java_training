package com.dao;
/**
 * @author likith.hp
 */

import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;

public interface UniversityDao {
	//pure Abstract method
	public abstract Student searchStudent(Department department, int search);
	public abstract Department searchDepartment(College college, int search);
	public abstract College searchCollege(University university, int search);
	
}
