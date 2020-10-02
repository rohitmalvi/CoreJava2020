package InterviewQuation;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Orignal String is " + str1);

		System.out.println(ReverseAString.reverse(str1));

	}

	public static String reverse(String str1) {
		String str3 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str3 = str3 + str1.charAt(i);
		}
		return str3;
	}
}
