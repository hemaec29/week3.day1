package week3.day1;

public class Desktop extends Computer {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		System.out.println(desktop.desktopSize());
		desktop.computerModel();
	}

	public int desktopSize() {
		return 12;
	}
}
