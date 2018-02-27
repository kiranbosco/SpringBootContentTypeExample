package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/employeeData",method=RequestMethod.GET,produces={"Application/josn","Application/xml"})
	public Employee employee() {
		
		Employee emp=new Employee();
		emp.setEmpId("100");
		emp.setEmpId("kiran");
		emp.setDesignation("Developer");
		emp.setSalary(39000.00);
		return emp;
	}

}
