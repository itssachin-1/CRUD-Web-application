package com.example.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studRepo;

	public StudentServiceImpl(StudentRepository studRepo) {
		super();
		this.studRepo = studRepo;
	}

	@Override
	public List<Student> getAllStudents() {

		return studRepo.findAll();
	}

	@Override
	public Student saveStudent(Student stud) {
//		Student existingStudent = studRepo.GetByEmail(stud.getEmail());
//		if (existingStudent != null && existingStudent.getId() != stud.getId())
//			return ("Email is already taken");
		return studRepo.save(stud);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student stud) {
		// TODO Auto-generated method stub
		return studRepo.save(stud);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studRepo.deleteById(id);
	}
}
