package com.ex_alternative.lesson04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex_alternative.lesson04.domain.Student;
import com.ex_alternative.lesson04.mapper.StudentMapper;

@Service
public class StudentBO {
	//input:
	@Autowired
	private StudentMapper studentMapper;
	public void addStduent(Student student) {
		studentMapper.insertStudent(student);
	}

}
