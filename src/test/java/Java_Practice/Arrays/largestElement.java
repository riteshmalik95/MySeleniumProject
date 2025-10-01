package Arrays;

import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Elements:");
        int[] arr =new int [5];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scanner.nextInt();
        }
        System.out.println("Required Array:");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        } 
        int larg=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>larg) {
        		larg=arr[i];
        	}
        	
        }
        System.out.print("\n\nLargest Element:"+larg);
	}

}
