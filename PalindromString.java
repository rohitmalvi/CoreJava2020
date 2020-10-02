package InterviewQuation;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rmr";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev + "" + str);
		if (str.equals(rev)) {
			System.out.println("given String is palindrom");
		} else {
			System.out.println("given string is not palindrom");
		}
	}

}
