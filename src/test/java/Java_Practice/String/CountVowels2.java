package String;

import java.util.Scanner;

public class CountVowels2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
        String str=scanner.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		count++;
        	}
        }
        System.out.println("Number of vowels:"+count);
	}

}
