package InterviewQuation;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayEqualOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		System.out.println("comparing two arrys are equal or not");
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[2];
		int arr2[] = new int[2];
		System.out.println("Enter a first array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter a second array");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		int count = 0;
		boolean compairing = Arrays.equals(arr1, arr2);
		System.out.println(compairing);
		if (compairing == true) {
			System.out.println("Arrays are eqal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}
}
