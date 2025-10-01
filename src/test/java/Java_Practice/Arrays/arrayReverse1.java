package Arrays;

import java.util.Scanner;

public class arrayReverse1 {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the size of Array:");
	 int n=scanner.nextInt();
	 int[] arr =new int[n];
	 System.out.println("Enter the elements of the Array:");
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scanner.nextInt();
	 }
	 System.out.println("Generated Array:");
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println("\n\nReversed Array:");
	 for(int i=arr.length-1;i>=0;i--) {
		 System.out.print(arr[i]+" "); 
	 }
	}

}
