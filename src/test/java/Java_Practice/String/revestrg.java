package String;

public class revestrg {

	public static void main(String[] args) {
		String str1 = "Elegant";
		String box = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			box = box + str1.charAt(i);
		}
		System.out.println("Reversed String:" + box);
	}

}
