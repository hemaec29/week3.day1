package week3.day1;

public class VowelsFinding {

	public static void main(String[] args) {

		String s = "Education";
		s = s.toLowerCase();
		int a = s.length();
		for (int i = 0; i < a; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.println("Vowel present at :" + i + " position the vowel char is :" + s.charAt(i));
			}

		}

	}

}
