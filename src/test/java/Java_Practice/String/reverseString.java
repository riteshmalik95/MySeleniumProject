package String;

public class reverseString {

	public static void main(String[] args) {
		String temp="";
		String str="india";
        for (int i=str.length()-1;i>=0;i--) {
        	temp=temp+str.charAt(i);
        }
        System.out.println("Reversed String :"+temp);
	}
	}


