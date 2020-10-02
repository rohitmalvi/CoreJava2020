package com.ojas.algorithm;

import java.util.Scanner;

public class OddSum {
	public static int getOddSum(int[] inputArray) {
		System.out.println("Odd number inside array is :");
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if ((inputArray[i] % 2) != 0) {
				sum = sum + inputArray[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputArray[] = new int[6];
		System.out.println("Enter a 10 number for finding even odd inside array");
		for (int j = 0; j < inputArray.length; j++) {
			inputArray[j] = sc.nextInt();
		}
		System.out.println("Even number inside array is :");
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 0) {
				System.out.print(inputArray[i] + ", ");
			}

		}
		System.out.println();
		System.out.println("Odd number inside array is :");
		for (int i = 0; i < inputArray.length; i++) {
			if ((inputArray[i] % 2) != 0) {
				System.out.print(inputArray[i] + ", ");
			}
		}
		System.out.println("Additioni of add number is  ->" + OddSum.getOddSum(inputArray));
	}

}
