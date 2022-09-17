package com.springboot.tutorial.service;

import java.util.List;

import com.springboot.tutorial.entity.Employee;

public interface EmployeeService {

	List<Employee> listAll();

	void save(Employee employee);

	public void deleteEmployeeById(int id);
}
