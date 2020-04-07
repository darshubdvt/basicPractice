package com.evolvusion.test;

public class Corona {
	public static boolean isAlive;
}

class Please {

	public static void eat() {
		System.out.println("eating...");
	};

	public static void work() {
		System.out.println("working...");
	};

	public static void sleep() {
		System.out.println("sleeping...");
	};

	public static void repeat() {
		System.out.println("Doing all...");
	};

	public static void stayHome() {
		eat();
		work();
		sleep();
		repeat();
	}
}

class India {
	public static void main(String[] args) {

		while (Corona.isAlive) {
			Please.stayHome();
		}
	}
}