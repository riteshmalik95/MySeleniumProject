package newProgram;

public class const3 {
	const3() {

		System.out.println("Hello");
		new const3(10);
	}

	const3(int a) {

		System.out.println(a);
		new const3(20, 30);
	}

	const3(int a, int b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		new const3();

	}
}