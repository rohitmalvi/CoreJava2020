package InterviewQuation;

public class RemovingWhiteSpaceInString {

	public static void main(String[] args) {
		String str = " r o h    i   t & m al  v i ";

		String[] str1 = str.split("\\s");
		System.out.println("Orignal String is \n" + str);
		System.out.println("after removing white space");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + "");
		}
	}

}
