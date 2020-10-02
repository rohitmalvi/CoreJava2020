package InterviewQuation;

public class FindingMinimumAndMaximum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 9, 4, 2, 1 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i > arr.length; i++) {
			if (max > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(" minimum is " + min);
		for (int j = 0; j < arr.length; j++) {
			if (min < arr[j]) {
				min = arr[j];
			}
		}
		System.out.println(" minimum is " + min);

	}

}
