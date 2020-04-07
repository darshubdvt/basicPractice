package com.evolvusion.test;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzzInp("2", "3 15");
	}

	public static void fizzBuzzInp(String ln1, String ln2) {
		String[] arr = ln2.split(" ");
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= Integer.parseInt(arr[i].trim()); j++) {
				if (j % 3 == 0 && j % 5 == 0) {
					System.out.println("Fizz buzz");
				} else if (j % 3 == 0) {
					System.out.println("Fizz");
				} else if (j % 5 == 0) {
					System.out.println("Buzz");

				} else {
					System.out.println(j);
				}
			}
		}

	}

}
