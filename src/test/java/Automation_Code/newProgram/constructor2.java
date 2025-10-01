package newProgram;

public class constructor2 {
	constructor2() {
		new constructor2(10);
		System.out.println("Hello");
	}

	constructor2(int a) {

		new constructor2(20, 30);
		System.out.println(a);
	}

	constructor2(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		new constructor2();

	}
}