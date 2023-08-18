package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/students")
	public String createStudent(@RequestBody Student std) {
		
		
		System.out.println("request received to create student " +std);
		
		if(studentservice.saveStudent(std))
			return "Student saved succesfully";
		
		else 
			
		return	"Student not saved!!!";
					
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		System.out.println("request received to get student of id : " + id);
		
		Student retrivedStudent = studentservice.getStudent(id);
		
		return retrivedStudent;
		
		
	}

}
