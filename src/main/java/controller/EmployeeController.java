package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	@RequestMapping("/all")
	public Hashtable<String, Employee> getAllEmployee() {
		return empService.getAllEmployee();
		
	}
	
	@RequestMapping({"empId"})
	public Employee getEmployeeById(@PathVariable("empId") String empId) {
		return empService.getEmployeeById(empId);
		
	}
}
