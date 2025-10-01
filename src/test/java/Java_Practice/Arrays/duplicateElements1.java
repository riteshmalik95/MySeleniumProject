package Arrays;

import java.util.Scanner;

public class duplicateElements1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Created Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Logic to find duplicate elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					System.out.println("\n\nDuplicate Elements:" + arr[i]);
				}

			}

		}

	}

}
