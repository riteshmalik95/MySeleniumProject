package String;

public class CountVowels1 {

	public static void main(String[] args) {
		String str="ritesh";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("Number of Vowels:"+count);
	}

}
