package com.java.basics;

public class C12Denominations {

	public static void main(String[] args) {

		int n = 7799;
		// 2000*3
		// 500*3
		// 200*1
		// 50*1
		// 20*2
		// 5*1
		// 2*2
		int den[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		for (int d = 0; d < den.length; d++) {
			int nt = n / den[d];
			n = n % den[d];
			if (nt != 0) {
				System.out.println(den[d] + "*" + nt);
			}
		}

	}

}
