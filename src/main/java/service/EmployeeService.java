package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeService {
	
	Hashtable <String, Employee> employees = new Hashtable<String, Employee>();
	
	public EmployeeService() {
		Employee emp1 = new Employee();
		emp1.setEmployeeId("1");
		emp1.setPreTaxSalary(30000);
		emp1.setPostTaxSalary(20000);
		emp1.setTaxPercent(10);
		employees.put("1", emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId("2");
		emp2.setPreTaxSalary(50000);
		emp2.setPostTaxSalary(40000);
		emp2.setTaxPercent(20);
		employees.put("2", emp2);
		
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
