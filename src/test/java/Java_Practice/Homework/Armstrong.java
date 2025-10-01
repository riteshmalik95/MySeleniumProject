package Homework;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int num = sc.nextInt();
//
//		int orgnum = num;
//		int res = 0;
//		int n = String.valueOf(num).length();
//		while (num != 0) {
//
//			int d = num % 10;
//			res = (int) (res + Math.pow(d, n));
//			num /= 10;
//		}
//		if (orgnum == res) {
//			System.out.println("Armstrong Number");
//		} else {
//			System.out.println("Not Armstrong Number");
//		}
		for(int num=1;num<=1000;num++) {
		int orgnum = num;
		int res = 0;
		int n = String.valueOf(num).length();
		int temp=num;
		while (temp != 0) {

			int d = temp % 10;
			res = (int) (res + Math.pow(d, n));
			temp /= 10;
		}
		 if (orgnum == res) {
             System.out.println(orgnum);
         }
	}
}
}
//different methods to find number of digits in a number(or digit count)