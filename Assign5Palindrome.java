package week3.day1;

public class Assign5Palindrome {

	public static void main(String[] args) {
		
		String string = "madam";
		String revString = "";
		
		for (int i = string.length()-1; i >= 0; i--) {
			char s1 = string.charAt(i);
			revString = revString + s1;
		}
		if(revString.equalsIgnoreCase(string))
		{
			System.out.println("The given String is Palindrome");	
		}
		else
		{
			System.out.println("The given String is not Palindrome");
		}

}
}
