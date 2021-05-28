package org.emp;

public class Dance {
	
	public static void main(String[] args) {
		
		String s = "good morning";
	    System.out.println(s);
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		int indexOf = s.indexOf('o');
		System.out.println(indexOf);
		
		boolean equals = s.equals("good MORNING");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("good MORNING");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
        System.out.println(upperCase);
        
        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase);
        
        boolean contains = s.contains("morning");
        System.out.println(contains);
        
        boolean startsWith = s.startsWith("goo");
        System.out.println(startsWith);
        
        boolean endsWith = s.endsWith("ing");
        System.out.println(endsWith);
        
        String replace = s.replace('o','a');
        System.out.println(replace);
        
        String replace2 = s.replace("morning","night");
        System.out.println(replace2);
        
        String substring = s.substring(3,12);
        System.out.println(substring);
        
        s.replaceAll("good morning", "good night");
        System.out.println(replace2);
        
	}
	
}


