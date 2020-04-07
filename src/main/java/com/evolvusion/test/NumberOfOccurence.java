package com.evolvusion.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.util.StringUtils;

public class NumberOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberOfOccurence("aabacbd"));

	}

	public static String numberOfOccurence(String data) {

		/*
		 * char[] ch=data.toCharArray();
		 * 
		 * for(int i=0;i<ch.length;i++) { if(data.indexOf(ch[i])>1) {
		 * 
		 * } }
		 */
		//List<String> st = Arrays.asList(data.split(""));
		String result = "";

		while (!data.isEmpty()) {
			result += String.valueOf(data.charAt(0))+ StringUtils.countOccurrencesOf(data, String.valueOf(data.charAt(0)));
			//result += String.valueOf(data.charAt(0)) + cnt;
			data = data.replaceAll(String.valueOf(data.charAt(0)), "");
		}

		return result;

	}

}
