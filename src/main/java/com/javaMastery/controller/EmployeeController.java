package com.javaMastery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaMastery.model.Employee;
import com.javaMastery.model.Student;
import com.javaMastery.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired Employee employee;
	
	@Autowired Student student;

	@Autowired EmployeeService employeeService;
	
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public String  addEmployee(@RequestParam("name") String name, @RequestParam("empId") String empId) throws Exception {
		
	//	employee.setId(empId);   
		student.setName(name);
	//	employeeService.createEmployee(name, empId);
		
		return "Employee Created";
		
	}

}