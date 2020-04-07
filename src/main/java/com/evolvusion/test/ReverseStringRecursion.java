package com.evolvusion.test;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse("pali"));

	}
	
	public static String reverse(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
}
