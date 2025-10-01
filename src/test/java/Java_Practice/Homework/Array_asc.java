package Homework;

import java.util.Scanner;

public class Array_asc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter size:");
		int n1 = sc.nextInt();

		int[] arr = new int[n1];
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();
		}

		// Ascending Order
		for (int i = 0; i < n1 - 1; i++) {
			for (int j = 0; j < n1 - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];// swap logic
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int newarr : arr) {
			System.out.print(newarr + " ");
		}
		sc.close();
	}

}
