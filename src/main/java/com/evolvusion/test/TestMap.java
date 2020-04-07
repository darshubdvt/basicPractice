package com.evolvusion.test;

import java.util.HashMap;
import java.util.Map;

enum MSG {
	ERROR, NOTANERROR
}

public class TestMap {
	public static void main(String[] args) {

		MSG ms = MSG.ERROR;
		
		System.out.println(ms instanceof MSG);
		
		System.out.println();

		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "rew");

		System.out.println(2306967 % 15);

		System.out.println("KING".hashCode());

		System.out.println("KING".hashCode() & (16 - 1));

	}
}
