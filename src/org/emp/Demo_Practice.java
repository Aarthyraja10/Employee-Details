package org.emp;

import java.util.Scanner;

public class Demo_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id");
		int number = sc.nextInt();
		System.out.println("emp id is" +number);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("My Name is " +name);
		System.out.println("enter your m1 mark");
		int m1mark = sc.nextInt();
		System.out.println("m1 mark is" +m1mark);
		System.out.println("enter your m2 mark");
		int m2mark = sc.nextInt();
		System.out.println("m2 mark is" +m2mark);
		System.out.println("enter your m3 mark");
		int m3mark = sc.nextInt();
		System.out.println("m3 mark is" +m3mark);
		System.out.println("enter your m4 mark");
		int m4mark = sc.nextInt();
		System.out.println("m4 mark is" +m4mark);
		int a = m1mark+  m2mark + m3mark + m4mark;
		System.out.println("the sum of all maths papers" +a);
		double average = ( m1mark+  m2mark + m3mark + m4mark)/5;
		System.out.println("the average of all maths paper are"+ average);
		
		
		
		
	}

	 
}
