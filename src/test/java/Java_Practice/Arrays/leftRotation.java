package Arrays;

import java.util.Scanner;

public class leftRotation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Elements:");
		int[] arr =new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		//Perform Rotation by 1
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		} 
        arr[arr.length-1]=first;
        System.out.println("Array after Rotation:");
        for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		} 
        
	}

}
