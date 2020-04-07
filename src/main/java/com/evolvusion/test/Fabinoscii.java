package com.evolvusion.test;

public class Fabinoscii {

	public static void main(String[] args) {

		for (int a : fabinosciiSeries(7))
			System.out.println(a);
		
		System.out.println(fabinosciiRcursion(9, 0, 1));

		System.out.println(Singleton.getinstance());

		System.out.println(Singleton.getinstance());

		System.out.println(Singleton.getinstance());

		System.out.println(Singleton.getinstance());
	}

	public static int[] fabinosciiSeries(int range) {
		int fst = 0, snd = 1, total = 0;
		int[] arr = new int[range];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < range; i++) {
			total = fst + snd;
			arr[i] = total;
			fst = snd;
			snd = total;

		}
		return arr;

	}

	public static int fabinosciiRcursion(int range,int a,int b) {
		int fst = 0, snd = 1, total = 0;
		if (range == 0) {
			System.err.println(0);
			return a;
		}

		if(range==1) {
			return b;
		}
		System.out.println(a);
		//System.out.println(fabinosciiRcursion(range-1, b, a+b));
		
		return fabinosciiRcursion(range-1, b, a+b);

	}

}
