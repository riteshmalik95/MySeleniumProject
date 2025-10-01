package String;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:");
		int count = 0;
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}
		System.out.print("Number of Vowels:" + count);
	}

}
