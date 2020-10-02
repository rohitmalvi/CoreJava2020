package InterviewQuation;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		String str1 = "Java is programing language language";
		String[] arr=str1.split(" ");
		System.out.println(str1);
		int count;
		Map m = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if (m.containsKey(arr[i])  ) {
				count++;
			}
			m.put(arr[i], count);
		}
		System.out.println(m);
	}

}
