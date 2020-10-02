package InterviewQuation;

import java.util.Scanner;

public class LargestValueOfThreeNum {

	public static void main(String[] args) {
		System.out.println("Enter a Three number for finding greater one");
		Scanner sc = new Scanner(System.in);
		System.out.print("  a= ");
		int a = sc.nextInt();
		System.out.print("  b= ");
		int b = sc.nextInt();
		System.out.print("  c= ");
		int c = sc.nextInt();
		if (a > b & a > c) {
			System.out.print("greater number is ");
			System.out.println(a);

		} else if (b > a & b > c) {
			System.out.println("greater number is ");
			System.out.println(b);

		} else if (c > a & c > b) {
			System.out.println("greater number is ");
			System.out.println(c);

		} else {
			System.out.println("all the number is equal");
		}
		int largest = a > b ? a : b;
		int moreLargest = c > largest ? c : largest;
		System.out.println("by using terrnary operation largest is " + moreLargest);
	}

}
