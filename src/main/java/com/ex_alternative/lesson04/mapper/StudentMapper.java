package com.ex_alternative.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ex_alternative.lesson04.domain.Student;

@Mapper
public interface StudentMapper {
	public void insertStudent(Student student);

}
