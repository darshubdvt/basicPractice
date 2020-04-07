package com.evolvusion.test;

public class TestQus {

	public static void main(String[] args) {
		//System.out.println(print(0));
		int x=5;
		
		x=10;
		
		System.out.println(x);
		
	}

	public static Exception print(int i) {
		
		if(i>0) {
			return new Exception();
		}else {
			throw new RuntimeException();
		}
		
		
	}
}
