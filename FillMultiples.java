package com.ojas.algorithm;

import java.util.Scanner;

public class FillMultiples {
	static Scanner sc = new Scanner(System.in);

	static int[] getMultiplesArray(int number) {
		int inputArray[] = new int[number];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.nextInt();
		}
		for (int j = 0; j < number; j++) {
			if (inputArray[j] == 0 || inputArray[j] == -(j)) {
				inputArray[j] = 0;
			} else {
				System.out.print(inputArray[j]+" " );
			}
		}
		return inputArray;
	}

	public static void main(String[] args) {

		int number = 10;
		System.out.println("Enter a 10 number of array");
		FillMultiples.getMultiplesArray(number);
	}

}
