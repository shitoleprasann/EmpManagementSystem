package com.JavaPro.javaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.JavaPro.javaspring.model.Employee;

@SpringBootApplication
public class JavaspringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JavaspringApplication.class, args);
	}	
		@Autowired
		private EmployeeRepository employeerepository;	
		

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp =new Employee();
		emp.setFirstName("ram");
		emp.setLastName("Yadav");
		emp.setEmail("ram@gamil.com");
		employeerepository.save(emp);
		
		Employee emp1 =new Employee();
		emp1.setFirstName("shyam");
		emp1.setLastName("pande");
		emp1.setEmail("shyam@gamil.com");
		employeerepository.save(emp1);
		
	}

}
