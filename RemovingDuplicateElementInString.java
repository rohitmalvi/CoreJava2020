package InterviewQuation;

public class RemovingDuplicateElementInString {

	public static void main(String[] args) {
		String str = "aaabbbcccdddaaaeeff";

		for (int i = 0; i < str.length()-1; i++) {

			char arr[] = str.toCharArray();

			if (arr[i] == arr[i + 1]) {
				i++;
			}
			System.out.print(arr[i] + "");

		}

	}

}
