package Exception;

public class ArithException {

	public static void main(String[] args) {
		try {
		int a=100/0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught:" +e.getMessage());
		} finally {
			System.out.println("This block always executed");
		}
	}

}
