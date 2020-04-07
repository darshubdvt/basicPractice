package com.evolvusion.test;

public class UpperToLower {

	public static void main(String[] args) {
			System.out.println(uprToLowerToUpr("FiSh"));
	}

	public static String uprToLowerToUpr(String s) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				if (Character.isUpperCase(s.charAt(i))) {
					result.append(Character.toLowerCase(s.charAt(i)));
				} else {
					result.append(Character.toUpperCase(s.charAt(i)));
				}
				//s=s.replace(String.valueOf(s.charAt(i)), "");
			}
		}
		System.out.println(s);

		return result.toString();
		// Character.isLetter(ch)
	}
}
