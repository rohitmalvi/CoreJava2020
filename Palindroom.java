package InterviewQuation;

import java.util.Scanner;

public class Palindroom {
	public static void main(String[] args) {
		System.out.println("Enter a Palindrom number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		int rem = 0;
		while (num != 0) {
			rem = rem * 10 + num % 10;
			num = num / 10;

		}

		if (rem == num1) {
			System.out.println("given number is palindrom " + num1);
		} else {
			System.out.println("Number is not palindrom" + num1);
		}
	}

}
