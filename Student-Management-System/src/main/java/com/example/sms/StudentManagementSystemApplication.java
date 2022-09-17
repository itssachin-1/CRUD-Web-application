package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studRepo;

	@Override
	public void run(String... args) throws Exception {
		Student stud1 = new Student("Sachin", "Kumar", "sachin.kr.157@gmail.com");
		studRepo.save(stud1);

		Student stud2 = new Student("abc", "cba", "abc@gmail.com");
		studRepo.save(stud2);

		Student stud3 = new Student("xyz", "zyx", "xyz@gmail.com");
		studRepo.save(stud3);

	}
}
