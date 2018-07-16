package com.selenium.basics;

public class C03_arrays {

	public static void main(String[] args) {

		int i[] = new int [5];  // what is this new doing here?

		i[0] = 29;
		i[2] = 45; // i have intentionally skipped i [1]. Will this throw error or will it take i [1] as zero?
		i[3] = 12;
		
		System.out.println(i[1]);
		System.out.println(i[4]);

	}

}
