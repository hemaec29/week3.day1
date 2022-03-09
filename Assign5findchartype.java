package week3.day1;

public class Assign5findchartype {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < test.length(); i++) {
			char c = charArray[i];
			if(Character.isLetter(c))
			 letter++;
			else if(Character.isDigit(c))
				num++;
			else if(Character.isSpaceChar(c))
				space++;
			else specialChar++;
			
		}
	System.out.println("No. of letters in the given string is "+letter);
	System.out.println("No. of digits in the given string is "+num);	
	System.out.println("No. of Spacechar in the given string is "+space);
	System.out.println("No. of Specialchar in the given string is "+specialChar);
	}

}
