package InterviewQuation;

public class FindDuplicateInArrayString {

	public static void main(String[] args) {
		String str[] = { "java", "Phython", "JavaScript", "java", "css", "Css" };
		System.out.println("Duplicate String  is ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[i]) == str[j].equalsIgnoreCase(str[i])) {
					System.out.println(str[i]);
				}
			}
		}
	}

}
