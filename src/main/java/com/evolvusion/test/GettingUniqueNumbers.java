package com.evolvusion.test;

public class GettingUniqueNumbers {
	public static void main(String[] args) {

		try {
			getUniquenumber(new int[] { 1, 9, 3, 0, 3 });
		} finally {
			System.out.println("hahahaha");
		}

	}

	public static void getUniquenumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
				if (j == arr.length - 1) {
					System.out.println(arr[i]);
				}
			}

		}
	}
}
