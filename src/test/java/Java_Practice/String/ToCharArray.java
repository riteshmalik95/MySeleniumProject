package String;

public class ToCharArray {

	public static void main(String[] args) {
		String str="pgdac";
//		str.charAt(0)="a";
		char[] ch=str.toCharArray();
		System.out.println(ch);
		ch[0]='a';
		
		String rep=str.replace('g','c');
      System.out.println(rep);
	}
}
