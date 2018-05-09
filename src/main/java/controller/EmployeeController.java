package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/all",  method = RequestMethod.GET, produces = "application/json")
	public Hashtable<String, Employee> getAllEmployee() {
		return empService.getAllEmployee();
		
	}
	
	@RequestMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") String empId) {
		return empService.getEmployeeById(empId);
		
	}
}
