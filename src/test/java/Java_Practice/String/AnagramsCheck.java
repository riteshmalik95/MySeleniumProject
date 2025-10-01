package String;

import java.util.Arrays;

public class AnagramsCheck {

	public static void main(String[] args) {
		String str1="ritesh";
		String str2="hestir";
		if(isAnagram(str1,str2)) {
			System.out.println(str1+" and "+str2+" are anagrams. ");
		}else {
			System.out.println(str1+" and "+str2+" are not anagrams. ");
		}

	}

	private static boolean isAnagram(String str1, String str2) {
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

}
