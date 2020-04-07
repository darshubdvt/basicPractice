package com.evolvusion.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountheNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello world          fill the time sheet the";

		String[] split = s.split(" ");
		
		System.out.println(Arrays.toString(split));
		Map<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < split.length; i++) {
			if (hm.containsKey(split[i])) {
				int count = hm.get(split[i]);
				hm.put(split[i], count + 1);
			} else {
				hm.put(split[i], 1);
			}
		}

		System.err.println("CountheNumberOfWords.main() = "+hm);
	}

}
