package week3.day1;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		System.out.println(axis.deposit(5,5));		

	}

	public int deposit(int a, int b) {
		return a*b;
	}
}
