package com.dbpackage.impl;

import java.util.List;

import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;

public class StudentServiceImpl implements StudentService{
	StudentDao dao = new StudentDao();
	
	@Override
	public void insertStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	public List<Student> getStudentList() {
		return dao.getStudentList();
	}

	@Override
	public Student getStudent(int sNo) {
		
		return null;
	}
	

}
