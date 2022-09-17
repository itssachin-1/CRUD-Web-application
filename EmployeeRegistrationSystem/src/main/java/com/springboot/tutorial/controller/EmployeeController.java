package com.springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.tutorial.entity.Employee;
import com.springboot.tutorial.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Employee> employeeList = service.listAll();
		model.addAttribute("listAll", employeeList);
		return "index";
	}

	@RequestMapping("/new")
	public String showNewEmployeePage(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee, Model model, BindingResult result) {
		service.save(employee);
		List<Employee> employeeList = service.listAll();
		model.addAttribute("listAll", employeeList);
		model.addAttribute("employeeAttr", employee);
		return "index";
	}

	@DeleteMapping(value = "/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		service.deleteEmployeeById(id);
	}
}
