package AutomationClass;

public class String3 {

	public static void main(String[] args) {
		//Immutable Class
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3="Java";
		String s4= "By";
		String s5= "Java";
		String s6= "Hello";
		String s7= "By";
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		System.out.println(s4==s7);
		System.out.println(s4.equals(s7));
		System.out.println(s6==s2);
		System.out.println(s6.equals(s2));
		
		
		

	}

}
