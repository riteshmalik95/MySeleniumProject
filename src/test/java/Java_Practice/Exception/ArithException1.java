package Exception;

public class ArithException1 {

	public static void main(String[] args) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught:" + e.getMessage());
		} finally {
			System.out.println("This block is always executed");
		}

	}

}
