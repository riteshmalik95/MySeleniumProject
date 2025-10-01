package Arrays;

import java.util.Scanner;

public class mergeArrays1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array1:");
		int n1 = scanner.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter the Elements of First Array:");
		for(int i=0;i<n1;i++) {
			arr1[i]=scanner.nextInt();
		}
		System.out.println("First Array:");
		for(int i=0;i<n1;i++) {
			System.out.print(arr1[i]+" ");
		}
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("\n\nEnter the size of the Array2:");
		int n2 = scanner1.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter the Elements of Second Array:");
		for(int i=0;i<n2;i++) {
			arr2[i]=scanner.nextInt();
		}
		System.out.println("Second Array:");
		for(int i=0;i<n1;i++) {
			System.out.print(arr2[i]+" ");
		}
		int[] mergedArray =new int[n1+n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1 + 0, n2);
		System.out.println("\n\nMerged Array:");
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(mergedArray[i]+" ");
		}
	}
	

}
