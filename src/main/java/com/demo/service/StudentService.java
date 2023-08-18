package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {
	
public boolean saveStudent(Student std);
	
	public Student getStudent(int id);
	
	public List<Student> getStudents();
	
	public boolean deleteStudent(int id);
	
	public boolean updateStudent(Student std);
	

}
