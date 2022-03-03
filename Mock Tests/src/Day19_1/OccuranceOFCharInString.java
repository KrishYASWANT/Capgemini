package Day19_1;

import java.util.*;

public class OccuranceOFCharInString {

	public static void main(String[] args) {
		// 1.count occurrence of a given character in String?

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				num++;
			}
		}
		System.out.println(num);

	}

}
