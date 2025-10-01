package String;

public class removeWhiteSpace {

	public static void main(String[] args) {
		String str="hello java";
		String result=str.replaceAll("\\s", "");
		System.out.println("String without whitespaces:"+result);

	}

}
