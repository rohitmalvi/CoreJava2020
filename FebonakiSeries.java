package InterviewQuation;

public class FebonakiSeries {

	public static void main(String[] args) {
		int first = 0;
		for (int i = 1; i <= 100; i++) {
			first = first + i;
			if (first <= 100)
				System.out.println(first + " ");
		}
	}

}
