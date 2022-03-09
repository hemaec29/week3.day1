package week3.day1;

public class Assign5ReverseEvenWords {

	public static void main(String[] args) {
		
		String string = "I am a software tester";
		
		//split the string to words and storing in String array
		String[] stringArray = string.split(" ");
		String rev = "";
		for (int i = 0; i < stringArray.length; i++) {
			if(i%2!=0) {
			 char[] oddArray = stringArray[i].toCharArray();
			 
			 //System.out.println(oddArray);

			 for (int j = oddArray.length-1; j >= 0; j--) 
			 {
				 
				 rev = rev+oddArray[j];
				 //System.out.println(rev);
			}
			 System.out.println(rev);
			}
			if(i%2==0) {
				char[] evenArray = stringArray[i].toCharArray();
				
				System.out.println(evenArray);
			}
				
				
					
		}
		
		
		/*//Iterate thru the loop
		for (int i = 0; i < stringArray.length; i++) {
			
			if(i % 2 != 0)
		 {
				String rev ="";
				char[] charArray = stringArray[i].toCharArray();
				
				for (int j = charArray.length-1; j <= 0; j--) {
					
					rev = rev + charArray[j];
					
				}
				System.out.println(rev);
				
				
		*/	
		}
		
				
			
			
		

	}


