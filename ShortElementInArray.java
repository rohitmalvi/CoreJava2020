package InterviewQuation;

import java.util.Arrays;

public class ShortElementInArray {

	public static void main(String[] args) {
		int arr[] = { 23, 2, 44, 88, 4, 9, 98, 76, 98, 23 };
		System.out.println("Orignal array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("");
		System.out.println();
		System.out.println("After Shorting in assending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("After Shorting in desending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("After inbuld method");
		int arr2[] = { 2, 3, 8, 1, 3, 2, 12, 423, 54, 23, 1 };
		Arrays.sort(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}

}
