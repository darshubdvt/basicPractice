package com.evolvusion.test;


public class TwoDimentionary {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		//System.out.println(arr.length);
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i][(arr.length-1)-i]);
			
		}

		
	}
	
	
	

}
