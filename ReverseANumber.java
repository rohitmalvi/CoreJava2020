package InterviewQuation;

import java.util.Scanner;

public class ReverseANumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number for reversiong ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * 
		 * if (num >= 0) {
		 * 
		 * int num1 = 0;
		 * 
		 * num1 = num % 10; System.out.println(num1); int num0 = num / 10;
		 * 
		 * System.out.println(num0); }
		 */

		/*
		 * for (int i = 0; i <= 5; i++) { int n = num; int n1 = n % 10; int n2 = n1 *
		 * 10; int n3 = n / 10; n2 = System.out.println(n3); }
		 */

		/*
		 * int org = 0; num = num % 10; System.out.println(num); num = num % 10;
		 * System.out.println(num);
		 */
		System.out.println("Orignal number is " + num);
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			/*
			 * System.out.println(rev); System.out.println(num);
			 */
		}
		System.out.println("Reverse number is " + rev);
		System.out.println();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();
		System.out.println("String Buffer" + rev1);
		System.out.println();

	}
}
