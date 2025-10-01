package Practice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int n = 123456;
		int rev = 0;
		System.out.println("My Number:" + n);
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;

		}
		System.out.println("Reversed" + rev);
	}

}
