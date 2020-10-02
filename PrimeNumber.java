package InterviewQuation;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
			}
			if (count == 2) {
				System.out.println("given number is prime number ");
			}
		}
		System.out.println(count);

	}
}
