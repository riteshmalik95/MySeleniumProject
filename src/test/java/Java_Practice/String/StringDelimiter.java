package String;

public class StringDelimiter {

	public static void main(String[] args) {
		String str="new ,programming ,technique";
		//split the string based on a Delimiter
		String[] result=str.split(",");
		for(String newstring:result) {
			System.out.print(newstring);
		}

	}

}
