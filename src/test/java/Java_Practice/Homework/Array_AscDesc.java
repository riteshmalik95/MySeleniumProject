package Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import Practice.interface1;



public class Array_AscDesc {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Size of the Array:");
	int s=sc.nextInt();
	Integer[] arr = new Integer[s];
	System.out.println("Enter Array Elements:");
	for(int i=0;i<s;i++) {
		arr[i]=sc.nextInt();
	}
	//Ascending Order
	Arrays.sort(arr);
	System.out.println("Ascending:"+Arrays.toString(arr));
	
	//Descending Order
	   Arrays.sort(arr,Collections.reverseOrder());
	   System.out.println("Descending:"+Arrays.toString(arr));

	}

}
