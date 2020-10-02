package InterviewQuation;

import java.util.Scanner;

public class PrintingEvenOddInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];
		System.out.println("Enter a 10 number for finding even odd inside array");
		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}
		System.out.println("Even number inside array is :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + ", ");
			}

		}
		System.out.println();
		System.out.println("Odd number inside array is :");
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2) != 0) {
				System.out.print(arr[i] + ", ");
			}
		}

	}

}
