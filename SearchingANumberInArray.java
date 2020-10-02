package InterviewQuation;

public class SearchingANumberInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 32, 4, 2, 21, 5, 98, 3, 58, 99, 0 };
		int findNumber = 99;
		int count = -1;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (findNumber == arr[i]) {
				System.out.println("number " + findNumber + " is found index number is " + count);
				break;
			}

		}

	}

}
