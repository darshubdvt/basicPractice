package com.evolvusion.test;

import java.util.LinkedList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<String> lt = new LinkedList<>();
		lt.add("9");
		lt.add("9");
		lt.add("3");
		lt.add(null);
		String st = "";
		for (int i = 0; i < lt.size(); i++) {
			if (lt.get(i) != null) {
				st += lt.get(i);
			}
			if (i == lt.size() - 1) {
				st = String.valueOf(7 + Integer.parseInt(st));
			}
		}
		for (String s : st.split("")) {
			System.out.print(s + "->");
		}
		System.out.print(lt.get(lt.size() - 1));

	}
}
