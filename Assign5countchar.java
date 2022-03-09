package week3.day1;

public class Assign5countchar {

	public static void main(String[] args) {
		
		String string = "welcome to chennai";
		int count =0;
		char[]  charArray = string.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] =='e') {
				count++;
			}
						
		}
		System.out.println("Total of e in the given string is "+count);

	}

}
