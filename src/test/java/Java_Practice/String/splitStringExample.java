package String;

public class splitStringExample {

	public static void main(String[] args) {
		//String with multiple white spaces
		String str="i am a java developer";
		
		//Split string into words using whitespace as Delimiter
		String[] words=str.split("\\s+");
		
		//Print each word
		for(String word:words) {
			System.out.println(word);
		}

	}

}
