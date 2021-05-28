package org.emp;

public class Employee extends Employee_Details {
	
	public void employeeSalary() {
		System.out.println("employee salary is 50000");
	}
	
	public static void main(String[] args) {
	
		Employee ep = new Employee();
		ep.employeeSalary();
		ep.employeeName();
		ep.employeeId();
	}
}
