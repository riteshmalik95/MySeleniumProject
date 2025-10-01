package Arrays;

import java.util.Scanner;

public class duplicateArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Elements:");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Created Array:");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("\n\nDuplicate Element:"+arr[i]);
				}
			}
		}
	}
//[1,2,5,3,4,5]
}
