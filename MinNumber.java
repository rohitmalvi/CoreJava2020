package com.ojas.algorithm;

import java.util.Scanner;

public class MinNumber {

	static int getMin(int[] inputArray) {
		int min = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (min < inputArray[i]) {
				min = inputArray[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputArray[] = new int[6];
		System.out.println("Enter a 10 number for finding even odd inside array");
		for (int j = 0; j < inputArray.length; j++) {
			inputArray[j] = sc.nextInt();
		}
		System.out.println("min value array is ");
		System.out.println(MinNumber.getMin(inputArray));

	}

}
