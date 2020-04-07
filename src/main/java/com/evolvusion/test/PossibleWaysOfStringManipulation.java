package com.evolvusion.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleWaysOfStringManipulation {
	
	public static void main(String[] args) {

		Map<List<String>, List<String>> mp = new HashMap<>();

		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("a");
		ar1.add("b");
		ar1.add("c");
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("e");
		ar2.add("d");
		ar2.add("f");
		mp.put(ar1, ar2);

		System.out.println(mp);
		System.out.println(mp.get(ar1));

	}
	
	public static String manipuLate(String s) {
		return null;
	}

}
