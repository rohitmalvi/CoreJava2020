package com.ojas.algorithm;

import java.util.Scanner;

public class ArraySum {
	static int getSum(int[] inputArray) {
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}
		if (sum != 0) {
			return sum;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int sum1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of the number you want to reverse");

		int len = sc.nextInt();
		int inputArray[] = new int[len];
		System.out.println("Enter a " + len + " number of ");
		for (int j = 0; j < inputArray.length; j++) {
			inputArray[j] = sc.nextInt();
		}

		sum1 = getSum(inputArray);
		System.out.println("the sum of the array is " + sum1);

	}

}
