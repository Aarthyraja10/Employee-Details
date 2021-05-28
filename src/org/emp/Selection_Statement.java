package org.emp;

public class Selection_Statement {
	
	public static void main(String[] args) {
		
		int a =10;
		String s = "java";
		
		if (a==5 && s== "java") {
			
			System.out.println("true");
		}
		else if (a==5 || s== "Java") {
			System.out.println("condition satisfied");
		}
		
		else {
			System.out.println("false");
		}
	}

}
