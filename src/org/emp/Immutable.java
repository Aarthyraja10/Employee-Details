package org.emp;

public class Immutable {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer ("greens");
		StringBuffer s1 = new StringBuffer ("greens");
		StringBuffer s2 = new StringBuffer ("Technology");
		
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("Append");
	StringBuffer s3 = new StringBuffer (s.append(s1));
		System.out.println(System.identityHashCode(s3));
	}

}
