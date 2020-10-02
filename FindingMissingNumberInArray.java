package InterviewQuation;

public class FindingMissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 2, 1 };
		int sum = 0;
		int sum1 = 0;
		int result;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("without missing num" + sum);

		int len = arr.length + 1;
		for (int j = 0; j < len; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("with missing num" + sum1);

		System.out.println("missing number is " + (sum - sum1));
	}

}
