package Arrays;

import java.util.Scanner;

public class mergedArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of the Array1:");
		int n1 =scanner.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter the Elements of First Array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("First Array:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\n\nEnter the Size of the Array2:");
		int n2 =scanner.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("\n\nEnter the Elements of Second Array:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner1.nextInt();

		}
		System.out.println("Second Array:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		int[] mergedarray =new int[n1+n2];
        System.arraycopy(arr1, 0, mergedarray, 0, n1);
        System.arraycopy(arr2, 0, mergedarray, n1 + 0, n2);
		System.out.println("\n\nMerged Array:");
		for(int i=0;i<mergedarray.length;i++) {
			System.out.print(mergedarray[i] + " ");
		}
		scanner.close();
	}
}
