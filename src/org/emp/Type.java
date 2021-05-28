package org.emp;

public class Type {
	public static void main(String[] args) {
		 short a=1000;
		 int b=a;
		 
		 System.out.println("widening" + b);
		 short c= (short)b;
		 System.out.println("narrowing" + c);
		 
	}

}
