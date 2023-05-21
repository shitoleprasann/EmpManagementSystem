package com.JavaPro.javaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JavaPro.javaspring.EmployeeRepository;
import com.JavaPro.javaspring.model.Employee;

@RestController
@RequestMapping("/api/p1/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeerepository;

@GetMapping
public List<Employee> getAllEmployes(){
	return employeerepository.findAll();
	
}
}
