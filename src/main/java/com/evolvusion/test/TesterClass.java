package com.evolvusion.test;

import java.util.ArrayList;
import java.util.List;

public class TesterClass {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();

		l.add("2");
		if (l.contains("2")) {
			System.out.println("yes");
		} else {
			System.out.println("NO");
		}
	}

}
