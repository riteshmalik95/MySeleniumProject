package _Methods;

public class TestMethods {

	int a=43;//instance var
	static int b=78;//static
	
	void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	static void m2() {
		
		
		System.out.println(b);
	}
	public static void main(String[] args) {
		TestMethods d=new TestMethods();
		System.out.println(d.a);
		System.out.println(b);
		d.m1();
		m2();
	}
	
}
