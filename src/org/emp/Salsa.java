package org.emp;

public class Salsa {
	
	public static void main(String[] args) {
		
		String s = "The cat on the wall";
		String[] split = s.split(" ",5);
		
		for (String word : split) {
			System.out.println(word);
			
		}
		
	}

}
