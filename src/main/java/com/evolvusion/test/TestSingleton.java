package com.evolvusion.test;

public class TestSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Singleton s1 = Singleton.getinstance();
		System.out.println("s1    "+s1);
		
		Singleton s2 = (Singleton)s1.clone();
		
		//System.out.println(s1);
		
		System.out.println(s2);

		//Singleton s2 = null;

		//s2 = (s2) s.clone();

	}

}
