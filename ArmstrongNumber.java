package com.example.demo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for checking armstrong");
		int num = sc.nextInt();
		int real = num;
		int num1 = 0;
		int sum = 0;
		int add = 0;
		while (num != 0) {
			add = num % 10;
			sum += (int) (Math.pow(add, 3));
			num /= 10;
		}
		System.out.println(sum);
		if (sum == real) {
			System.out.println("number is Armstrong");
		} else {
			System.out.println("number is not Armstrong");
		}
	}

}
