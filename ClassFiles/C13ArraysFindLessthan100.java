package com.java.basics;

public class C13ArraysFindLessthan100 {

	public static void main(String[] args) {
		
		int arr[] = {100,200,30,40,50,300,99};
		
		int c=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<100) {
				System.out.println(arr[i]);
				c++;
			}
		}
		System.out.println(c);

	}

}
