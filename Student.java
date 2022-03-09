package week3.day1;

public class Student {
	public static void main(String[] args) {
		Student student = new Student();
		student.getStudentInfo(1234);
		student.getStudentInfo(12345, "Ashwin");
		student.getStudentInfo("Rithanya", "Rithanya@gmail.com");
	
		
	}

	public int getStudentInfo(int id) {
		
		System.out.println("Student id is " + id);
		return id;
	}

	public String getStudentInfo(int id, String name) {
		System.out.println("Student id is " + id + " NameP is " + name);
		return name + id;
	}

	public String getStudentInfo(String name, String email) {
		System.out.println("Student Name is " + name + " Email is " + email);
		//System.out.println(String.format("Student Name is %s Email is %s", name, email));
		return name;
	}

}
