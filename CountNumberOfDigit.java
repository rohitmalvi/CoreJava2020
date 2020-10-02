package InterviewQuation;

import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String[] args) {
		System.out.println("Enter a number for addition");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		while (num != 0) {
			count = num % 10;
			sum = sum + count;
			num = num / 10;
		}
		System.out.println("Addition of given number is " + sum);
	}

}
