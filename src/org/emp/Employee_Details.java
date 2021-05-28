package org.emp;

public class Employee_Details {
		
		public void employee(String s) {
        System.out.println("employee name is " + s);
	}

	 public void employee(String s, char c) {
		System.out.println("employee name is " +s+ " "+c );
	}
	public static void main(String[] args) {
		Employee_Details ed = new Employee_Details();
		ed.employee("aarthy");
		ed.employee("ranjith",'c');
	}
	}