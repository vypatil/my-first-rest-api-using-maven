package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentDao studentdao;
	
	
	@Override
	public boolean saveStudent(Student std) {
		return studentdao.saveStudent(std);
	}

	@Override
	public Student getStudent(int id) {
		return studentdao.getStudent(id);
	}

	@Override
	public List<Student> getStudents() {
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		return false;
	}

	@Override
	public boolean updateStudent(Student std) {
		return false;
	}
	
	

}
