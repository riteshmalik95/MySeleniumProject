package String;

public class characterFrequency {

	public static void main(String[] args) {
		String str="hello world";
		char ch='o';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Character Frequency:"+count);		

	}

}
