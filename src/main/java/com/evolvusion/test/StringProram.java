package com.evolvusion.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringProram {
	
	public static void main(String[] args) {
		System.out.println();
		
		String s="i  amw iamhu darshan working as a software Eng";
		String s2=s.intern();
		System.out.println(s2.indexOf("am"));
		
		List<String> lst = new LinkedList<>();
		//Collections.frequency(c, o);
		
		removeAndcount(s, "am");
	}
	
	public static void removeAndcount(String sentence,String removelemet) {
		int count=0;
		while(sentence.contains(removelemet)) {
			sentence = sentence.replaceFirst(removelemet, "");
			count++;
		}
		
		System.out.println(count+" "+removelemet);
	}

}
