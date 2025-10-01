package Homework;

import Practice.interface1;

public class SpecialString {

	public static void main(String[] args) {
		String s1 = "aabaccdeaabb";
		char[] arr = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
		 int count=1;
		 if(arr[i]=='*')
			 continue;
		 
		 for(int j=i+1;j < s1.length(); j++) {
			 if(arr[i]==arr[j]) {
				count++;
				arr[j]='*';
			 }
		 }
		System.out.println(arr[i]+"--->"+count); 
	}

}
}