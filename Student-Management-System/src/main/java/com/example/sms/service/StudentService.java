package com.example.sms.service;

import java.util.List;

import com.example.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student stud);

	Student getStudentById(Long id);

	Student updateStudent(Student stud);

	void deleteStudentById(Long id);
}
