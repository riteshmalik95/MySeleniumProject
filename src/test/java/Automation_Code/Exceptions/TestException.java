package Exceptions;

public class TestException {

	public static void main(String[] args) {
		int i = 15;
		int j = 0;

		try {// code that may throw an exception
			int result = i / j;
			System.out.println(result);
		} catch (ArithmeticException e) {// code that will catch an exception
			System.out.println("Error:Division by zero is not allowed!");
		} finally {
			System.out.println("Program continues after handling the exception");
		}

	}
}