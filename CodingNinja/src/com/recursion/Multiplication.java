package com.recursion;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(Multiplication.multiplyTwoIntegers(m, n));
	}

	private static int multiplyTwoIntegers(int m, int n) {

		if (n == 0) {
			return 0;
		}
		int mul = m + multiplyTwoIntegers(m, n - 1);
		return mul;
	}
}
