package week3.day1;

public class StringClassroomActivity1 {

	public static void main(String[] args) {
		
		String s1 = "Testleaf is in Teynampet above taccoshop";
		s1 = s1.toUpperCase();
		String[] stringArray = s1.split(" ");
		
		for (int i = 0; i < s1.length(); i++) {
			if(stringArray[i].startsWith("T")) {
				System.out.println(stringArray[i]);
							}
				
				
				
		}
		
		

	}

}
