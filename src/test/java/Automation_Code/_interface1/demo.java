package _interface1;

public class demo implements A {
//	 static void m1()
//	 {
//		 System.out.println("Hi");
//	 }
	public static void main(String[] args) {
		
       demo d1=new demo();
       d1.m2();
       A.m1();
       d1.m2();
//       A.m2(); not working becoz m2() is not static.
	}

}
