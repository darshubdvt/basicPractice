package com.evolvusion.test;

public class StringVlidation {
	
	public static void main(String[] args) {
		String s1="hai";
		
		String s2="hai";
		
		String s3= new String("hai");
		
		StringBuilder s4= new StringBuilder("hai");
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		
		System.out.println(s3==s4.toString());
		
		System.out.println(s1==s4.toString());
		
		
	}

}
