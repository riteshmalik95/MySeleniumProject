package String;

public class TotalWords {

	public static void main(String[] args) {
		String str="first program of java";
		String[] words=str.split("\\s+");
		for (String word:words) {
			System.out.println(word);
		}
		System.out.println("Number of Words:"+words.length);

	}

}
