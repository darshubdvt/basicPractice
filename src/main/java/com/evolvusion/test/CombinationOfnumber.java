package com.evolvusion.test;

public class CombinationOfnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationOfginNum(new int[] { 0,1, 2, 3, 4, 5, 6, 6 }, 6);

	}

	public static void combinationOfginNum(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num)
					System.err.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}

	}

}
