package com.example.demo;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int j = 1; j <= num; j++) {
				fact = fact * j;
			}
		}
		System.out.println(fact);

	}

}
