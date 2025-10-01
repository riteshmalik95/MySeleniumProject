package Exception;

public class throwKeyword {
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not allowed:Age is below 18");
		} else {
			System.out.println("Welcome on show");
		}
	}

	public static void main(String[] args) {
		checkAge(14);
	}

}
