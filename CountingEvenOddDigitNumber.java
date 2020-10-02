package InterviewQuation;

import java.util.Scanner;

public class CountingEvenOddDigitNumber {

	public static void main(String[] args) {
		System.out.println("enter a number for counting even and odd ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		int even = 0;
		int odd = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;

			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			count++;
		}
		System.out.println("even number is " + even + " odd number is " + odd + " and total number is " + count);

	}

}
