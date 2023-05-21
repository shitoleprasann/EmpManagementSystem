package com.JavaPro.javaspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JavaPro.javaspring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
