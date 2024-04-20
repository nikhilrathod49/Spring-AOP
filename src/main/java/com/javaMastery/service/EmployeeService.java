package com.javaMastery.service;

import org.springframework.stereotype.Service;

import com.javaMastery.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, String id) throws Exception {

		if (Integer.parseInt(id) <= 0) {
			throw new Exception("Invalid! Id");
		}

		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		return employee;
	}
}
