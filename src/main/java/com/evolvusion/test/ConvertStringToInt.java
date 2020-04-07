package com.evolvusion.test;

public class ConvertStringToInt {

	public static void main(String[] args) {
		System.out.println(convertStToInt("12378")==12378);
	}

	public static int convertStToInt(String num) {

		int acciZero = (int) '0';
		System.out.println(acciZero);
		int sum = 0;
		for (char c : num.toCharArray()) {
			sum = (sum * 10) + ( (int)c - acciZero);
			System.out.println(sum);
		}

		return sum;
	}

}
