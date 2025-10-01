package codes_practice;

import java.util.Scanner;

public class _leapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
//		int year = 2024;
		if ((year % 4 == 0) && (year % 100!= 0) || (year % 400 == 0)) {
			System.out.println("leap year");

		} else {
			System.out.println("Not a Leap year");
		}
	}

}
