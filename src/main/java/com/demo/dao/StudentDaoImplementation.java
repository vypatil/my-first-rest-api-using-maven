package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

@Repository
public class StudentDaoImplementation implements StudentDao {

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public boolean saveStudent(Student std) {

		boolean result = false;
		try {

			Session session = sessionfactory.openSession();
			Transaction txn = session.beginTransaction();
			session.save(std);
			txn.commit();
			session.close();
			result = true;
		} catch (Exception e) {

			System.out.println("Error occurred while storing the student : " + e.getMessage());
		}

		return result;

	}

	@Override
	public Student getStudent(int id) {

		Student std = null;

		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();

		std = session.get(Student.class, id);
		tx.commit();
		session.close();

		return std;
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
