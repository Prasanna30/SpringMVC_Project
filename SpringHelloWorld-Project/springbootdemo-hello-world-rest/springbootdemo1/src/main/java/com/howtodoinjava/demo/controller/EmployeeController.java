package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/emp")
    public List<Employee> getEmployees() 		
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"prasanna","Pawar","ppawar@quantumtechinc.com"));
		employeesList.add(new Employee(2,"Pawan","Pawar","pawanpawar@gmail.com"));
		employeesList.add(new Employee(3,"Pratham","Pawar","Prathampawar@gmail.com"));
		employeesList.add(new Employee(4,"Piyu","Prathana","Prathanapawar@gmail.com"));
		return employeesList;
    }

}
