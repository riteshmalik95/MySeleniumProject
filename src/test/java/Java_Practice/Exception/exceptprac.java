package Exception;

public class exceptprac {

	public static void main(String[] args) {
		try {
			int a = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println("exception occurs:" + e.getMessage());
		} finally {
			System.out.println("this block always executed");
		}
	}
}
