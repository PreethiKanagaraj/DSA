package com.basics.week1.problem.set2;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = sc.next();
		String lastname = sc.next();
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(firstname + lastname);
		}
	}
}
