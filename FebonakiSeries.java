package com.example.demo;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10;
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i < num; i++) {
			System.out.println(num1);
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

	}
}

//		int num = 10;
//		int num1 = 0;
//		int num2 = 1;
//		int count = 1;
//		while (count <= num) {
//			System.out.print(num1 + ",");
//			int sum = num1 + num2;
//			num1 = num2;
//			num2 = count;
//			count++;
//		}
