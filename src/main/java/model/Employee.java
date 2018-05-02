package model;

public class Employee {
	String empId;
	int preTaxSalary;
	int taxPercent;
	int postTaxSalary;
	
	public String getEmployeeId() {
		return empId;
	}
	public void setEmployeeId(String employeeId) {
		this.empId = employeeId;
	}
	public int getPreTaxSalary() {
		return preTaxSalary;
	}
	public void setPreTaxSalary(int preTaxSalary) {
		this.preTaxSalary = preTaxSalary;
	}
	public int getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(int taxPercent) {
		this.taxPercent = taxPercent;
	}
	public int getPostTaxSalary() {
		return postTaxSalary;
	}
	public void setPostTaxSalary(int postTaxSalary) {
		this.postTaxSalary = postTaxSalary;
	}

}
