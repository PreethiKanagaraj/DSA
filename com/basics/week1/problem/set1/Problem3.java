package com.basics.week1.problem.set1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();

		if (mark >= 90) {
			System.out.println("Grade A");
		} else if (mark >= 80) {
			System.out.println("Grade B");
		} else if (mark >= 60) {
			System.out.println("Grade C");
		} else if (mark >= 35) {
			System.out.println("Grade D");
		} else if (mark < 35) {
			System.out.println("Fail");
		}
	}

}
