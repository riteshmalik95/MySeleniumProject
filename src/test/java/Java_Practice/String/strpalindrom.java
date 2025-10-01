package String;

import java.util.Scanner;

public class strpalindrom {

	public static void main(String[] args) {
		String rev="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scanner.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		

	}

}
