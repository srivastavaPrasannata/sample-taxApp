package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeService {
	
	Hashtable <String, Employee> employees = new Hashtable<String, Employee>();
	
	public EmployeeService() {
		Employee emp = new Employee();
		emp.setEmployeeId("1");
		emp.setPreTaxSalary(10000);
		emp.setPostTaxSalary(9000);
		emp.setTaxPercent(10);
		employees.put("101", emp);
		
		emp.setEmployeeId("102");
		emp.setPreTaxSalary(200000);
		emp.setPostTaxSalary(80000);
		emp.setTaxPercent(20);
		employees.put("2", emp);
		
	}

	public Hashtable<String, Employee> getAllEmployee() {
		return employees;
		
	}
	
	public Employee getEmployeeById(String empId) {
		if(employees.containsKey(empId))
			return employees.get(empId);
		else
		return null;
		
	}
}
