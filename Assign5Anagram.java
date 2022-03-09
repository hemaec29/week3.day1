package week3.day1;

import java.util.Arrays;

public class Assign5Anagram {

	public static void main(String[] args) {

		String string1 = "stops";
		String string2 = "potss";

		if (string1.length() == string2.length()) {
			char[] charArray1 = string1.toCharArray();
			char[] charArray2 = string2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean equals = Arrays.equals(charArray1, charArray2);

			if (equals) {
				System.out.println("Given the string characters are same");

			} 
			else {
				System.out.println("Given string characters are not same");
			}
		}else {
			System.out.println("Given strings are not equal in length");
		}

	}

}
