package com.basics.week1.problem.set2;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		for(int i = 1; i*x<=1000; i++) {
			
			System.out.println(i*x);
		}
		
		
	}

}
