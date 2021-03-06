package com.recursion;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
	}

	private static int staircase(int n) {

		if (n == 1 || n == 0) {

			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return staircase(n - 3) + staircase(n - 2) + staircase(n - 1);

		}
	}
}
