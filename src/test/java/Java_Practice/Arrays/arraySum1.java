package Arrays;

public class arraySum1 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 1, 5, 8, 9, 4 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Array sum:" + sum);
	}

}
