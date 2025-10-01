//Now we are going to make a user-defined array and also want to 
//find out the sum of the Required Array.
package Arrays;

import java.util.Scanner;

public class arraySum2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		// Print the Newly Created Array
		System.out.println("Newly Created Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Print the sum of the required Array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\n\nRequired sum :" + sum);
	}

}
